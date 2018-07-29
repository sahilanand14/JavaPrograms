class StaticMethodsInInheritance implements My1,My2
{
	public static void main(String...s)
	{

	}

}
interface My1
{
static void show()
{
	System.out.println("In show of My1");
}
}
interface My2
{
	static void show()
	{
System.out.println("In show of My2");		
	}

}

//if instead of static we use default method than error will occur.