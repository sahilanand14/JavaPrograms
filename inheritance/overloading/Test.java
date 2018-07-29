class Test
{
	public void show(Parent p)
	{
		System.out.println("Parent");
	}

	public void show(Child p)
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		

		Test t=new Test();
		Parent p=new Parent();
		Child c=new Child();
		t.show(p);
		t.show(c);
		Parent p2=new Child();
		t.show(p2);


	}


}

class Parent{}
class Child extends Parent{}

/*
Summary:

To summarize, which overridden version of the method to call(parent or child class version) is decided at runtime based on object type, but
which overloaded version of the method to call is based on the reference type of
the argument passed at compile time. If you invoke a method passing it an 'Parent'
reference to a 'Child' object, the compiler knows only about the 'Parent', so it
chooses the overloaded version of the method that takes an 'Parent'. It does not
matter that at runtime there's actually a 'Child' being passed.


Therefore If
you pass an Animal reference, the overloaded method that takes an Animal will be
invoked, even if the actual object passed is a Horse.

*/