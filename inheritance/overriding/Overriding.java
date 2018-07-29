class Parent
{
	int x=10;


	public void show()
	{
		System.out.println("Parent's show method");
	}

	public static void showdata()
	{
		System.out.println("Parent's static showdata method");
	}


}

class Child extends Parent
{	

	//When child has same instance variable like parent it is called 'DATA SHADOWING'
	int x=100;

	public void show()
	{  //When a method has same local variable as instance variable then local variable hides instance variable. This is also called 'DATA SHADOWING'
		 int x=1000;
		System.out.println("child's show method");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	
	}


	//When child class has same static method as parent it is called 'FUNCTION HIDING'	
	public static void showdata()
	{
		System.out.println("child's static showdata method");
	}


}

class Overriding
{
	public static void main(String[] args) {
		
		// The type of reference variable determines the methods that can be called
		// on that reference variable not the type of the object it points to.
		
		Parent p=new Child(); //upcasting (only possible in case of parent child relationship)
		p.show(); //child show
		p.showdata(); //parent showdata
		System.out.println(p.x); //parent x









	}
}

/*

Summary:

1. Polymorphic method invocations apply only to instance methods. You can
	always refer to an object with a more general reference variable type (a su-
	perclass or interface), but at runtime, the ONLY things that are dynamically
	selected based on the actual object (rather than the reference type) are instance
	methods. Not static methods. Not variables. Only overridden instance meth-
	ods are dynamically invoked based on the real object's type.

*/