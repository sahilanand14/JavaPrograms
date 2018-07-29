import java.io.*;
import java.util.*;
import java.net.*;
class MyClient1
{
   Socket s1;
   DataInputStream din;
   DataOutputStream dout;



	MyClient1() throws IOException
	{
		s1=new Socket("localhost",10);
		System.out.println("Client communicating through:  "+s1);
		din=new DataInputStream(s1.getInputStream());
		dout=new DataOutputStream(s1.getOutputStream());
		clientchat();

	}
	public void clientchat() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s2;
		do{
			s2=br.readLine();
			dout.writeUTF(s2);
			dout.flush();
			System.out.println("Reply from Server:"+din.readUTF());

		}while(!s2.equals("stop"));

	}
	public static void main(String...s) throws Exception
	{
		new MyClient1();
	}


}
