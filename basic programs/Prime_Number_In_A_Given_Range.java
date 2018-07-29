import java.util.*;
class Prime_Number_In_A_Given_Range
{
public static void main(String...s)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter starting value");


int start=sc.nextInt();
System.out.println("Enter limit value");

int end =sc.nextInt();
System.out.println("Prime numbers between "+start+" and "+end+" are: ");

int flag=0;int count=0;
for(int i=start;i<=end;i++)
{
flag=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
flag=1;break;
}

}
if(flag==0)
{System.out.print(i+",");count++;}

}
	System.out.println("\n"+"Total: "+count);




}




}