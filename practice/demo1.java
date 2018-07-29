import java.lang.reflect.*;
class Demo2
{
public static void print()
{
	System.out.println("You found me");
}
}
class Demo1
{
	public static void main(String...s) throws Exception
	{
		Method m=Class.forName("Demo2").getDeclaredMethod("print");
		
		m.invoke(new Demo2());
	}
}