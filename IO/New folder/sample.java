import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.file.*;
class Sample
{
	public static void main(String...s) throws Exception
    {
    // 	 File file = new File("D:\\java_programs\\IO\\New folder\\sahil.txt");
    // Scanner sc = new Scanner(file);
 
    // // we just need to use \\Z as delimiter
    // sc.useDelimiter("\\Z");
    //  String[] d=sc.next().split(" ");
    // for(String h:d)
    //  	System.out.println(h);

  




// FileInputStream fin=new FileInputStream("sahil.txt");
// 	byte[] buff=new byte[fin.available()];
// 	 // after the below  statement buff.length bytes from file connected to fin will be read in to buff array;
// 	fin.read(buff);
// 	String str=new String(buff);
// 	System.out.println(str);
//  String[] d=str.split(" ");
//     for(String h:d)
//       	System.out.println(h);




FileInputStream fin=new FileInputStream("sahil.txt");
		DataInputStream din=new DataInputStream(fin);
		String str="";String str2="";
		while(str!=null)
		{
			str=din.readLine();
			if(str!=null)
				str2+=str;
		}


String[] d=str2.split(" ");
    for(String h:d)
       	System.out.println(h);






    // 	 FileReader fr =
    //   new FileReader("D:\\java_programs\\IO\\New folder\\sahil.txt");
 
    // int i;
    // while ((i=fr.read()) != -1)
    //   System.out.print((char) i);




// String data = readFileAsString("D:\\java_programs\\IO\\New folder\\sahil.txt");
//     System.out.println(data);
//     String[] d=data.split(" ");
//     for(String h:d)
//     	System.out.println(h);



  
    }
    public static String readFileAsString(String fileName)throws Exception
  {
    String data = "";
    data = new String(Files.readAllBytes(Paths.get(fileName)));
    return data;
  }



}