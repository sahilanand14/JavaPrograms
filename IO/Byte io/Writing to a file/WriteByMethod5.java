import java.io.*;
class WriteByMethod5
{
	public static void main(String...s) throws Exception
	{

		DataInputStream din=new DataInputStream(System.in);//to read data from console;
		FileOutputStream fout =new FileOutputStream("sahil4.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		String str="";
		while(!str.equals("stop"))
		{
			str=din.readLine();
			dout.writeUTF(str);	
		}
		

	}
}