import java.util.*;
class IdentityHashMapDemo
{
	public static void main(String...s)
	{
		HashMap<String,String> hm=new HashMap<>();
		IdentityHashMap<String,String> ihm=new IdentityHashMap<>();
		hm.put(new String("sahil"),"46");
		hm.put(new String("sahil"),"48");
		ihm.put(new String("sahil"),"46");
		ihm.put(new String("sahil"),"48");
		System.out.println("HashMap contents: "+hm);
		System.out.println("IdentityHashMap contents: "+ihm);
		
	}

}

// IdentityHashMap uses '==' to compare keys which does reference comparison.
// HashMap uses equals() method to compare keys which does content comparison.