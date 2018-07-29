import java.lang.reflect.*;
class samplemodifiers
{
public static void main(String...s)
{
String str=new String();
printmodifiers(str);
}
public static void printmodifiers(Object o)
{
Class c=o.getClass();
int m=c.getModifiers();

  if(Modifier.isPublic(m))
    System.out.println("Public");
  if(Modifier.isPrivate(m))
    System.out.println("Private");
  if(Modifier.isFinal(m))
    System.out.println("Final");
  if(Modifier.isAbstract(m))
    System.out.println("Abstract");
  if(Modifier.isNative(m))
     System.out.println("Native");
  if(Modifier.isProtected(m))
     System.out.println("Protected");
  if(Modifier.isTransient(m))
     System.out.println("Transient");
  if(Modifier.isStatic(m))
     System.out.println("Static");
  if(Modifier.isVolatile(m))
     System.out.println("Volatile");
  if(Modifier.isSynchronized(m))
     System.out.println("Synchronized");
  if(Modifier.isInterface(m))
     System.out.println("Interface");


}


}