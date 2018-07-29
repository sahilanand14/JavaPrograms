import java.util.concurrent.*;
import java.util.*;
class MySet
{
    public static void main(String[] args)
    {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("a");
        set.add("e");
        set.add("i");
        set.add("o");
        Iterator<String> itr = set.iterator();
        set.add("u");
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println(set);




        HashSet<String> hs = new HashSet<>();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("e");
        Iterator<String> itr1 = hs.iterator();
        hs.add("f");
        hs.add("fg");
        hs.add("h");
        hs.add("i");
        hs.add("j");
        hs.add("k");
        hs.add("l");
        hs.add("m");
        while(itr1.hasNext())
        {

            System.out.println(itr1.next());
        }
        System.out.println(hs);




        ArrayList<String> set1 = new ArrayList<>();
        set1.add("a");
        set1.add("e");
        set1.add("i");
        set1.add("o");
        Iterator<String> itr2 = set1.iterator();
        set1.add("KKK");
        while(itr2.hasNext())
        {

            System.out.println(itr2.next());
        }

    }
}

/*
CopyOnWriteArraySet internally uses CopyOnWriteArrayList.
Unlike HashSet CopyOnWriteArraySet maintains insertion order.
Iterator returned by CopyOnWriteArraySet is fail-safe(we can add elements into set even after getting iterator).
*/