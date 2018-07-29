
import java.io.*;
class ReadByMethod1
{
public static void main(String...s) throws Exception
{
	FileInputStream fin=new FileInputStream("sahil.txt");
	byte[] buff=new byte[fin.available()];
	 // after the below  statement buff.length bytes from file connected to fin will be read in to buff array;
	fin.read(buff);
	String str=new String(buff);
	System.out.println(str);
}

}