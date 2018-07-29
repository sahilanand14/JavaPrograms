import java.io.*;
import java.util.*;
class CountOfWordsInFile
{
	public static void main(String...s) throws IOException
	{
		File file = new File("sahil1.txt");
       try(Scanner sc = new Scanner(new FileInputStream(file))){
                      int count=0;
                         while(sc.hasNext())
                         {
                               System.out.println(sc.next());
                               count++;
                           }

System.out.println("Number of words: " + count);
	}
}
}
