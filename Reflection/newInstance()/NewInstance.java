// Need of newInstance(): I will give name of class by command line argument and i want the object of that class should be created. This can only be done by using newInstance().
// Class class newInstance(): public T newInstance() 
// Constructor class newInstance():public T newInstance(Object ... initargs)
//getDeclaredConstructor() can return public as well as private constructor whereas getConstructor only returns public constructors.
//same is true for getFields() and getDeclaredFields(), getMethods() and getDeclaredMethods().

// public Object invoke(Object obj, Object... args)
//this method of Method class is used to invoke a method at runtime
// If the method of the class doesn’t accepts any 
// parameter then null is passed as argument.

import java.lang.reflect.*;
class NewInstance
{
	public static void main(String...s)
	{
		try{
				String str=String.class.newInstance();
				// String str2=String.class.newInstance("hello"); this line gives error as newInstance() method of class Class dosen,t take arguments.
				String str1=String.class.getDeclaredConstructor(String.class).newInstance("hello");//this is fine as newInstance() method of Constructor class can take arguments.


			Class cl = Class.forName("MyClass");

			//Below statement will give error if default constructor is not present in our class.
			MyClass obj =(MyClass)cl.newInstance();    //public Object newInstance() throws InstantiationException

			// below statement will give error as Class class newInstance method can't take arguments to call parametrized constructor 
			// MyClass obj =(MyClass)cl.newInstance(10); 
			 
			obj.show();

			//Constructor c=cl.getConstructor(int.class); this gives error as getConstructor can access private constructor.
			Constructor c=cl.getDeclaredConstructor(int.class);
			
			//Below statement makes private constructor of MyClass accessible.
			c.setAccessible(true);
			MyClass obj2=(MyClass)c.newInstance(10);
			obj2.show();

			Method m=cl.getDeclaredMethod("add",int.class,int.class);
			m.setAccessible(true);
			Integer q=(Integer)m.invoke(new MyClass(),10,5);
			System.out.println(q);
			int w=q.intValue(); //unboxing
			System.out.println(w);	
			}
			catch(Exception e){e.printStackTrace();}
			
	}
}

class MyClass

{
	MyClass()
	{
		System.out.println("default constructor of MyClass");
	}
	 private MyClass(int x)
	{
		System.out.println("parametrized constructor of MyClass");
	}
	public void show(){System.out.println("In show Method");}

	private int add(int a,int b){return a+b;}
}