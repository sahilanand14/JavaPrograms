/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();sc.nextLine();
		while(test-->0)
		{
		    int no_of_days=sc.nextInt();
		    int max_buy=sc.nextInt();
		    int required_each_day=sc.nextInt();
		    if(required_each_day<=max_buy)
		    {  if((max_buy-required_each_day)*6<required_each_day)
		          System.out.println(-1);
		         int total=no_of_days*required_each_day;
		          int count=0;
		           for(int i=1;;i++)
		            {
		            if((max_buy*i)<total)
		            count++;
		            else
		            break;
		            }
		    System.out.println(count+1);
		        
		    }
		    else
		    System.out.println(-1);
		}
	}
}