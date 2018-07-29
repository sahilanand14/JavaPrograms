import java.io.*;
public class Myclass
{
	public static void main(String...s) throws Exception
	{  DataInputStream din=new DataInputStream(System.in);

       String str="";
       while(!str.equals("stop"))
       {
       	str=din.readLine();
       	System.out.println(str);
       }
      
	}
}