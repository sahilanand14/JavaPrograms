import java.io.*;
import java.util.*;
import java.net.*;
class MyServer
{
    Socket s1;
    ServerSocket ss;
   DataInputStream dis;
   DataOutputStream dos;


	MyServer() throws IOException
	{
		ss=new ServerSocket(10);
		System.out.println("Server Socket created At: "+ss);
		s1=ss.accept();
		System.out.println("Server communicating through:  "+s1);
	    dis=new DataInputStream(s1.getInputStream());
	    dos=new DataOutputStream(s1.getOutputStream());
	    serverchat();

	}
	public void serverchat() throws IOException
	{     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String s2;String s4;
          do{ s2=dis.readUTF();
          	   System.out.println("message from client:"+s2);
               s4=br.readLine();
          	  dos.writeUTF(s4);
          	  dos.flush();

          }while(!s2.equals("stop"));

	}
	public static void main(String...s) throws Exception
	{
		new MyServer();
	}

}