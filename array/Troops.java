import java.util.*;
class Troops
{
public static void main(String...s)
{
Scanner sc= new Scanner(System.in);
int test_cases=sc.nextInt();
while(test_cases!=0)
{
int size_of_array=sc.nextInt();
int arr[]=new int[size_of_array];
int multiple_of=sc.nextInt();
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
int count=0;int num=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%multiple_of==0)
count++;
}

while(count<(int)(Math.ceil(size_of_array/2.0)))
{
for(int i=1;i<multiple_of;i++)
{if(count>=(int)(Math.ceil(size_of_array/2.0)))
break;
for(int j=0;j<arr.length;j++)
{if(count>=(int)(Math.ceil(size_of_array/2.0)))
break;
if((arr[j]+i)%multiple_of==0)
{
count++;num=num+i;
}

}

}

}
System.out.println(num);



test_cases--;
}



}


}