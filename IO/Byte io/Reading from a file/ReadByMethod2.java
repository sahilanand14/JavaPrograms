import java.io.*;
class ReadByMethod2
{
	public static void main(String...s) throws Exception
	{
		FileInputStream fin=new FileInputStream("sahil.txt");
		int i=0;
		while((i=fin.read())!=-1)
			System.out.print((char)i);
	}
}