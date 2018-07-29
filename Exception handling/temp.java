import java.util.*;
class temp
{
 
public void printAge(int age) throws AgeException
{

if(age>18)
// throw new AgeException();
throw new AgeException("Invalid age!!");
else
System.out.println("age:"+" "+age);


}
public static void main(String...s)
{
int age;
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
try{new temp().printAge(age);}
catch(AgeException e){System.out.println(e);}
System.out.println("main continues");
temp e=new temp();

System.out.println(e);


}


}
class AgeException extends Exception
{
AgeException()
{}
AgeException(String f)
{super(f);}

}