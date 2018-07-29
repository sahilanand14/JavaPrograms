
import java.io.*;
import java.util.*;
class RemoveDuplicatesFromString
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "";
        int []count = new int[26];
        System.out.println(str.length());
        for(int i = 0; i < str.length(); i++)
            if(count[str.charAt(i) - 'a']++ == 0)       
            	str2+=str.charAt(i);
        System.out.println(str2);

    }
}