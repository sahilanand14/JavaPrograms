import java.util.*;
class ArraysMethods
{
   public static void main(String...s)
   {
   	int arr[]=new int[]{1,2,4,5,6,7}; //creating annonymous array and then assigning it a reference.

   	//arraycopy example1
   	int arr1[]=new int[arr.length];
   	System.arraycopy(arr,0,arr1,0,arr.length);
   	for(int i:arr1)
   		System.out.println(i);
   	System.out.println("///////////////////////");

   	//arraycopy example2
   	int arr2[]=new int[5];
   	arr2[4]=20;
   	System.arraycopy(arr,2,arr2,0,4);
   	for(int i:arr2)
   		System.out.println(i);
	System.out.println("///////////////////////");

   	//arraycopy example
   	int arr4[]=new int[5];
   	System.arraycopy(arr,2,arr4,2,2);
	for(int i:arr4)
   		System.out.println(i);
System.out.println("///////////////////////");

   	//arrayfill example
   	int arr5[]=new int[10];
   	Arrays.fill(arr5,10);
	for(int i:arr5)
   		System.out.println(i);

System.out.println("///////////////////////");
   




   }
}