import java.io.*;
import java.util.*;
class Writing_Array_to_file
{
public static void main(String...s) throws Exception
{Scanner sc=new Scanner(System.in);
DataOutputStream dout=new DataOutputStream(new FileOutputStream("Array_in_file.xlsx"));
for(int i=0;i<5;i++)
{int num=sc.nextInt();
dout.writeInt(num);
}
DataInputStream din=new DataInputStream(new FileInputStream("Array_in_file.xlsx"));
for(int i=0;i<5;i++)
{int n=din.readInt();
System.out.println(n);
}
System.out.println("Succesfully written to file");




}



}