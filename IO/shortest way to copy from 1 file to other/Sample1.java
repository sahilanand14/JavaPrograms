import java.util.*;
import java.io.*;
class Sample1
{
	public static void main(String...s) throws Exception
	{
        FileInputStream fin=new FileInputStream("sahil1.txt");
        FileOutputStream fout=new FileOutputStream("sahil11.txt");
        
        String str="";
       int i;
       while((i=fin.read())!=-1)
       	{str+=(char)i;fout.write((char)i);}
     System.out.println(str);
  /////////////////////////////////////////////////////////////////////////////////

        // byte buff[]=new byte[fin.available()];
        // fin.read(buff);
        // fout.write(buff);

	}
}