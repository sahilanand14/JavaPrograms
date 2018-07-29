import java.util.*;
class TreeMapCustomSort
{
	public static void main(String...s)
	{
		Comparator c1=new CompareId();
		Comparator c2=new CompareName();
		TreeMap<Emp,Integer> tm=new TreeMap<>(c2);//sort according to Emp name.
		// TreeMap<Emp,Integer> tm=new TreeMap<>(c1); sort according to Emp id.
		tm.put(new Emp(101,"Sahil"),10000);
		tm.put(new Emp(104,"anand"),1000);
		tm.put(new Emp(102,"manjeet"),100001);
		tm.put(new Emp(106,"lalit"),10);
		tm.put(new Emp(105,"mohit"),100090);
		show(tm);

	}

	public static void show(TreeMap t)
	{
		Set ss=t.entrySet();
		Iterator<Map.Entry> itr =ss.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=itr.next();
			Emp e=(Emp)me.getKey();
			System.out.println(e.id+" "+e.name+" ==> "+me.getValue());
		}
	}
}
class Emp
{
	String name;
	int id;
	Emp(int id,String name)
	{
		this.name=name;
		this.id=id;
	}
}
class CompareId implements Comparator<Emp>
{
	public int compare(Emp obj1,Emp obj2)
	{
		if(obj1.id>obj2.id)
			return 1;
		else
			return -1;
	}
}
class CompareName implements Comparator<Emp>
{
	public int compare(Emp obj1,Emp obj2)
	{
		
		return obj1.name.compareTo(obj2.name);

	}
}