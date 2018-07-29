import java.util.*;
class ArrayListReverse
{
	public static void main(String...s)
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(1);al1.add(90);al1.add(7);al1.add(4);al1.add(5);al1.add(2);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("sahil");al2.add("best");al2.add("the");al2.add("anand");
		System.out.println(al1);
		System.out.println(al2);
		Collections.reverse(al1);Collections.reverse(al2);
		System.out.println(al1);System.out.println(al2);
		Collections.shuffle(al1);
		Collections.shuffle(al2);
		System.out.println(al1);System.out.println(al2);
		Collections.swap(al1,2,4);
		System.out.println(al1);
		al1.set(0,789);
		System.out.println(al1);
		
			
	}

}