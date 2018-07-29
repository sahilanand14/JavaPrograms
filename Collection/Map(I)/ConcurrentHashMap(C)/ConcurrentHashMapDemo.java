import java.util.*;
import java.util.concurrent.*;
class ConcurrentHashMapDemo
{
	public static void main(String...s)
	{
		ConcurrentHashMap<Integer,String> hm=new ConcurrentHashMap<>();
		add(hm);
		Set<Integer> ss=hm.keySet();
		Iterator<Integer> itr=ss.iterator();
		while(itr.hasNext())
		{
              int i=itr.next();
              if(i==102)
              	hm.put(55,"priyanshu");
		}
		System.out.println(hm); 
	}

	public static void add(ConcurrentHashMap<Integer,String> hm)
	{
		hm.put(100,"sahil");
		hm.put(101,"anand");
		hm.put(102,"manjeet");
		hm.put(104,"lalit");

	}
}

// ConcurrentHashMap is thread safe.
// If instead of ConcurrentHashMap we use HashMap, we get ConcurrentModificationException.