import java.awt.*;
class Myframe 
{  Frame f;
    Label l;
Myframe(String a)
{f=new Frame();
 f.setTitle(a);
f.setSize(200,200);

f.setVisible(true);
l=new Label("hello");
//l.setSize(200,200);
l.setBounds(20,20,20,20);
f.add(l);
f.setLayout(null);

}
public static void main(String...s)
{
new Myframe("sahil");

}



}