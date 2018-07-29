import java.util.*;
import java.io.*;
class WordAndFrequencyCount
{
	public static void main(String...s)
	{
		String str=" india is a good         country";int count=0;
         StringTokenizer str1=new StringTokenizer(str);
         while(str1.hasMoreTokens())
         {  str1.nextToken();
         	count++;
         }
		

	}
}