import java.io.*;
class MyClass
{public static void main(String...s) throws Exception
	{
		DataInputStream din=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("sahil.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		String str="";
		while(!str.equals("stop"))
		{
			str=din.readLine();
			System.out.println(str);
			dout.writeUTF(str);
			//dout.writeChars(str);
			//dout.writeBytes(str);
		}
	}

}