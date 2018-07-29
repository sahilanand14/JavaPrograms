import java.util.*;
class LinkedListMethods
{
	public static void main(String...s)
	{
		LinkedList<Integer> al=new LinkedList<>();
		al.add(1);al.add(2);al.add(4);al.add(5);al.add(6);
		System.out.println(al);
		//Integer a1=al.element();// Retrieves first element ;throws Exception if list is Empty
		Integer a1=al.peek();//Retrieves first element ;returns null if list is empty.
		Integer a2=al.pop();

		System.out.println(a1);
		
		System.out.println(a2);
		System.out.println(al);
	}

}