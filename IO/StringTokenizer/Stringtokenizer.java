import java.util.*;
class Stringtokenizer
{
	public static void main(String...s)
	 {   
	 //new StringTokenizer(String str,String delimeters,boolean b)
	// 	  the second argument is the delimeters to be used.
	// 	  the third argument specifies whether delimeters are to be used as tokens also or not.
		
		StringTokenizer str=new StringTokenizer("Name=Sahil;Age=20;Rollno.=1046;Department=cse;","=;",false);

		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken()+"\t"+str.nextToken());
		}

	}
}