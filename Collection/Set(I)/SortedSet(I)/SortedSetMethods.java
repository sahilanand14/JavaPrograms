//SortedSet interface extends Set interface.
//elements in SortedSet are sorted in ascending order by default.
import java.util.*;
class SortedSetMethods
{
	public static void main(String []args)
	{
		SortedSet<Integer> al=new TreeSet<>();
		// al.add(null); throws NullPointerException as null insertion is not allowed in Set
		al.add(1);
		al.add(100);
		al.add(10);
		al.add(2);
		al.add(77);
		al.add(45);
		al.add(12);
		al.add(66);
		al.add(78);
		al.add(99);

		//returns first element of sorted set
		Integer i=al.first();
		System.out.println("First Element: "+i);
		

		//returns last element of sorted set
		i=al.last();
		System.out.println("Last Element: "+i);

		//returns SortedSet that includes elements 20<= and >90  (upperbound excluded)
		SortedSet<Integer> subset=al.subSet(20,90);
		System.out.println("Elements between 20 and 90: ");
		Iterator<Integer> itr=subset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

        //returns SortedSet that includes elements less than 77(upperbound excluded)
		SortedSet<Integer> headset =al.headSet(77);
		System.out.println("Elements less than 77:");
		System.out.println(headset);

		//returns SortedSet that includes elements greater than or equal to 44
		SortedSet<Integer> tailset =al.tailSet(44);
		System.out.println("Elements greater than and equal to 44:");
		System.out.println(tailset);







	}

}