
import java.util.*;
class ArrayListToArray
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("A");al.add("F");al.add("D");al.add("c");al.add("b");al.add("e");
      System.out.println("Actual Arralist before conversion");
      System.out.println(al);
      //method 1
      String []str=al.toArray(new String[al.size()]);
         System.out.println("After conversion");
      for(String i:str)
      	System.out.println(i);
      //method 2
      String[] str2=new String[al.size()];
      for(int i=0;i<al.size();i++)
      	str2[i]=al.get(i);

      for(String i:str2)
      	System.out.println(i);

	}

}

