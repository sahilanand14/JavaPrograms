import java.io.*;
import java.util.*;
class LineCount
{
	public static void main(String...s) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("sahil.txt"));
		String str;int count=0;
		while((str=br.readLine())!=null)
			count++;
		System.out.println(count);
	}
}