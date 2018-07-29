import java.io.*;
import java.net.*;
class MyClient
{
	Socket s;
	ObjectOutputStream oout;

	MyClient()
	{  try{
		s=new Socket("localhost",10);
		oout=new ObjectOutputStream(s.getOutputStream());
		oout.writeObject(new Employee("sahil",20,new NotSerialized(90)));
		oout.flush();
		}
		catch(Exception e){e.printStackTrace();}
	}
	public static void main(String[] args) {
		new MyClient();
	}
}