
// The beauty of interrupt() is that interrupt call never gets wasted.
// In this case if t1 Thread is in waiting state and interrupt is called on it, then it will come out of sleeping state throwing 
// InterruptedException. 
// Also if t1 is not in sleeping state when interrupt() is called, then the call will not get wasted. As soon as t1 goes in sleeping 
//state in future it will come out of it throwing InterruptedException.
// But sirf 1 baar hi sleep state se Bahar aayega baar baar nhi.
// IMPORTANT:
// if thread dosent go in sleeping state in its entire lifetme then interrupt call gets wasted.
//this is the only case when interrupt call gets wasted

class RunThread
{
	public static void main(String...s)
	{
		MyThread t1=new MyThread("sahil");
		t1.start();
		t1.interrupt();
	   
		System.out.println("this is main thread");
	}
}

class MyThread extends Thread
{
	MyThread(String s)
	{super(s);}

	public void run()
	{   
		for(int i=0;i<200;i++)
		{
			System.out.println(Thread.currentThread().getName());
       
		}
	
	try{Thread.sleep(1000);}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted when sleeping");
		}
          
           //if thread again sleeps then it wont be interrupted whatsoever.

		// try{Thread.sleep(7000);}
		// catch(InterruptedException e)
		// {
		// 	System.out.println("Interrupted when sleeping");
		// }
	}
}