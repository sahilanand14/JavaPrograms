import java.util.concurrent.atomic.*;
class WithAtomic
{
	public static void main(String...s)
	{
		MyThread t1=new MyThread();
		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t1);
		tt1.start();
		tt2.start();
		try{
		tt1.join();
		tt2.join();
		}
		catch(InterruptedException e){}
		System.out.println(t1.getCount());// gives same output everytime.
	}
}
class MyThread implements Runnable
{
	private AtomicInteger count=new AtomicInteger(); //creates AtomicInteger with 0 as default value.
	public void run() 
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("In Thread: "+Thread.currentThread().getName());
			try
			{Thread.sleep(1000);}
			catch(InterruptedException e){}
			count.incrementAndGet();// increments the value of value field of count object by 1 and returns the new value.
		}

	}
	public int getCount()
	{
	return count.get();//return the value of value field of count object
	}
}



// The AtomicInteger class has a private datamember ,int value in which it store the value.

// Some methods of AtomicInteger class:
/* public final int get() {
         return this.value;
     }

 public final void set(int newvalue)
 public final int getAndSet(int newvalue)
 public final boolean compareAndSet(int oldvaluetocompare,int newvalue)
 public final int getAndIncrement()
 public final int incrementAndGet()
 public final int getAndDecrement()
 public final int decrementAndGet()
 public final int getAndAdd(int value)
 public final int addAndGet(int value)
 
 		