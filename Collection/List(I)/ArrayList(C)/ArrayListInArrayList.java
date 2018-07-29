import java.util.*;
class ArrayListInArrayList
{
	public static void main(String...s)
	{
		ArrayList<ArrayList> al=new ArrayList<>();
		ArrayList<String> str=new ArrayList<String>();
		str.add("a");str.add("e");str.add("d");str.add("c");str.add("b");
		al.add(str);
		al.add(al);
		System.out.println(al);

	}
}