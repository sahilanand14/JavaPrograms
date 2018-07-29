class Default
{
	public static void main(String[] args) 
	{
		My m=new My(){}; //Here we create an anonymous class implementing My interface and return an instance of that anonymous class.
		
		m.show();  //as we have not overriden show in our anonymous class , show method of parent will be called.


	}
}


interface My
{
	default void show()
	{
		System.out.println("show in interface my");
	}


}


Need of default methods:

// DEFAULT METHODS ARE USED TO ADD FUNCTIONALITY TO AN INTERFACE WITHOUT AFFECTING THE IMPLEMENTATION CLASSES.