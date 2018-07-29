import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Jradiobutton implements ActionListener,ItemListener
{
	JRadioButton rb1,rb2,rb4;
	JFrame f;
	ButtonGroup jbg;
	JButton j;
	JLabel l1,l2;
  
	public static void main(String...s)
	{
		new Jradiobutton();
	}
	Jradiobutton()
	{ f=new JFrame("myframe");
	rb1=new JRadioButton("Java");
	rb2=new JRadioButton("php");
	rb4=new JRadioButton("c++");
    jbg=new ButtonGroup();
    jbg.add(rb1);jbg.add(rb2);jbg.add(rb4);
    f.add(rb1);f.add(rb2);f.add(rb4);
    l1=new JLabel();
    l2=new JLabel();
   
   


    f.add(l2);
    f.add(l1);
    rb1.addItemListener(this);
    rb2.addItemListener(this);rb4.addItemListener(this);
    f.setSize(400,400);
    j=new JButton("Submit");
    f.add(j);
    j.addActionListener(this);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent ev)
	{// JRadioButton jb=(JRadioButton)ev.getItem();
		if(rb1.isSelected())
			l1.setText(rb1.getText()+" is selected");
if(rb2.isSelected())
			l1.setText(rb2.getText()+" is selected");
if(rb4.isSelected())
			l1.setText(rb4.getText()+" is selected");



	}
  public void itemStateChanged(ItemEvent ev)
  {
  	JRadioButton jb=(JRadioButton)ev.getItem();
  	if(jb.isSelected())
  	{
  		l2.setText(jb.getText()+" is selected");
  	  }
    
  	}

}