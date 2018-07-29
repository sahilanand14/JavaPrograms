class Test
{
	public static void main(String...s)
	{
		MyArrayList al=new MyArrayList();
		
		// MyArrayList<Integer> al=new MyArrayList<>();
		String[] al2={"good","morning"};
	




		al.add(1);
		al.add(2);
		al.add(3);
		al.add("hello");
		al.add("this");
		al.add("is");
		al.add("my");
		al.add("own");
		al.add("Arraylist");
		

		al.set(4,"new");

		al.addAll(al2);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.capacity());
		MyIterator itr=al.iterator();
		// MyIterator<Integer> itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}

class MyArrayList<T> implements MyIterator<T>
{
	int next;
	int index=-1;
	Object object[];
	int size=10;
	float grow=0.5f;
	//constructors
	MyArrayList()
	{
		object=new Object[size];

	}
	MyArrayList(int size)
	{
		this.size=size;
		object=new Object[size];
	}
	public void add(T o)
	{
		if(index+1==size)
		{	Object tempArr[];
			int tempSize=size+(new Float(size*grow)).intValue();
			size=tempSize;
			tempArr=new Object[tempSize];
			for(int i=0;i<object.length;i++)
				tempArr[i]=object[i];
			object=tempArr;
		}
		
		object[++index]=o; //here index is being incremented

	}
	public String toString()
	{
		String str="{";
		for(int i=0;i<=index;i++)
			str+=object[i].toString()+",";
		return str+"}";
	}

	public boolean hasNext()
	{	
		return(index<next?false:true);
	}
	public Object next()
	{
		return object[next++];
	}
	public MyIterator iterator()
	{
		return this;
	}
	public int capacity()
	{
		return object.length;
	}
	public int size()
	{
		return index+1;
	}
	public void remove()
	{
		 index--; 
	}
	public boolean isEmpty()
	{
		return index==-1;
	}
	public boolean set(int index,T obj)
	{
		if(index<0)
			return false;
		else if(index>this.index)
			{
				add(obj);
				return true;
			}
		else
			{
				object[index]=obj;
					return true;
			}
	}
	public void addAll(T[] o)
	{
		for(int i=0;i<o.length;i++)
			add(o[i]);
	}



}
interface MyIterator<T>
{

	boolean hasNext();
	Object next();
}