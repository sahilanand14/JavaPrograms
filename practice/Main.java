import java.util.*;
class Main
{
public static void main(String...s)
{
Scanner sc=new Scanner(System.in);
int test=sc.nextInt();sc.nextLine();
while(test-->0)
{
int num_of_fingers=sc.nextInt();sc.nextLine();
int []glove=new int[num_of_fingers];
int []fingers=new int[glove.length];
for(int i=0;i<fingers.length;i++)
{fingers[i]=sc.nextInt();}
for(int i=0;i<glove.length;i++)
{glove[i]=sc.nextInt();}

int flag=0;
for(int i=0;i<fingers.length;i++)
{
	if(glove[i]>=fingers[i])
	flag=1;
	else
	{flag=0;break;}
}
int flag2=0;
int l=glove.length-1;
for(int i=0;i<fingers.length;i++)
{
	if(glove[l-i]>=fingers[i])
	flag2=1;
	else
	{flag2=0;break;}
}
if(flag2==1&&flag==1)
System.out.println("both");
if(flag2==1&&flag==0)
System.out.println("back");
if(flag2==0&&flag==1)
System.out.println("front");
if(flag2==0&&flag==0)
System.out.println("none");


}
}


}  