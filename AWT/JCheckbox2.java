import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class JCheckbox2 extends JFrame implements ActionListener
{
    JCheckBox cb1,cb2,cb4,cb5;
    JLabel l1,l2;
    JButton b;
public static void main(String...s)
{new JCheckbox2();}

JCheckbox2()
{ cb1=new JCheckBox("Pizza @ 400");cb2=new JCheckBox("Parantha @ 40");cb4=new JCheckBox("maggi @ 600");cb5=new JCheckBox("Pasta @ 500");
    add(cb1);add(cb2);add(cb4);add(cb5);
    b=new JButton("Order");add(b);
    setSize(400,400);
    l1=new JLabel("Total amount:");
    l2=new JLabel();
    add(l1);add(l2);
    b.addActionListener(this);
    setLayout(new FlowLayout());
    setVisible(true);

}

public void actionPerformed(ActionEvent e)
{
int amount=0;
String s="";

if(cb1.isSelected())
{amount+=400;
 s+="Pizza:400\n";}
if(cb2.isSelected())
{amount+=40;
s+="Parantha:40\n";}
if(cb4.isSelected())
{amount+=600;
s+="maggi:600\n";}
if(cb5.isSelected())
{amount+=500;
s+="Pasta:500\n";}
l2.setText(s+"Total amount:"+amount);

}

}