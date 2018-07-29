class RunThread
{
	public static void main(String[] args) {
		
		Shared s=new Shared(); //creating only one object of shared class which will be used by different threads.
		MyRunnable runnable=new MyRunnable(s);
		Thread t1=new Thread(runnable,"Thread1");
		Thread t2=new Thread(runnable,"Thread2");
		Thread t3=new Thread(runnable,"Thread3");
		t1.start();t2.start();t3.start();

	}
}


class MyRunnable implements Runnable
{
	Shared s;
	MyRunnable(Shared s)
	{
		this.s=s;
	}
	public void run()
	{
			s.show();   
			s.display();
	}
}


class Shared
{
	public void show()
	{

		System.out.println("starting in show:: "+Thread.currentThread().getName());  //prints the name of the thread on which this method is being executed.
		for(int i=0;i<5;i++)
		{  
		 try{
		Thread.sleep(2000);
			}catch(InterruptedException e){e.printStackTrace();}

			System.out.println(Thread.currentThread().getName()+new java.util.Date());
		}
		



	}

	public synchronized void display()
	{



		System.out.println("lock aquired by:: "+Thread.currentThread().getName());  //prints the name of the thread on which this method is being executed.
		for(int i=0;i<5;i++)
		{
			try{
		Thread.sleep(2000);
			}catch(InterruptedException e){e.printStackTrace();}

			System.out.println(Thread.currentThread().getName()+new java.util.Date());
		}
		
				



	}
}