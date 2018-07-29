import java.io.*;
class MyClass
{
	public static void main(String...s) throws Exception
	{
		PrintWriter pw=new PrintWriter(new FileWriter("sahil.txt"));
		pw.println("hello");
		pw.println("hi");
		pw.println("hay");
		pw.close();
	}
}