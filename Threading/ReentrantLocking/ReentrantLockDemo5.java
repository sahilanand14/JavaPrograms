// this example illustrates tryLock() method.
import java.util.concurrent.locks.*;
import java.util.concurrent.TimeUnit;
class ReentrantLockDemo5
{
	public static void main(String ...s)
	{
		MyThread5 t1=new MyThread5("Thread1");
		MyThread5 t2=new MyThread5("Thread2");
		t1.start();
		t2.start();
	}
}
class MyThread5 extends Thread
{  //as l is static its one copy will be made only and it will be shared by the 2 threads.
	static ReentrantLock l=new ReentrantLock();
	MyThread5(String name)
	{
		super(name);
	}
	public void run()
	{
		do{
              try{
		if(l.tryLock(1000,TimeUnit.MILLISECONDS))//wait 1 second for lock if lock is not available.
		{
			System.out.println(Thread.currentThread().getName()+" got lock ");
			
				Thread.sleep(10000);//sleeps for 10 seconds
			
			
			l.unlock();
			System.out.println(Thread.currentThread().getName()+" releases lock ");
			break;
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" ....unable to get lock and will try again");

		}
	}catch(InterruptedException e){}
	 
	 }while(true);
	
	}
}