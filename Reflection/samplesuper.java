import java.lang.reflect.*;
import java.awt.*;
class samplesuper
{
public static void main(String...s)
{
Frame f=new Frame();
printsuperclasses(f);
}
public static void printsuperclasses(Object f)
{
Class c =f.getClass();
Class superr = c.getSuperclass();
while(superr!=null)
{

System.out.println(superr.getName());
c=superr;
superr=c.getSuperclass();

}



}





}