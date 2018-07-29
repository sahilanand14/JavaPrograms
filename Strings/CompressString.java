import java.util.*;
class CompressString
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[26];
        String str2 = "";
        for(int i = 0; i < str.length();)
        {
            int j = i;
            while(j < str.length() && str.charAt(i) == str.charAt(j))
            {
                count[str.charAt(i) - 'a']++;
                j++;
            }
            str2 = str2 + str.charAt(i) + count[str.charAt(i) - 'a'];
            count[str.charAt(i) - 'a'] = 0;
            i = j;

        }
        System.out.println("After Compressing:");
        System.out.println(str2);
        System.out.println("After Decompressing again:");
        String str3 = "";
        for(int i = 0; i < str2.length(); i += 2)
        {
            for(int j = 0; j < Integer.parseInt(str2.charAt(i + 1) + ""); j++)
            {
                str3 = str3 + str2.charAt(i);
            }
        }
        System.out.println(str3);


    }
}