import java.io.*;
class ReadByMethod4
{
	public static void main(String...s) throws Exception
	{
		FileInputStream fin=new FileInputStream("sahil.txt");
		DataInputStream din=new DataInputStream(fin);
		String str="";
		while(str!=null)
		{
			str=din.readLine();
			if(str!=null)
				System.out.println(str);
		}
	}
}