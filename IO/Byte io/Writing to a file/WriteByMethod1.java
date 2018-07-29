import java.io.*;
class WriteByMethod1
{
   public static void main(String...s) throws Exception
   {
   	FileOutputStream fout=new FileOutputStream("sahil.txt");
   	String str="india is a good country\n"+" i am a good boy\n"+ "i love chocolates\n"+" i am tall\n";
   	byte buff[]=str.getBytes();
   	for(int i=0;i<buff.length;i++)
   		fout.write(buff[i]);

   }   
}