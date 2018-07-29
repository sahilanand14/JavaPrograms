import java.util.*;
class StringElementCount
{
public static void main(String...s)
{System.out.println("Enter the String:");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int []count=new int[256];
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
count[(int)ch]++;

}
for(int i=0;i<count.length;i++)
{
if(count[i]>0)
System.out.println("number of "+(char)i+" is:"+count[i]);
}

}


}