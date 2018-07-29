import java.io.*;
class Sender
{
public static void main(String...s) throws IOException
{
	MyClass m=new MyClass();
	System.out.println(m);
	ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream("sahil.txt"));
	oout.writeObject(m);

}

}