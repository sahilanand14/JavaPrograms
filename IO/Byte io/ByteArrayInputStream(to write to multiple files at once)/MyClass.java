import java.io.*;
class MyClass
{
	public static void main(String...s) throws Exception
	{
		String str="India is a good country";
		byte []b=str.getBytes();
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		bout.write(b);
		bout.writeTo(new FileOutputStream("file1.txt"));
		bout.writeTo(new FileOutputStream("file2.txt"));
		bout.writeTo(new FileOutputStream("file4.txt"));
	}
}