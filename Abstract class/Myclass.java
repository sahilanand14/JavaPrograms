 abstract /*final   Note: Abstract class can't be final   */ class Myclass
{

	//this gives error as abstract methods can't be static

	//static abstract  void foo();  
	

	//static methods are allowed in abstract classes
	static void foo(){};


	//Static final variables are allowed
	static final int y=90;


	//final variables are also allowed.
	final int z=8;

	//statci data members are also allowed
	static int x;

	//main method is allowed in abstract class
	public static void main(String...s) 
	{}

	//Constructors are also allowed
	Myclass()
	{}
}


// NOTE: It is also possible that abstract class dosen't contain any abstract methods.