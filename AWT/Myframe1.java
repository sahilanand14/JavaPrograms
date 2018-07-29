import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Myframe1 implements ActionListener
{
	JFrame f1;
	JTextField tf1,tf2,tf4;
	JButton jb1,jb2,jb4;

	Myframe1(String d)
	{
		f1=new JFrame(d);
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		 tf4=new JTextField(10);
		jb1=new JButton("Encode");
		jb2=new JButton("Decode");
		jb4=new JButton("reset");
       
     
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb4.addActionListener(this);
		f1.add(tf1);
		f1.add(tf2);
		f1.add(tf4);
		f1.add(jb1);
		f1.add(jb2);
		f1.add(jb4);
		f1.setLayout(new FlowLayout());
		f1.setSize(400,400);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==jb1)
		{
			int num1=Integer.parseInt(tf1.getText());
			int num2=Integer.parseInt(tf2.getText());
			int c=num1+num2;
			tf4.setText(String.valueOf(num1+num2));
			
		}
		// if(e.getSource()==jb2)
		// 	{ String str=tf1.getText();
		// 		for(int i=0;i<str.length();i++)
		// 		 String str1+=(char)(str.charAt(i)+1);



		// 	 tf2.setText(str1);}
		// if(e.getSource()==jb4)
		// 	{tf1.setText("");tf2.setText("");}
	}
		public static void main(String...s)
		{
			new Myframe1("sahil");
		}
}