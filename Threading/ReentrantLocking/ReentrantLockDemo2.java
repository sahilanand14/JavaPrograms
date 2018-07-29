
import java.util.concurrent.locks.*;
class ReentrantLockDemo1
{ ReentrantLock l=new ReentrantLock();
	public void wish(String name)
	{
		l.lock();//line 1
		for(int i=0;i<10;i++)
		    {
			  System.out.print("Good morning:");
			  try{
				     Thread.sleep(2000);
			     }
			   catch(InterruptedException e){}
			   System.out.println(name);
		     }
			l.unlock();//line 2
	}

	}
	// if we comment line 1 and line 2 then threads will be executed simultaneously and we will get irregular output.
	//if we dont regular output as threads will be executed in order one by one.
class MyThread2 extends Thread
{
	ReentrantLockDemo1 l1;
	String name;
	MyThread2(ReentrantLockDemo1 l,String name)
	{
		this.l1=l;
		this.name=name;
	}
	public void run()
	{
		l1.wish(name);
	}

}


class ReentrantLockDemo2
{
 public static void main(String[] args) {
 	ReentrantLockDemo1 l=new ReentrantLockDemo1();
 	MyThread2 t1=new MyThread2(l,"Thread1");
 	MyThread2 t2=new MyThread2(l,"Thread2");
 	MyThread2 t4=new MyThread2(l,"Thread4");
 	t1.start();
 	t2.start();
 	t4.start();

 	
		
	}
}