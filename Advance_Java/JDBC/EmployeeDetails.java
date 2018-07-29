import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
import java.io.*;
class EmployeeDetails implements ActionListener
{
	JFrame jf;
	JLabel lab1,lab2;
	JButton b1,b2;
	JTextField tf1;
	EmployeeDetails(String name)
	{
		jf=new JFrame(name);
		lab1=new JLabel("Enter Employee ID");
		tf1=new JTextField(20);
        jf.add(lab1);
        jf.add(tf1);
        b1=new JButton("LOGIN");
        b2=new JButton("REGISTER");
        jf.add(b1);
        jf.add(b2);
		jf.setSize(400,400);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}

	public static void main(String...s) throws Exception
	{
		new EmployeeDetails("frame");

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try{
				Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","sahil123");
                PreparedStatement ps=con.prepareStatement("select * from employee where id=? ");
                ps.setInt(1,Integer.parseInt(tf1.getText()));
                ResultSet rs=ps.executeQuery();
                if(rs.next()==false)
                	{
                		JOptionPane.showMessageDialog(jf,"NOT REGISTERED!!");
                		tf1.setText("");
                	}
                	
                else
                	{ 
                ResultSetMetaData rsmd=rs.getMetaData();
                int col=rsmd.getColumnCount();
				JFrame jf1=new JFrame("Result");
                String data[][]={{rs.getString(1),String.valueOf(rs.getInt(2)),rs.getString(3),rs.getString(4),String.valueOf(rs.getInt(5))}};     
                String column[]={rsmd.getColumnName(1),rsmd.getColumnName(2),rsmd.getColumnName(3),rsmd.getColumnName(4),rsmd.getColumnName(5)};
                JTable jt=new JTable(data,column);
                jt.setBounds(30,40,200,300);  
                JScrollPane jsp=new JScrollPane(jt);
                jf1.add(jsp);
                jf1.setSize(500,500);
                jf1.setVisible(true);
                jf1.setLayout(null);
                	}

			}catch(Exception e1){}

		}
		if(e.getSource()==b2)
		{
			try{
				Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","sahil123");
                JFrame jf2=new JFrame("Register");
                jf2.setSize(500,500);
                JLabel label1,label2,label3,label4,label5;
                JTextField tf2,tf3,tf4,tf5,tf6;
                label1=new JLabel("Enter Name: ");
                label2=new JLabel("Enter id: ");
                label3=new JLabel("Enter dob: ");
                label4=new JLabel("Enter Department: ");
                label5=new JLabel("Enter Year of Joining: ");
                JButton jb=new JButton("Insert");
                tf2=new JTextField(20);
                tf3=new JTextField(20);
                tf4=new JTextField(20);
                tf5=new JTextField(20);
                tf6=new JTextField(20);
                jf2.add(label1);
                jf2.add(tf2);
                jf2.add(label2);
                jf2.add(tf3);
                jf2.add(label3);
                jf2.add(tf4);
                jf2.add(label4);
                jf2.add(tf5);
                jf2.add(label5);
                jf2.add(tf6);
                jf2.add(jb);
                jf2.setLayout(new FlowLayout());
                jf2.setVisible(true);
                jb.addActionListener(new ActionListener()
                	{
                		public void actionPerformed(ActionEvent eee)
                		{
                	        try{
                	 			PreparedStatement pstmt= con.prepareStatement("insert into employee values(?,?,?,?,?)");
                	
                 pstmt.setString(1,tf2.getText());
                pstmt.setInt(2,Integer.parseInt(tf3.getText()));
                pstmt.setString(3,tf4.getText());
                pstmt.setString(4,tf5.getText());
                pstmt.setInt(5,Integer.parseInt(tf6.getText()));
                pstmt.executeUpdate();
                jf2.dispose();

                             }catch(Exception w){}
            }});
                  
		}catch(Exception r){}
	}
	}
}
