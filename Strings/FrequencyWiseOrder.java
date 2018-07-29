import java.io.*;
import java.util.*;
class FrequencyWiseOrder
{
	public static void main(String []s)
	{
		String str=s[0];
		int count[]=new int[123];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}


 HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<count.length;i++)
        map.put(i,count[i]);
    System.out.println(map);


    
        





	}
}