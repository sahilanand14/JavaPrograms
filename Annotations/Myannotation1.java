import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MethodAnnotation
{
String value();


}
class Myannotation1
{
@MethodAnnotation("India is a good country")
public static void mymeth() throws Exception
{
Class c=new Myannotation1().getClass();
Method m=c.getMethod("mymeth");
MethodAnnotation a=m.getAnnotation(MethodAnnotation.class);
System.out.println(a);

}

public static void main(String...s) throws Exception
{mymeth();}


}