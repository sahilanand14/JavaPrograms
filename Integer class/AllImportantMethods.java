// Any method of Integer class which takes int as argument can be given object of Integer class also because of Autoboxing and Unboxing.

class AllImportantMethods
{
	public static void main(String...s)
	{
		Integer obj1=new Integer(11);//converts primitive to object(Boxing) Note:this can now be done automatically via Autoboxing
		Integer obj2=new Integer("11");
		int result=Integer.compare(44,12);//if 1st argument is greater return 1;
		int a=Integer.parseInt("1111");
		int b=Integer.parseInt("100",2);//it means 100 is represented in binary form i.e 100=4
		String s1=Integer.toBinaryString(100);//converts 100 to binary.
		String s2=Integer.toHexString(100);
		String s4=Integer.toOctalString(100);
		String s5=Integer.toString(100);//converts 100 to "100";
		String s6=Integer.toString(100,2);//output: hundred in binary form
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		System.out.println(s1+"  "+s2+"  "+s4+"  "+s5+"   "+s6);


	}
}