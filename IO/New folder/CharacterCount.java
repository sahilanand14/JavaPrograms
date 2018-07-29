import java.util.*;
import java.io.*;
class CharacterCount
{
	public static void main(String...s) throws Exception
	{

		BufferedReader br=new BufferedReader(new FileReader("sahil1.txt"));
		String str="";String str1="";int count=0;
		while((str=br.readLine())!=null)
		str1+=str;
	   for(int i=0;i<str1.length();i++)
	   	if(str1.charAt(i)!=' ')
	   		count++;
	   	System.out.println(count);

	}
}