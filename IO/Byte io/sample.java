import java.io.*;
class Sample
{
	public static void main(String...s) throws Exception
	{
		FileInputStream fin=new FileInputStream("sahil.txt");
		
		DataInputStream din=new DataInputStream(fin);
		//
		byte []buf=new byte[fin.available()];
		//fin.read(buf);
		String str=new String(buf);
		System.out.println(str);
		int i=0;
		// while((i=fin.read())!=-1)
		// 	System.out.print((char)i);
	
		//  String str="";
		// while(str!=null)
		// {
		// 	str=din.readLine();
		// 	if(str!=null)
		// 		System.out.println(str);
		// }

	}
}