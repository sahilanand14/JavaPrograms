class Parent
{
int x=10;
void show()
{
System.out.println("in parent show");
}
Parent()
{
	System.out.println("parent constructor");
}


}


class Child extends Parent
{
int x=20;       //this is "DATA HIDING" where a child class data member hides parent class data member.

Child()
{   //super();
	System.out.println("child constructor");
}
public static void main(String...s)
{
new Child().show();
}
 // here we want to extend functionality of show. therefore we override it. Moreover, we want to do the task 
 // previously done by show also. therefore we call parent  version of show from child show using super.
@Override  //this is marker annotation present in java.lang package.
void show()        
{ super.show(); 
System.out.println(x);
System.out.println(this.x);// childs x value
System.out.println(super.x); //parent x value
System.out.println(this);// child reference id

//this wil give error. Therefore super can only be first line in a function.
//super.show(); 


}

}