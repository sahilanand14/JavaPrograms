import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.net.*;
import javax.swing.border.*;
class MyClient
{
    Socket s;
    DataInputStream din;
    DataOutputStream dout;
    JFrame jf;
    JTextArea displayTextArea, sendTextArea;
    JButton sendButton, loginButton, logoutButton, exitButton;
    JScrollPane jcp, jcp1, jcp2;
    JLabel l1, l2, l4;
    JList currentlyOnline;



    MyClient()
    {
        makeGUI();




    }
    public void makeGUI()
    {
        jf = new JFrame("Client");

        displayTextArea = new JTextArea();
        displayTextArea.setEditable (false);
        displayTextArea.setLineWrap(true);
        displayTextArea.setWrapStyleWord(true);
        jcp = new JScrollPane(displayTextArea);
        jcp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jcp.setBounds(10, 25, 365, 200);
        jf.add(jcp);


        currentlyOnline = new JList();
        jcp1 = new JScrollPane(currentlyOnline);
        jcp1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jcp1.setBounds(400, 25, 100, 200);
        jf.add(jcp1);



        sendTextArea = new JTextArea();
        sendTextArea.setEditable (true);
        sendTextArea.setLineWrap(true);
        sendTextArea.setWrapStyleWord(true);
        jcp2 = new JScrollPane(sendTextArea);
        jcp2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jcp2.setBounds(10, 300, 365, 50);
        jf.add(jcp2);



        l1 = new JLabel("Online:");
        l1.setBounds(400, 10, 60, 10);
        jf.add(l1);
        l2 = new JLabel("Received Messages:");
        l2.setBounds(10, 10, 150, 14);
        jf.add(l2);
        l4 = new JLabel("Your Message:");
        l4.setBounds(10, 285, 150, 14);
        jf.add(l4);



        sendButton = new JButton("SEND");
        sendButton.setBounds(400, 300, 80, 47);
        sendButton.addActionListener(new SendButtonListener());
        jf.add(sendButton);

        loginButton = new JButton("LOGIN");
        loginButton.setBounds(10, 400, 80, 40);
        loginButton.addActionListener(new SendButtonListener());
        jf.add( loginButton);


        logoutButton = new JButton("LOGOUT");
        logoutButton.setBounds(110, 400, 80, 40);
        logoutButton.addActionListener(new SendButtonListener());
        logoutButton.setEnabled(false);
        jf.add(logoutButton);


        exitButton = new JButton("EXIT");
        exitButton.setBounds(210, 400, 80, 40);
        exitButton.addActionListener(new SendButtonListener());
        jf.add(exitButton);



        jf.setBounds(00, 00, 520, 460);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }

    public void clientChat(String uname)
    {
        try
        {
            s = new Socket("localhost", 10);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            MyThread1 m = new MyThread1(din, this); //start a new Thread for each client to receive data send by server.
            m.start();

            dout.writeUTF(uname);
            jf.setTitle(uname + " Chat Window");
        }
        catch(Exception e) {}
        logoutButton.setEnabled(true);
        loginButton.setEnabled(false);
    }

    public static void main(String []args)
    {
        new MyClient();
    }

    public class SendButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton temp = (JButton)e.getSource();
            if(temp == sendButton)
            {
                if(s == null)
                {
                    JOptionPane.showMessageDialog(jf, "u r not logged in. plz login first");
                    return;
                }
                try
                {
                    dout.writeUTF(sendTextArea.getText());
                    dout.flush();
                }
                catch(Exception ee) {}
                sendTextArea.setText("");
                sendTextArea.requestFocus();
            }

            if(temp == loginButton)
            {
                String uname = JOptionPane.showInputDialog(jf, "Enter Your nick name: ");
                if(uname != null)
                    clientChat(uname);
            }


            if(temp == logoutButton)
            {
                if(s != null)
                    logoutSession();
            }
            if(temp == exitButton)
            {
                if(s != null)
                {
                    JOptionPane.showMessageDialog(jf, "u r logged out right now. ", "Exit", JOptionPane.INFORMATION_MESSAGE);
                    logoutSession();
                }
                System.exit(0);
            }




        }

        public void logoutSession()
        {
            if(s == null) return;
            try
            {
                dout.writeUTF(MyServer.LOGOUT_MESSAGE);
                Thread.sleep(500);
                s = null;
            }
            catch(Exception e) {}

            logoutButton.setEnabled(false);
            loginButton.setEnabled(true);
            jf.setTitle("Login for Chat");
        }
    }


    //This thread is responsible to read messages comming from Server while the Main thread is responsible to send messages to the server.
    // Hence on client side we have 2 threads running: One to receive incomming messages and one to send messages.

    class MyThread1 extends Thread
    {
        DataInputStream d1;
        MyClient client;
        MyThread1(DataInputStream d1, MyClient client)
        {
            this.d1 = d1;
            this.client = client;
        }
        public void run()
        {


            String s2 = "";
            do
            {
                try
                {
                    s2 = d1.readUTF();
                    if(s2.startsWith(MyServer.UPDATE_USERS))
                        updateUsersList(s2);
                    else if(s2.equals(MyServer.LOGOUT_MESSAGE))
                        break;
                    else
                        client.displayTextArea.append("\n" + s2);

                }
                catch(Exception e) {}
            }
            while(true);



        }

        public void updateUsersList(String ul)
        {
            Vector ulist = new Vector();

            ul = ul.replace("[", "");
            ul = ul.replace("]", "");
            ul = ul.replace(MyServer.UPDATE_USERS, "");
            StringTokenizer st = new StringTokenizer(ul, ",");

            while(st.hasMoreTokens())
            {
                String temp = st.nextToken();
                ulist.add(temp);
            }
            client.currentlyOnline.setListData(ulist);
        }
    }
}
