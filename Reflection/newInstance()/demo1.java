
// Class.forName() method : public static Class<?> forName(String name)


class demo1
{
	public static void main(String...s) throws Exception
	{
		//Test t=new Test();
		try{
		String o =(String)Class.forName("java.lang.String").getDeclaredConstructor(String.class).newInstance("str");

		
		// String s1=Class.forName("java.lang.String").getDeclaredConstructor(String.class).newInstance("str"); 
	   

		//NOTE: here we need not downcast it.
	    String s2=String.class.getDeclaredConstructor(String.class).newInstance("str");
	    
	    System.out.println(o);
	     }
	   catch(Exception e){}
	}

}