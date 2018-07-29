import java.io.*;
class Employee extends NotSerialized implements Serializable
{
	String name;
	int age;
   /* int salary;   inherited data member*/
	Employee(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	public void show()
	{
		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("SALARY: "+salary);
	}




}
class NotSerialized 
{
	int salary=500;
	public NotSerialized()
	{	
		System.out.println("Constructor of not serialised class");
	}


	//Non serializable class must have a no-argument constructor either directly or indirectly which gets executed during deserialization.
}

/*
*
*
*


If you are a serializable class, but your superclass is NOT serializable, then any
instance variables you INHERIT from that superclass will be reset to the values they
were given during the original construction of the object. This is because the non-
serializable class constructor WILL run!

In fact, every constructor ABOVE the first non-serializable class constructor will
also run, no matter what, because once the first super constructor is invoked, (during
deserialization), it of course invokes its super constructor and so on up the inheritance
tree.

*/