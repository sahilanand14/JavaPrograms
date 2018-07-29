import java.util.*;
class ArrayArrange
{
public static void main(String...s)
{
int arr[]={1,2,4,5,6,9,8,45,56,44,55,78,76};
Arrays.sort(arr);
for(int i=0,j=arr.length-1;i!=j;i++,j--)
{System.out.println(arr[j]+" ,"+arr[i]);}



}




}