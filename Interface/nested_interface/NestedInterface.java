// Nested interface is a member of outer interface.
// Therefore it should be public only(as members(methods or variables) of interface are by default public).



interface NestedInterface
{  public static final int x=90;
	void show();
	  interface NestedInterface2
	{  

		public void show1();
		
		static void show()
		{
			System.out.println(x);
		}
	}
}
class My implements NestedInterface.NestedInterface2
{ 
	public static void main(String...s)
	{
	NestedInterface.NestedInterface2 n=new My();
	n.show1();
	}
public void show1()
{
	System.out.println("show in child class");
}

}