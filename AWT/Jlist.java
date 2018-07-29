import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
class Jlist implements ListSelectionListener,ActionListener
{
  JFrame f;
  JList list;
  JLabel l1,l2;
  JScrollPane jsp;
  JButton b1;



	Jlist()
	{
		f=new JFrame("S");
		list=new JList(new String[]{"java","php","javascript"});
		list.addListSelectionListener(this);
		l1=new JLabel();
		jsp=new JScrollPane(list);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		f.add(jsp);
      
		f.add(l1);
		l2=new JLabel();
		f.add(l2);
		b1=new JButton("show");
		b1.addActionListener(this);
		f.add(b1);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);


	}
	public static void main(String []args)
	{
         new Jlist();
	}
	public void valueChanged(ListSelectionEvent e)
	{   
		l2.setText("");
		l1.setText(list.getSelectedValue().toString());

	}
   public void actionPerformed(ActionEvent e)
   {
   	l2.setText(list.getSelectedValue().toString());
   }
}