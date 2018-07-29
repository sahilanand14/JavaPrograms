/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();sc.nextLine();
		while(test-->0)
		{
		    int rows=sc.nextInt();
		    int col=sc.nextInt();
		    int arr[][]=new int[rows][col];
		    for(int i=0;i<rows;i++)
		    {
		        for(int j=0;j<col;j++)
		        {
		            arr[i][j]=sc.nextInt();
		        }
		    }
		    
		boolean b[][]=new boolean[rows][col];
		int totalcount=0;
	    
	      for(int i=0;i<rows;i++)
		    {
		        for(int j=0;j<col;j++)
		        {  
		            int count=0;
		             if(arr[i][j]==1)
		             {
	                 if((j+1)<col && arr[i][j+1]==0)
	                     count++;
	                  if((j-1>=0) && arr[i][j-1]==0)
		                 count++;
		              if((i-1>=0) && arr[i-1][j]==0)
		                  count++;
		                 if((i+1)<rows &&  arr[i+1][j]==0)
		                  count++;
		                  
		                   if((j+1)<col &&  (i+1)<rows && arr[i+1][j+1]==0)
	                     count++;
	                  if((j-1>=0) && (i+1)<rows && arr[i+1][j-1]==0)
		                 count++;
		              if((j-1>=0) && (i-1)>=0 && arr[i-1][j-1]==0)
		                  count++;
		                 if((j+1)<col && (i-1)>=0 && arr[i-1][j+1]==0)
		                  count++;
		                  
		    
		                if(count!=0 && count%2==0)
		              
		                totalcount++;
		             }
		        }
		        
		    }  
		    
		    System.out.println(totalcount);
		    
		}
	    
	    
	    
	    
	    
	}
}