import java.util.*;
class SortedMapDemo
{
	public static void main(String...s)
	{
		SortedMap<Integer,String> sm=new TreeMap<>();
		sm.put(101,"sahil");
		sm.put(102,"anand");
		sm.put(104,"manjeet");
		sm.put(105,"yadav");
		sm.put(106,"lalit");
		sm.put(107,"yadav");
		sm.put(108,"hello");
		System.out.println("First key: "+sm.firstKey());
		System.out.println("Last key:"+sm.lastKey());
		SortedMap<Integer,String> sm2=sm.headMap(105);
		SortedMap<Integer,String> sm4=sm.tailMap(106);
		SortedMap<Integer,String> sm5=sm.subMap(102,107);
        System.out.println("Less than 105: "+sm2);
        System.out.println("Greater than equal to 106: "+sm4);
        System.out.println("Between [102,107): "+sm5);
        System.out.println("original sorted map: "+sm);
        
		

	}

}