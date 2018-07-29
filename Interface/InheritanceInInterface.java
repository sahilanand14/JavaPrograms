class InheritanceInInterface implements My1
{
 int x=10;
 int y=20;
public static void main(String[] args) {
	
 My1 m1=new InheritanceInInterface();
 m1.show();
 //This line also gives error as we cant call child's personal  data member. 
 
 // System.out.println(m1.x);
System.out.println(m1.y);  //prints 200.  This proves that data members of interface are by default Final and Static


}

//If we override show() in our class then our class method will be called.

//  public void show()
// {
// 	System.out.println("In main show");
// }



}


interface My1 extends My2
{   int y=200;
	//My1 inherits show() from My2 but also defines its own show() method.
	// Here Function overwriding  will be done. no error
  default void show()    
 {
 	System.out.println("In interface my1");

 }


}
 

interface My2 
{

default void show()
{
	System.out.println("In Interface my2");
}


}

// RULE:1) if a child class is getting same default method from more than 1 interfaces then it has to override that method otherwise its a 
// compilation error
// 2) if an interface is getting same default method from more than 1 interfaces then it has to override that method otherwise its a 
// compilation error