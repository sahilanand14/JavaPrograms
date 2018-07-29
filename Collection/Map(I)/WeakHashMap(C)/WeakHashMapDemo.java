import java.util.*;
class WeakHashMapDemo
{
	public static void main(String...s)
	{

			WeakHashMap<Temp,String> whm=new WeakHashMap<>();
			HashMap<Temp,String> hm=new HashMap<>();
			Temp t1=new Temp();
			Temp t2=new Temp();
			whm.put(t1,"Sahil");
			hm.put(t2,"Sahil");
			System.out.println(whm);
			System.out.println(hm);
			t1=t2=null;
			System.gc();
			try{
				Thread.sleep(400);
			}catch(Exception e){}
			System.out.println("WaekHashMap contents: "+whm); //key in weak HashMap is GC when there is no Strong Reference to Key Object.
			System.out.println("HashMap contents: "+hm);


	}
}
class Temp
{
	protected void finalize()
	{
		System.out.println("Finalize method executed!!");
	}
}