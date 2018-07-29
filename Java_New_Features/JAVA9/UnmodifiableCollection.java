//This program will run only in JAVA version>=9


import java.util.*;
class UnmodifiableCollection
{
	public static void main(String...s)
	{	/*
		*
		*
		This creates generic Collection.
		They can be modified after creation.
		*
		*
		*/
		ArrayList<String> al=new ArrayList<>();
		al.add("a");
		al.add("e");
		al.add("i");
		al.add("o");

       // This creates Unmodifiable Collection.
       // Throw UnsupportedOperationException if we try to add or remove elements from this collection.
		ArrayList<String> al2=List.of("a","e","i","o");
		al2.add("u");
	}
}
// NOTE: the second way to create coolection is not a substitute for first way.