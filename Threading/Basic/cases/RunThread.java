class RunThread
{
	public static void main(String...s)
	{
		new MyThread("sahil").start();
		new MyThread("lalit").run();     //run will behave as a normal method. No new Thread will be started.
		for(int i=0;i<10;i++)
		System.out.println("in main thread");
	}
}
class MyThread extends Thread
{  MyThread(String s)
	{super(s);}
	public void run()
	{   for(int i=0;i<10;i++)
		System.out.println(Thread.currentThread().getName());
	}

  public void start()
  { 
  	//this statement starts the new thread and now the run method runs on a new thread.
  	//without this statement start will behave as a normal method of MyThread class.
  	super.start();     
  	       
  	for(int i=0;i<7;i++)
  	System.out.println(Thread.currentThread().getName()+"  in start");
  }


}