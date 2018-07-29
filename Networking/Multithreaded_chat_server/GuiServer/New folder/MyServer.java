import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.net.*;
import javax.swing.border.*;
import java.util.*;
class MyServer
{
    Socket s1;
    ServerSocket ss;
    ArrayList<Socket> al;
    ArrayList<String> activeUsers;
    public final static int PORT = 10; //Port on which this application is running on Server.
    public final static String UPDATE_USERS = "updateuserslist:";
    public final static String LOGOUT_MESSAGE = "@@logoutme@@:";

    public static void main(String...s)
    {
        new MyServer();
    }

    MyServer()
    {
        System.out.println("Server Started!!");
        try
        {
            al = new ArrayList<Socket>();
            activeUsers = new ArrayList<>();
            ss = new ServerSocket(10);      //A ServerSocket is created to listen to client requests comming on Port 10;

            while(true)
            {
                s1 = ss.accept();               //ServerSocket returns a new Socket that is Connected to the client's Socket. The returned
                // Socket is on a different Port so that the ServerSocket can go back to take other client requests.
                System.out.println("Client Connected");

                MyThread tt = new MyThread(al, s1, activeUsers); //Server starts a new Thread for each client passing the client's Socket, List of names of
                // active users, and List of Sockets of multiple clients connected to the server.

                tt.start();



            }//end of while loop

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class MyThread extends Thread
{
    ArrayList<Socket> al;
    Socket s4;
    ArrayList<String> activeUsers;
    String username;
    MyThread(ArrayList<Socket> al, Socket s4, ArrayList<String> activeUsers)
    {
        this.al = al;
        this.s4 = s4;
        this.activeUsers = activeUsers;
        try
        {
            DataInputStream dis = new DataInputStream(s4.getInputStream()); //Each  thread gets InputStream from client Socket to
            // receive messages sent by the client represented by this socket.

            username = dis.readUTF(); //read Client's name.
            al.add(s4);   //add client's socket to List.
            activeUsers.add(username);//add client's name to list.
            tellEveryOne("*** " + username + " Logged in at " + (new Date(System.currentTimeMillis())) + " ***"); //broadcasting to every client.
            sendNewUserList();//inform all clients about the new client.
        }
        catch(Exception e)
        {
            System.err.println("MyThread constructor  " + e);
        }

    }
    public void run()
    {
        String s1;
        try
        {
            DataInputStream dis = new DataInputStream(s4.getInputStream());
            do
            {
                s1 = dis.readUTF(); //read data send by client.
                if(s1.toLowerCase().equals(MyServer.LOGOUT_MESSAGE))   //if client clicks logout button.
                    break;

                tellEveryOne(username + " said: " + " : " + s1); //broadcast message to every connected client.
            }
            while(true);
            DataOutputStream tdos = new DataOutputStream(s4.getOutputStream()); //get OutputStrem connected to the client to send messages to client.
            tdos.writeUTF(MyServer.LOGOUT_MESSAGE);//send logout message to client.
            tdos.flush();
            activeUsers.remove(username);//remove client's name from active users List.
            tellEveryOne("*** " + username + " Logged out at " + (new Date()) + " ***"); //inform to all clients which client has disconnected.
            sendNewUserList();
            al.remove(s4);  //remove client's Socket from List.
            s4.close();

        }
        catch(Exception e)
        {
            System.out.println("MyThread Run" + e);
        }


    }
    public void sendNewUserList()
    {
        tellEveryOne(MyServer.UPDATE_USERS + activeUsers.toString());

    }

    //Broadcasts messages to all clients whose Socket are present in the List.
    public void tellEveryOne(String s1)
    {
        Iterator<Socket> i = al.iterator();
        while(i.hasNext())
        {
            try
            {
                Socket sc = i.next();


                DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
                dout.writeUTF(s1);
                dout.flush();

            }
            catch(Exception e) {}
        }
    }



}

