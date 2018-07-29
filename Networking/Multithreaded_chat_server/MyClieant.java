import java.io.*;
import java.net.*;
import java.util.*;
class MyClieant
{
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	String name;

	MyClieant()
	{
		try{
			System.out.println("Enetr your name:");
			Scanner sc=new Scanner(System.in);
		    name=sc.nextLine();
		s=new Socket("localhost",10);
        din=new DataInputStream(s.getInputStream());
        dout=new DataOutputStream(s.getOutputStream());
        dout.writeUTF(name);//sends name to server
        String sss=din.readUTF();//gets currently_online people name.
        StringTokenizer stt=new StringTokenizer(sss);
        while(stt.hasMoreTokens())
        	System.out.println(stt.nextToken());//displays names.
        clientChat();
          }
          catch(Exception e){}
	}
	public void clientChat() throws IOException
	{  MyThread1 m=new MyThread1(din);
		m.start();//starts thread for receiving messages from server.This thread terminates on receiving stop from server.


		String s1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{ 
           s1=br.readLine();//takes input from client.
           dout.writeUTF(s1);//sends messages to server.
           dout.flush();
		}while(!s1.equals("stop"));
	}

    public static void main(String []args)
    {new MyClieant();}
}
class MyThread1 extends Thread
{
	DataInputStream d1;
	MyThread1(DataInputStream d1)
	{this.d1=d1;}
	public void run()
	{
		String s2="";
		
		try{
		while(!(s2=d1.readUTF()).equals("stop"))
				System.out.println("\t\t\t"+s2);
		}
		catch(Exception e){}

	}
}