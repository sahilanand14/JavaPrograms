class WithoutVolatile
{
	public static void main(String...s)
	{
		MyThread t1=new MyThread();
		Thread tt1=new Thread(t1);//both Threads are given same object.
		Thread tt2=new Thread(t1);//both Threads are given same object.
		tt1.start();
		tt2.start();
		try{
		tt1.join();
		tt2.join();
		}
		catch(InterruptedException e){}
		System.out.println(t1.getCount());//we get different value of count on each execution . This means that value of count updated by one thread is not visible to other thread.
	}
}
class MyThread implements Runnable
{
	private int count;
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