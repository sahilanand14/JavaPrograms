class Outer
{
String str="outer class";

	public static void main(String...s)
	{
          new Outer().display();
	}

	public void display()
	{
		int y=90;
		class Inner
		{
			public void show()
			{
				System.out.println("Inner show");
				System.out.println(y);
				System.out.println(str);
				// System.out.println(++y); not allowed as y is effectively final

					
			}
		}
		Inner inner=new Inner();
		inner.show();
	}
}



1. the inner class object cannot use the local variables
of the method the inner class is in.
Think about it. The local variables of the method live on the stack, and exist only for
the lifetime of the method. You already know that the scope of a local variable is
limited to the method the variable is declared in. When the method ends, the stack
frame is blown away and the variable is history. But even after the method
completes, the inner class object created within it might still be alive on the heap if,
for example, a reference to it was passed into some other code and then stored in an
instance variable. Because the local variables aren't guaranteed to be alive as long
as the method-local inner class object, the inner class object can't use them. Unless
the local variables are marked final !

2. Remember that a local class declared in a static method has access
to only static members of the enclosing class, since there is no associated instance of the
enclosing class.


3.  An method-local inner class can be abstract,final (i.e all modifiers available for local members of a method)