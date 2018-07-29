import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class JCheckBox implements ItemListener
{
 JFrame f;
 JCheckBox cb1,cb2,cb4,cb5;
 JLabel l1,l2;



public static void main(String...s)
{
	new JCheckbox();
}
JCheckbox()
{f=new JFrame("Myframe");
 cb1=new JCheckBox("JAVA",true);
cb2=new JCheckBox("C++");cb4=new JCheckBox("C");cb5=new JCheckBox("PHP");
l1=new JLabel();l2=new JLabel();
f.add(cb1);f.add(cb2);f.add(cb4);f.add(cb5);f.add(l1);f.add(l2);
f.setSize(400,400);
f.setLayout(new FlowLayout());
f.setVisible(true);
cb1.addItemListener(this);cb2.addItemListener(this);cb4.addItemListener(this);cb5.addItemListener(this);

}
public void itemStateChanged(ItemEvent e)
{ JCheckBox cb=(JCheckBox)e.getItem();
if(cb.isSelected())
l1.setText(cb.getText()+" is selected");
else
l1.setText(cb.getText()+" is deselected");

}


}