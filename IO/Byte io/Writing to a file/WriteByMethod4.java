import java.io.*;
class WriteByMethod4
{
	public static void main(String...s) throws Exception
	{

		DataInputStream din=new DataInputStream(System.in);//to read data from console;
		FileOutputStream fout =new FileOutputStream("sahil2.txt");
		PrintStream ps=new PrintStream(fout);
		String str="";
		while(!str.equals("stop"))
		{
			str=din.readLine();
			ps.println(str);	
		}
		

	}
}