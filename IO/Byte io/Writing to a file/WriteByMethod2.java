import java.io.*;
class WriteByMethod2
{
	public static void main(String...s) throws Exception
	{
		FileOutputStream fout =new FileOutputStream("sahil1.txt");
		String str="india is a good country";
		byte b[]=str.getBytes();
		fout.write(b);// writes byte array b to file connected to fout.
	}
}