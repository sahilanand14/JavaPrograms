import java.util.*;
class Basic
{
	public static void main(String...s)
	{
		HashMap<Integer,String> hm=new HashMap<>();
		//put method
		hm.put(1,"sahil");
		hm.put(2,"ahil");
		hm.put(4,"hil");
		hm.put(5,"il");
		hm.put(6,"sahilnew");
		System.out.println(hm);
		//getting key-value pair as Entry class objects
		Set s1=hm.entrySet();
		System.out.println(s1);
		//getting set of all keys as Set
		Set s2=hm.keySet();
		System.out.println(s2);
		//getting set of all values as Collection
		Collection s4=hm.values();
		System.out.println(s4);
		//getting value corresponding to key
		String value=hm.get(1);
		System.out.println(value);
		//checking if hashmap has the desired value.
		System.out.println(hm.containsValue("il"));
		//checking if hashmap has the desired key.
		System.out.println(hm.containsKey(1));
		//getting size of hashmap
		System.out.println(hm.size());
		//checking if hashmap is empty
		System.out.println(hm.isEmpty());
		//this will return null as no key (9) is present 
		System.out.println(hm.remove(9));
		//this returns the value corresponding to the removed key.
		System.out.println(hm.remove(4));


		//accessing map through iterator
		Iterator<Integer> itr1=s2.iterator();
		while(itr1.hasNext())
			{System.out.println(itr1.next());}


		Iterator<String> itr2=s4.iterator();
		while(itr2.hasNext())
			{   
				System.out.println(itr2.next());}
		

		Iterator<Map.Entry> itr4=s1.iterator();
		while(itr4.hasNext())
			{Map.Entry me=itr4.next();
			System.out.println(me.getKey()+"==>"+me.getValue());}


	}
}