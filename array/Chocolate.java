import java.util.*;
class Chocolate
{
public static void main(String...s)
{
Scanner sc=new Scanner(System.in);
int test_case=sc.nextInt();
while(test_case!=0)
{int num=0;
int size_of_array=sc.nextInt();
int arr[]=new int[size_of_array];
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
for(int i=0,j=arr.length-1;i!=j;)
{
if(arr[i]>=arr[j])
{//System.out.println(arr[i]);
i++;num=arr[i];
}
else{
//System.out.println(arr[i]);
j--;}


}
System.out.println(num);







test_case--;
} 


}


}