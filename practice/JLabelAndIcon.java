import javax.swing.*;
import java.awt.*;
class JLabelAndIcon
{
	JFrame jf;
	JLabel l1;
	ImageIcon ic;
	public static void main(String...s)
	{

   new JLabelAndIcon();
	}


	JLabelAndIcon()
	{
		jf=new JFrame("MyFrame");
		ic=new ImageIcon("D:\\New Folder\\resume\\RAR_files\\8E1 120Ohm.jpg");
		l1=new JLabel("Hello java",ic,JLabel.CENTER);
		jf.add(l1);
		jf.setLayout(new FlowLayout());
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);


	}
}