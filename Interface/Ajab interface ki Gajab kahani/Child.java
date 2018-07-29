
class Child implements My
{
	public static void main(String...s)
	{
		My m=new Child();

		//Below statement gives error because show() method is not present in interface and we cant execute child's personal methods with parent's reference variable.
		
		//m.show();

		// Below statement should also give error as toString() is not present in interface but here we are executing child's personal method toString() with parent referene variable

		System.out.println(m.toString());
       // This happens because every interface inherits all non final methods of Object class.

	}
	public String toString()
	{
		return "Overriden tostring";
	}

	public void show()
	{
		System.out.println("Show method of child class");
	}
}
interface My
{

}
