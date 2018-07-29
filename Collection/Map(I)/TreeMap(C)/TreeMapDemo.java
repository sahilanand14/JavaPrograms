import java.util.*;
class TreeMapDemo
{
	public static void main(String...s)
	{
		TreeMap tm=new TreeMap();
		tm.put(100,"sahil");
		tm.put(101,"anand");
		tm.put(102,"lalit");
		tm.put(104,109);//perfectly fine as we can insert heterogenous values
		// tm.put("hello","man"); gives ClassCastException at Runtime
		// tm.put(null,"manjeet");   gives NullPointerException. This is because equals() method is executed on key object, since it us null, we get NPE
		System.out.println(tm);
	}
}