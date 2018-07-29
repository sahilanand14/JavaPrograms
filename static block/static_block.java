//NOTE: class is loaded only once hence static block is also executed only once.
//Static block is executed before main function
//static block is executed at class loading time.
// Main purpose of static block is to initialise static data members of a class.
class static_block
{ static int x;
  static
{
try{

x=System.in.read(); //static block runs before main. Therefore after execution of static block x has been initialised.
}
catch(Exception e){}

}
  
 
public static void main(String...s)
{


}

}
class demo2
{
public static void main(String...s)
{

System.out.println(static_block.x);
System.out.println(static_block.x);
demo4.main("jj");

}
demo2()
{//System.out.println("in demo2"+super.x);
}
}



class demo4
{
public static void main(String...s)
{System.out.println(static_block.x);
System.out.println(static_block.x);

}

}