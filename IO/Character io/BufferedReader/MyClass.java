import java.io.*;
class MyClass
{
	public static void main(String...s) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("sahil.txt"));
		String str="";
		while(str!=null)
		{
			str=br.readLine();
			if(str!=null)
				System.out.println(str);
		}
	}
}