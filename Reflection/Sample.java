import java.lang.reflect.*;
import java.util.*;
class Sample
{

 public static void main(String[] args)  throws Exception{
System.out.println("Enter fully qualified class name whose info u need to get");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
Class c=Class.forName(s);
System.out.println(Modifier.toString(c.getModifiers()));
System.out.println("\n\n");
System.out.println("Data Memebers:\n\n");
Field []f=c.getFields();
for(int i=0;i<f.length;i++)
{	System.out.println(Modifier.toString(f[i].getModifiers())+" "+f[i].getType().getName()+" "+f[i].getName());
	System.out.println(f[i].toString());
}
System.out.println("Methods:\n\n");
Method []m=c.getDeclaredMethods();
for(int i=0;i<m.length;i++)
{   
	System.out.print(Modifier.toString(m[i].getModifiers())+" "+m[i].getReturnType().getName()+" "+m[i].getName());
	Class[] t=m[i].getParameterTypes();
	System.out.print("( ");
	for(int j=0;j<t.length;j++)
	{
		System.out.print(t[j].getName()+" ,");
	}
	System.out.println(") ");
}
System.out.println("Constructors:\n\n");
Constructor co[]=c.getDeclaredConstructors();
for(int i=0;i<co.length;i++)
{
   System.out.print(co[i].getName());
   System.out.print("( ");
   
   Class []types=co[i].getParameterTypes();
   for(int j=0;j<types.length;j++)
   {
   	System.out.print(types[j].getName()+" ,");
   }
System.out.println(" )");
}
}

}