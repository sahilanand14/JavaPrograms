import java.awt.*;
import java.applet.*;
/*
<applet code="Hello" width=100 height=80>
</applet>
*/
public class Hello extends Applet {
public void paint(Graphics g) {
g.drawString("Hello Applet", 20, 20);
}
}