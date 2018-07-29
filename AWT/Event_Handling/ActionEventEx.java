import java.awt.*;
import java.awt.event.*;
class ActionEventEx
{
	Frame f;
	Button b1,b2;
	TextField tf1;


	public static void main(String args[])
	{
		new ActionEventEx();
	}
	ActionEventEx()
	{
		f=new Frame("Sahil");
		b1=new Button("ok");
		b2=new Button("cancel");
		tf1=new TextField(10);
		//b1.setBounds(10,10,20,20);
		//b2.setBounds(10,40,20,20);
		//tf1.setBounds(10,80,20,20);
		b1.addActionListener( new My());
		b2.addActionListener(new My());
		f.add(tf1);
		f.add(b1);
		f.add(b2);
		f.setLayout(new FlowLayout());
		f.setBounds(10,10,400,400);
		f.setVisible(true);
		//f.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
		
	}
	class My implements ActionListener
	{
		public void actionPerformed(ActionEvent ee)
		{   if(ee.getSource()==b1)
			tf1.setText("hello");
		}
	}

}