
import java.lang.reflect.*;
import java.awt.*;
class samplefields
{
public static void main(String...s)
{
Color str=new Color(1,1,1);
printfields(str);
}
public static void printfields(Object o)
{
Class c=o.getClass();
Field f[]=c.getFields();
for(int i=0;i<f.length;i++)
{
Class type=f[i].getType();
System.out.print(type.getName()+" ");
System.out.print(f[i].getName()+";");
System.out.println();
}
}

}