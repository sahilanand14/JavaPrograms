import java.io.*;
class Receiver
{
	public static void main(String...s) throws IOException,ClassNotFoundException
	{
		ObjectInputStream oin=new ObjectInputStream(new FileInputStream("sahil.txt"));
		MyClass m=(MyClass)oin.readObject();
		System.out.println(m);
	}
}
