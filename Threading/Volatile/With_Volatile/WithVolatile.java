//Problem still persists even after using volatile

class WithVolatile
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
		System.out.println(t1.getCount());  //prints different values of count on execution.
	}
}
class MyThread implements Runnable
{
	private volatile int count;
	public void run() 
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("In Thread: "+Thread.currentThread().getName());
			try
			{Thread.sleep(1000);}
			catch(InterruptedException e){}
			count++;
		}

	}
	public int getCount()
	{return count;}
}