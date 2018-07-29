class AnonymousClass
{  static int x=8;
public static void main(String...s)
{

	// inner anonymous class that extends a class
	Thread t=new Thread(){
		public void run()
		{
			System.out.println(Thread.currentThread().getName());
		}

		public void show()
		{System.out.println("show");}
	};//here upcasting occurs object of class extending Thread class is created and its reference is store in Thread class object.
	t.start();
	// t.show(); gives error as show is not defined in Thread class.
	// Therefore we cant access personal methods of annonymous class by parent reference variable

// inner anonymous class that implements an interface

Runnable r=new Runnable(){
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+x);
	}
};
new Thread(r).start();


//inner annonymous class in argument

new Thread(new Runnable(){
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+x);
	}
}).start();




//accessing personal methods of annonymous class
new Thread(){
	

public void run()
{

}
public void show()
{
	System.out.println("In show");
}

}.show();

}

}


// NOTE: anonymous class name is outerclassname$number
