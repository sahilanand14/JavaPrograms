import java.util.*;
import java.io.*;
class BinaryToDecimal
{
	public static void main(String[] s)
	{ String input=s[0];
		int j=0;double ans=0;
		for(int i=input.length()-1;i>=0;i--)
		{
			ans=ans+(input.charAt(i)-'0')*Math.pow(2,j);
			j++;
		}
		System.out.println((long)ans);

	}
}