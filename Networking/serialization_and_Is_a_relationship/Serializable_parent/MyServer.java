import java.io.*;
import java.net.*;
class MyServer
{
	Socket s;
	ServerSocket ss;
	ObjectInputStream oin;
	MyServer()
	{  try{
		ss=new ServerSocket(10);
		while(true)
		{
		s=ss.accept();
		oin=new ObjectInputStream(s.getInputStream());
		Employee e =(Employee)oin.readObject();    //on deserialization the constructor of 'NotSerialized' class is not run.
		e.show();
	     }
		}catch(Exception e){e.printStackTrace();}
	}
	public static void main(String[] args)  {
		new MyServer();
	}
}