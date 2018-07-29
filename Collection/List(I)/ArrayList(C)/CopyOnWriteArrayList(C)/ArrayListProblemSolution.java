// CopyOnWriteArrayList is same as ArrayList

/**
 * A thread-safe variant of {@link java.util.ArrayList} in which all mutative
 * operations ({@code add}, {@code set}, and so on) are implemented by
 * making a fresh copy of the underlying array.
 *
 * <p>This is ordinarily too costly, but may be <em>more</em> efficient
 * than alternatives when traversal operations vastly outnumber
 * mutations, and is useful when you cannot or don't want to
 * synchronize traversals, yet need to preclude interference among
 * concurrent threads.  The "snapshot" style iterator method uses a
 * reference to the state of the array at the point that the iterator
 * was created. This array never changes during the lifetime of the
 * iterator, so interference is impossible and the iterator is
 * guaranteed not to throw {@code ConcurrentModificationException}.
 * The iterator will not reflect additions, removals, or changes to
 * the list since the iterator was created.  Element-changing
 * operations on iterators themselves ({@code remove}, {@code set}, and
 * {@code add}) are not supported. These methods throw
 * {@code UnsupportedOperationException}.
 */
import java.util.*;
import java.util.concurrent.*;
class ArrayListProblemSolution
{
	public static void main(String...s) throws Exception
	{
		CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<String>();
		al.add("c");al.add("c++");al.add("Angular");al.add("nodejs");al.add("Python");al.add("Html");
		Thread1 t1=new Thread1(al);
		Thread2 t2=new Thread2(al);
		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t2);
		tt1.setPriority(10);
		tt1.start();
		tt2.start();
		tt1.join();tt2.join();
		System.out.println(al);


	}
}

class Thread1 implements Runnable
{   
	CopyOnWriteArrayList<String> al;
	Thread1(CopyOnWriteArrayList<String> al)
	{
		this.al=al;
	}
	public void run()
	{
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			try{
			System.out.println("Name: "+itr.next());
			Thread.sleep(2000);
		      }catch(InterruptedException e){}
		}

	}
}
class Thread2 implements Runnable
{
	CopyOnWriteArrayList<String> al;
	Thread2(CopyOnWriteArrayList<String> al)
	{
		this.al=al;
	}
	public void run()
	{
		try{
				for(int i=0;i<5;i++)
					{
						al.add("Java");al.add("Javascript");
						Thread.sleep(100);
			        }
	     	}catch(InterruptedException e){}

	}
}