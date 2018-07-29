/*program to find sum of distinct elements of an array */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num_test_case=sc.nextInt();
	    while(num_test_case!=0)
	    {
	        
	        int size_of_array=sc.nextInt();
	        int arr[]=new int[size_of_array];
	        for(int i=0;i<arr.length;i++)
	        arr[i]=sc.nextInt();
	        Arrays.sort(arr);
	        int sum=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            while(i<arr.length-1 && arr[i]==arr[i+1])
	            i++;
	            sum=sum+arr[i];
	        }
	        System.out.println(sum);
	  num_test_case--;  }
		//code
	}
}