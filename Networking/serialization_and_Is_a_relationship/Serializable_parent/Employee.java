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
class NotSerialized implements Serializable
{
	int salary=500;
	public NotSerialized()
	{	
		System.out.println("Constructor of not serialised class");
	}
}