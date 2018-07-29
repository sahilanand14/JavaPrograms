//program in which Child Thread waits for Main Thread to complete.

class RunThread
{
public static void main(String...s)
{
    MyThread.t = Thread.currentThread();  //Main thread ka reference child thread k paas chala gya. Now child thread can call join() on main thread object

    MyThread t1=new MyThread("sahil");
    t1.start();
//    try{t1.join();}catch(InterruptedException f){f.printStackTrace();}  //This line results in deadlock,beacause parent and child thread are waiting for each other indefinitely
    for(int i=0;i<12;i++)
    {
    	System.out.println(Thread.currentThread().getName());
    	try{Thread.sleep(1500);}catch(InterruptedException e){}
    }
}

}

class MyThread extends Thread
{
	static Thread t;
	MyThread(String a)
	{super(a);}
	public void run() 
	{
		try{t.join();}catch(InterruptedException e){e.printStackTrace();}
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName());
	}
}