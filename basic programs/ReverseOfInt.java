import java.util.*;
class ReverseOfInt
{
public static void main(String...s)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int ans=0;
while(num!=0)
{
int rem=num%10;
 ans=ans*10+rem;
num=num/10;


}
System.out.println(ans);



}

}