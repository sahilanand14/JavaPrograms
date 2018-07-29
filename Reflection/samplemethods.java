import java.lang.reflect.*;
class samplemethods
{
public static void main(String...s)
{
String str=new String();
printmethods(str);
System.out.println("lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll");
printconstructors(str);
}
public static void printmethods(Object o)
{
Class c=o.getClass();
System.out.println(c.getPackage().getName());   //gets package name
Method m[]=c.getMethods();
for(int i=0;i<m.length;i++)
{
System.out.print(m[i].getReturnType().getName()+" "+m[i].getName()+"(");     //prints return type and name of method
Class type[]=m[i].getParameterTypes();
for(int k=0;k<type.length;k++)
System.out.print(type[k]+",");                                               //prints type of argument
System.out.print(")");
System.out.println();

}
}
public  static void printconstructors(Object o)
{
Class c=o.getClass();
Constructor cs[]=c.getConstructors();
for(int i=0;i<cs.length;i++)
{
System.out.print(c.getName());
System.out.print("(");
Class type[]=cs[i].getParameterTypes();

for(int j=0;j<type.length;j++)
System.out.print(type[j].getName()+",");


System.out.print(")"+";");
System.out.println();
}



}

}