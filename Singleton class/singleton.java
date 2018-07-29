

// A singleton class is one whose one instance can only be created
//It has following properties
// 1. A private constructor so that nobody can create its object outside the class
// 2. a public static function which return object of type singleton. this is a factory method whose job is to create object.
// 4. a private static data member of type singleton which will store the reference id of object created by factory method.


class singleton
{
	private static singleton obj;     
	private singleton()
	{
	//blank contructor
	}

	//Factory method that creates object if its not created and returns reference id of object.
	public static singleton createobject()
   {
      if(obj==null)
          obj=new singleton();
      return obj;


}

public static void main(String...s)
{
singleton obj=singleton.createobject();

 singleton obj2=singleton.createobject();
 if(obj==obj2)
 System.out.println("same");


}


 


}
// example of Singeton class:Runtime class