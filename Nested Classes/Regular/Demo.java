class Demo
{
	private int x=20;
	public int y=30;
	protected int z=40;

	public static void main(String[] args) {
		Demo d=new Demo();
		d.createObject();
		Demo.Inner inner=d.new Inner();
//      Demo.Inner inner=new Demo().new Inner();
		inner.show();
	}

	public void createObject()
	{
		Inner i=new Inner();
		i.show();
	}

	class Inner
	{
		private int x=200;
	    public int y=300;
	    protected int z=400;
		public void show()
		{   int x=100;
			System.out.println("Inner show");
			System.out.println("x= "+x);
			System.out.println("this.x= "+this.x);   //this contains reference of object that invoked this function.
			System.out.println("outer x= "+Demo.this.x);
			
			
			

		}
	}
}


/*


1. An inner class can be protected,public,private,static,abstract,final,strictfp (i.e all modifiers available for class members)

2. The main use of inner classes is when designing GUI applications in java. The EventListeners are mainly implemented as inner classes and therefore they 
can use outer class non-static Data members freely. This is why the reference variable for Button class declared in outer class in accessible in inner 
class also.

3. Inner class can access outer class non-static instance variables irrespective of access modifiers.

4. Inner class instance can't be created without instantiating the outer class.

5. this refers to inner class instance.

6. to refer to outer class inside inner class use OuterClassName.this .

7. Inner class can't have static methods because if allowed they can be called directly without creating outer class instance which is not allowed.

8. Inner classes can't be made executable by keeping main function in it.

*/
