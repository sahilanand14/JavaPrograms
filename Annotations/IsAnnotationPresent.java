import java.lang.reflect.*;
import java.lang.annotation.*;

//annotation declaration
@Retention(RetentionPolicy.RUNTIME)
@interface demo
{
String name();
int number();

}


class IsAnnotationPresent
{

@demo(name="sahil anand",number=100)
public static void mymethod()
{
}

public static void main(String...s) throws Exception
{
System.out.println(IsAnnotationPresent.class.getMethod("mymethod").isAnnotationPresent(demo.class));
System.out.println(Class.forName("IsAnnotationPresent").getMethod("mymethod").isAnnotationPresent(demo.class));
System.out.println(new IsAnnotationPresent().getClass().getMethod("mymethod").isAnnotationPresent(demo.class));
System.out.println(new IsAnnotationPresent().getClass().getMethod("mymethod").getAnnotation(demo.class).name());



}


}