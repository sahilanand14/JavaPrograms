// All methods read data and store it in string form.

import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.file.*;

class AllMethodsToReadFromFile
{
	public static void main(String...s) throws Exception
	{

       
        //METHOD 1:
    	 File file = new File("D:\\java_programs\\IO\\New folder\\sahil.txt");
         Scanner sc = new Scanner(file);
 
    // we just need to use \\Z as delimiter
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());  /*sc.next() contains whole input in string form*/
    


 // ----------------------------------------------------------------------------
 // ----------------------------------------------------------------------------

  // METHOD 2:

        FileInputStream fin=new FileInputStream("sahil.txt");
	byte[] buff=new byte[fin.available()];
	 // after the below  statement buff.length bytes from file connected to fin will be read in to buff array;
	fin.read(buff);
	String str=new String(buff);
	System.out.println(str);
 

// ----------------------------------------------------------------------------
 // ----------------------------------------------------------------------------


	// METHOD three:


	FileInputStream fin=new FileInputStream("sahil.txt");
		DataInputStream din=new DataInputStream(fin);
		String str="";String str2="";
		while(str!=null)
		{
			str=din.readLine();
			if(str!=null)
				str2+=str;
		}
 
     System.out.println(str2);


// ----------------------------------------------------------------------------
 // ----------------------------------------------------------------------------

     // METHOD 4:

     		 FileReader fr =  new FileReader("D:\\java_programs\\IO\\New folder\\sahil.txt");
 
    int i;
     while ((i=fr.read()) != -1)
       System.out.print((char) i);


  // ----------------------------------------------------------------------------
 // ----------------------------------------------------------------------------



   // METHOD 5:

   	String data = readFileAsString("D:\\java_programs\\IO\\New folder\\sahil.txt");
    System.out.println(data);
    
  // ----------------------------------------------------------------------------
 // ----------------------------------------------------------------------------


//METHOD 6:
    	
    	 File file = new File("D:\\java_programs\\IO\\New folder\\sahil.txt");
 
  BufferedReader br = new BufferedReader(new FileReader(file));
 
  String str;String str2="";
  while ((str = br.readLine()) != null)
    str2+=str;
   System.out.println(str2);

   
  // ----------------------------------------------------------------------------
 // ----------------------------------------------------------------------------




	}
	 public static String readFileAsString(String fileName)throws Exception
  {
    String data = "";
    data = new String(Files.readAllBytes(Paths.get(fileName)));
    return data;
  }


}