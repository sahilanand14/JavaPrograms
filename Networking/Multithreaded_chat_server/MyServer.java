import java.net.*;
import java.io.*;
import java.util.*;
class MyServer
{
  Socket s1;
  ServerSocket ss;
  ArrayList<Socket> al;
  ArrayList<String> currently_Online;
  String name1;

	public static void main(String...s)
	{
		new MyServer();
	}
	
	MyServer()
	{    
       System.out.println("Server Started!!");
     try{
		al=new ArrayList<Socket>();
		currently_Online=new ArrayList<String>();
		ss=new ServerSocket(10);
		
		while(true)
	   {		
		s1=ss.accept();
	  DataInputStream dis=new DataInputStream(s1.getInputStream());
	     name1=dis.readUTF();//receves client's name.
		System.out.println(name1+" Connected");
	    al.add(s1);

	    currently_Online.add(name1);
	    String abc="Currently_Online:";
	    DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
	    abc+=(currently_Online.size()-1)+" ";
	    for(int i=0;i<currently_Online.size();i++)
	    {
             if(!currently_Online.get(i).equals(name1))
          abc=abc+currently_Online.get(i)+" ";
	    }
	    dout.writeUTF(abc);//sends currently_online people's name to client.
	    MyThread tt=new MyThread(al,s1,currently_Online,name1);
	     tt.start();//puts each client on a new thread.
        
	     
        }//end of while loop
      
        }
        catch(Exception e){}
	}
}
class MyThread extends Thread
{  ArrayList<Socket> al;
	ArrayList<String> currently_Online;
	Socket s4;
	String name1;
	MyThread(ArrayList<Socket> al,Socket s4,ArrayList<String> currently_Online,String name1)
	{
		this.al=al;
		this.s4=s4;
		this.currently_Online=currently_Online;
		this.name1=name1;
	}
	public void run()
	{
       String s1;
       try{
        DataInputStream dis=new DataInputStream(s4.getInputStream());
       // name=dis.readUTF();
       tellEveryOne(name1.toUpperCase()+" joined ");
       do{
       s1=dis.readUTF();//reads input from client
       System.out.println(s1);
       if(!s1.equals("stop"))
       	{tellEveryOne(name1.toUpperCase()+":    "+s1);}
       else{
       	DataOutputStream dout=new DataOutputStream(s4.getOutputStream());
       	dout.writeUTF(s1);//sends stop message back to only the client that send it.
       	dout.flush();
       	al.remove(s4);
       	tellEveryOne("!!"+name1.toUpperCase()+" left!!");
       }
        }while(!s1.equals("stop"));
	   }
	   catch(Exception e){}
	}

	public void tellEveryOne(String s1)
	{
		Iterator<Socket> i=al.iterator();
		while(i.hasNext())
		{
			try{
			Socket sc=i.next();
			if(sc!=s4)
			{
			DataOutputStream dout=new DataOutputStream(sc.getOutputStream());
			dout.writeUTF(s1);
			dout.flush();
		     }
		      }
		      catch(Exception e){}
		}
	}
}