import java.util.*;
class ArrayElementCount
{
public static void main(String...s)
{
int arr[]={1,2,4,5,6,7,8,9,12,14,15,65,44,22,88,12,1,1,1,2,4,5,6,44,88};
System.out.println("given Array:");
for(int a:arr)
System.out.print(a+" ");
System.out.println("\n"+"After Sorting:");
Arrays.sort(arr);
for(int a:arr)
System.out.print(a+" ");
System.out.println();

for(int i=0;i<arr.length;i++)
{int count=1;
while(i<arr.length-1 && arr[i]==arr[i+1]){
count++;i++;}
System.out.println("No. of "+arr[i]+"="+count);
}


}

}