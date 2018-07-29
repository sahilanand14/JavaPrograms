//this code breaks the singleton pattern.
import java.lang.reflect.*;
class Singleton
{
    private static Singleton object;
    static
    {
        object = new Singleton();
    }
    public static Singleton makeObject()
    {
        return object;
    }
    private Singleton() {}
}

class RunDemo
{
	public static void main(String[] args) throws Exception {
		

		Singleton obj1=Singleton.makeObject();
		Singleton obj2,obj3,obj4;
		Class clazz=obj1.getClass();
		Constructor c=clazz.getDeclaredConstructor();
		c.setAccessible(true);
		obj2=(Singleton)c.newInstance();
		obj3=(Singleton)c.newInstance();
		obj4=(Singleton)c.newInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		
	}
}