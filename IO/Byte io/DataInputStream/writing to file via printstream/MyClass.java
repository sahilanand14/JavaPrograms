import java.io.*;
class MyClass
{
	public static void main(String...s) throws Exception
	{
		DataInputStream din=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("sahil.txt");
		PrintStream ps=new PrintStream(fout);
		String str="";
		while(!str.equals("stop"))
		{
			str=din.readLine();
			ps.println(str);
		}
	}
}