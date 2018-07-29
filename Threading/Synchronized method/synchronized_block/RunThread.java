class RunThread
{
	public static void main(String[] args) {
		
		Shared s=new Shared(); //creating only one object of shared class which will be used by different threads.
		MyRunnable1 runnable1=new MyRunnable1(s);
		MyRunnable2 runnable2=new MyRunnable2(s);
		Thread t1=new Thread(runnable1,"Thread1");
		Thread t2=new Thread(runnable2,"Thread2");
		t1.start();t2.start();

	}
}


class MyRunnable1 implements Runnable
{
	Shared s;
	MyRunnable1(Shared s)
	{
		this.s=s;
	}
	public void run()
	{
			s.display();     //Thread1 executes display on instance of Shared class.
			
	}
}



class MyRunnable2 implements Runnable
{
	Shared s;
	MyRunnable2(Shared s)
	{
		this.s=s;
	}
	public void run()
	{
			
			s.display();    //Thread2 executes display on same instance of Shared class.
	}
}

class Shared
{
	
	public  void display()
	{
		for(int i=0;i<5;i++)
		{
			try{
		Thread.sleep(2000);
			}catch(InterruptedException e){e.printStackTrace();}

			System.out.println(Thread.currentThread().getName()+ "  "+new java.util.Date());
		}

		synchronized(this)
		{
		System.out.println("lock aquired by:: "+Thread.currentThread().getName());  //prints the name of the thread on which this method is being executed.
		for(int i=0;i<5;i++)
		{
			try{
		Thread.sleep(2000);
			}catch(InterruptedException e){e.printStackTrace();}

			System.out.println(Thread.currentThread().getName()+ "  "+new java.util.Date());
		}
	    }
		
				



	}
}



