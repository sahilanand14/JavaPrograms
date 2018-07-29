import java.util.*;
import java.io.*;
import java.math.*;
class ReverseOfNumber
{public static void main(String...s)
{
Scanner sc=new Scanner(System.in);
String num=sc.nextLine();
BigInteger num1=new BigInteger(num);
BigInteger ans=new BigInteger("0");
BigInteger rem=new BigInteger("0");
while(!num1.equals(new BigInteger("0")))
{
BigInteger ten=new BigInteger("10");
rem=num1.mod(ten);
ans=ans.multiply(ten).add(rem);
num1=num1.divide(ten);
}
System.out.println("Reverse is: "+ans);



}





}