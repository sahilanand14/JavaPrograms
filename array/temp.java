import java.io.*;
import java.util.*;

class temp
{
public static void main(String...s) throws Exception
{
BufferedReader br=new BufferedReader(new FileReader(new File("ArrayElementCount.java")));
String st="";
while((st=br.readLine())!=null)
System.out.println(st);


Scanner sc=new Scanner(new File("ArrayElementCount.java"));
while(sc.hasNextLine())
System.out.println(sc.nextLine());


FileInputStream fin=new FileInputStream("ArrayElementCount.java");
int i=0;
while((i=fin.read())!=-1)
System.out.print((char)i);
}



}
