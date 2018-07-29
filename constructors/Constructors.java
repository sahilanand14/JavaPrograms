// program to demonstrate that reference id is generate from new
//and is passed to constructer via this.
//the constructor then returns the reference id which is stored in the
//reference variable.



class Constructors
{
public static void main(String...s)
{
Constructors c1=new Constructors();
System.out.println("after constructor Rid=:"+c1);

}
  Constructors()
{
System.out.println("In constructor Rid=:"+this);
return;  //blank return is allowed in constructor as compiler
         //imlicitly places this after return

//return this; this is not allowed

}




}

//NOTE: we cant use return statement in constructor.
//constructors can't be final.
