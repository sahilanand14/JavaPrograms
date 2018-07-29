//PrintStream is a high level Stream;
//PrintStream(OutputStream o)
import java.io.*;
import java.util.*;
class RedirectingOutputToFile
{
public static void main(String...s)
{
try{
System.out.println("Output on console");
PrintStream ps1=System.out;  //saving original refeence of monitor buffer
PrintStream ps2=new PrintStream(new FileOutputStream("Redirectedoutput.txt"));
System.setOut(ps2);//now out contains file's reference
System.out.println("Output in file");
System.setOut(ps1);
System.out.println("Output again on console");
}
catch(IOException e)
{e.printStackTrace();
}


}



}