import java.util.*;
class ArrayListDemo1
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("sahil");
		al.add("sahil1");
		al.add("sahil2");
		al.add(null);
		//al.add(new Integer(8));

		Iterator i=al.iterator();
		while(i.hasNext())
			{
				String obj=(String)i.next();
				System.out.println(obj);
				
			}


	}
}