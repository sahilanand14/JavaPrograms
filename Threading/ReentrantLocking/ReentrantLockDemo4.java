// this example illustrates tryLock() method.
// using this method our thread will never enter into waiting state.
//one thread aquires lock and sleeps. Meanwhile second thread try to aquire lock but cant so it executes else part without waiting for lock.
import java.util.concurrent.locks.*;
class ReentrantLockDemo4
{
	public static void main(String ...s)
	{
		MyThread4 t1=new MyThread4("Thread1");
		MyThread4 t2=new MyThread4("Thread2");
		t1.start();
		t2.start();
	}
}
class MyThread4 extends Thread
{
	static ReentrantLock l=new ReentrantLock();
	MyThread4(String name)
	{
		super(name);
	}
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+" got lock and is performing safe operation...");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" ....unable to get lock and hence executing alternate method.");

		}
	}
}