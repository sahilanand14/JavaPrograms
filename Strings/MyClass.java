class MyClass
{
	public static void main(String args[])
	{

		for(int i=0;i<args.length;i++)
			{System.out.println(args[i]);}// displaying command line arguments

		String s1=new String("sahil");
		String s2=new String("sahil");
		MyClass m1=new MyClass();
		MyClass m2=new MyClass();
		String s4="sahil";
		String s5="sahil";

		if(s1==s2)
			System.out.println("hey");
		if(s1.equals(s2))
			System.out.println("hello");
		if(m1==m2)
			System.out.println("tata");
		if(m1.equals(m2))
			System.out.println("bye");
		if(s4==s5)
			System.out.println("good");
		if(s4.equals(s5))
			System.out.println("Morning");
		if("sahil"=="sahil")
			System.out.println("sahil");
		if(s5==s2.intern())
			System.out.println("interned");

	




	}
}