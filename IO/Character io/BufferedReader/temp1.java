import java.io.*;

class temp1
{
public static void main(String...s) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw=new PrintWriter(new FileWriter("sahil.txt"));
String St="";
while(!St.equals("stop"))
{
St=br.readLine();
System.out.println(St);
pw.println(St); 
}
pw.close();
br.close();



}


}