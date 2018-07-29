import java.io.*;
class ExceptionAndInheritance
{

public void foo()
{}
public void foo2() throws ArithmeticException
{}
public void foo4()
{}
public void foo5() throws IOException
{}
public void foo6() throws IOException
{}
public void foo7() throws FileNotFoundException
	 {}

}
class MyClass extends ExceptionAndInheritance
{
	public void foo() throws ArithmeticException
	{}
	public void foo2()
	{}
  
/*   
   gives error as child cannot throw Checked Exceptions if parent dosent.

    public void foo4() throws IOException
	 {}

  
*/
	public void foo5()
	 {}
	 public void foo6() throws FileNotFoundException
	 {}
/*
     gives error as child cannot throw Broader exceptions than parent.

	 public void foo7() throws IOException
	 {}

*/
}



