import java.io.*;
class MyClass
{
	public static void main(String...s) throws Exception
	{
		FileWriter fw= new FileWriter("sahil.txt");
		String str="India is a good country";
		fw.write(str);// there is no need to convert String to char array;
		
		char ch[]=str.toCharArray();
		fw.write(ch);
		fw.close();
	}
}