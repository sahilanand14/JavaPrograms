import java.io.*;
import java.util.*;
class SequenceInputstream
{
public static void main(String...s) throws Exception
{
  Vector<String> v=new Vector<String>();
  v.add("file1.txt");v.add("file2.txt");v.add("file4.txt");
  SequenceInputStream seq=new SequenceInputStream(new MyStream(v));
  DataInputStream din=new DataInputStream(seq);
  String str="";
  while(str!=null)
  {
  	str=din.readLine();
  	if(str!=null)
  	System.out.println(str);
  }
  din.close();


}

}
class MyStream implements Enumeration<FileInputStream>
{
	Enumeration<String> files;
MyStream(Vector<String> files)
{this.files=files.elements();}
public boolean hasMoreElements()
{
	return files.hasMoreElements();
}
public FileInputStream nextElement() 
{   try{
	return (new FileInputStream(files.nextElement().toString()));
       }
       catch(Exception e){return null;}

}


}

