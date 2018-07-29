//NavigableSet interface extends SortedSet interface.
import java.util.*;
class NavigableSetMethods
{
    public static void main(String []args)
    {
        NavigableSet<Integer> al = new TreeSet<>();
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


        //returns smallest element e such that e>=44
        Integer i = al.ceiling(44);
        System.out.println(i);

        //returns largest element e such that e<=obj
        i = al.floor(44);
        System.out.println(i);

        //returns an iterator that moves from highest to lowest element.
        Iterator<Integer> itr = al.descendingIterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        //returns a NAvigableSet which is reverse of the invoking Set
        NavigableSet<Integer> al1 = al.descendingSet();
        System.out.println(al1);


        //returns a NavigableSet that includes all elements <77.
        al1 = al.headSet(77, false);
        System.out.println(al1);


        //returns a NavigableSet that includes all elements <=77.
        al1 = al.headSet(77, true);
        System.out.println(al1);
        // NOTE: headSet(E obj) returns SortedSet whereas headSet(E obj,boolean b) returns NavigableSet.



        // returns a NavigableSet that includes all elements >=66.
        al1 = al.tailSet(66, true);
        System.out.println(al1);


        //returns NavigableSet which includes all elements >=lowerbound and <= upperbound.
        al1 = al.subSet(12, true, 90, true);
        System.out.println(al1);

        //returns and removes first element from set
        System.out.println(al.pollFirst());

        //returns and removes last element from set
        System.out.println(al.pollLast());
        System.out.println(al);









    }
}