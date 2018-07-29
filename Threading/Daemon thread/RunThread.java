class RunThread
{
	public static void main(String...s)
	{
		MyThread t1=new MyThread("sahil");
		t1.setDaemon(true);
		t1.start();
		System.out.println(t1.isDaemon());

		 // this will throw exception as thread has already started.
		//t1.setDaemon(false);
		
		System.out.println("Main Thread dies");
	}
}
class MyThread extends Thread
{
	MyThread(String s)
	{super(s);}

	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		try{
		Thread.sleep(1000);
		}
		catch(InterruptedException e){e.printStackTrace();}
	}
}


// NOTE : we cant make main thread as daemon as it is started by JVM and once a thread is started we cant change its nature.