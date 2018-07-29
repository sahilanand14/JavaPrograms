//NOTE: Collection interface extends Iterable interface
//Hence, every class which is child of Collection interface needs to implement iterator() method.
//All classes like ArrayList,Vector,LinkedList have implemented iterator() method exactly in similar manner as shown below.


import java.util.Iterator;
class Demo implements Iterable<String>
{
	String str;
	Demo(String str)
	{
		this.str=str;
	}
	//since our class implements Iterable, therefore we need to override the single abstract method of Iterable interface i.e; iterator

   public Iterator iterator()
    {
       return new MyIterator();
    }

    private class MyIterator implements Iterator<String>
    {   int counter=0;
    	//since MyIterator implements Iterator we need to override 2 abstract method of Iterator i.e; hasNext() and next()

       public boolean hasNext()
       {
           return counter<str.length();

       }
       public String next()
       {
       	if(counter<str.length())
       		return String.valueOf(str.charAt(counter++));
       	else 
       		return null;
       }


    }

}
class Demo2
{
	public static void main(String...s)
	{
		Demo d1=new Demo("sahilanand");
		Iterator<String> i=d1.iterator();//d1.iterator() gives object of Iterator type ,but Interface ka object nhi bnta.Therefore iterator ko implement krne wali class i.e; MyIterator ka object banega.
		while(i.hasNext())
		{
			String str=i.next();
			System.out.print(str+" ");
		}
		System.out.println(i.hasNext());
	}
}
