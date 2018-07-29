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
			s.show();     //Thread1 executes show on instance of Shared class.
			
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
	public void show()
	{

		System.out.println("starting in show:: "+Thread.currentThread().getName());  //prints the name of the thread on which this method is being executed.
		for(int i=0;i<5;i++)
		{  
		 try{
		Thread.sleep(2000);
			}catch(InterruptedException e){e.printStackTrace();}

			System.out.println(Thread.currentThread().getName()+"  "+new java.util.Date());
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

			System.out.println(Thread.currentThread().getName()+ "  "+new java.util.Date());
		}
		
				



	}
}



// Conclusion:

// A synchronized method and a non-synchronized methods can be executed simultaneously on a single object by 2 threads.
// This is because lock of object is required only by Thread that executes synchronized method.