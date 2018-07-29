import java.util.*;
import java.io.*;
class SortFromFile
{
public static void main(String...s) throws Exception
{  
   PrintWriter fw=new PrintWriter(new FileWriter("sahil.txt"));
   String str="";
   System.out.println("Enter Numbers which you want to sort:");
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   while(!str.equals("stop"))
   {
   	str=br.readLine();
   	if(!str.equals("stop"))
   		fw.println(str);
   }	

 fw.flush();
 ArrayList<Integer> al=new ArrayList<>();

FileReader fr=new FileReader("sahil.txt");
br=new BufferedReader(fr);
String st="";
while((st=br.readLine())!=null)
{
        String st1[]=st.split(" ");
         for(String i:st1)
        al.add(Integer.parseInt(i));
 

}
Collections.sort(al);

String str2="";
for(int i=0;i<al.size();i++)
{

 str2+=(al.get(i)).toString()+" ";
}
 fw.println(str2);

fw.close();
br.close();
}



}

