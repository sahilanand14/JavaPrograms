import java.util.*;
class ArrayListAddArray
{
	public static void main(String...s)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		int x[]={1,2,4,5,6,7,8};
		for(int i=0;i<x.length;i++)
			al.add(x[i]);
		System.out.println(al);

		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{  Integer z=itr.next();
			System.out.println(z+"   "+z.intValue());
		}
	}


}