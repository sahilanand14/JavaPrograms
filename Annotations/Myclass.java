import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
 @interface Myanno1
{
int value();
}


public class Myclass
{
@Myanno1(44)
Myclass()
{System.out.println("Welcome to myclass");}

public static void main(String...s) throws Exception
{

mymeth();
}

public static void mymeth() throws Exception
{

Class c=Myclass.class;
System.out.println(c.getName());
Constructor c1=c.getDeclaredConstructor();
Myanno1 a1=(Myanno1)c1.getAnnotation(Myanno1.class);
System.out.println(a1.value());
}


}

