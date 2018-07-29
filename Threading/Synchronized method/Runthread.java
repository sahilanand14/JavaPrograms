class Runthread
{
public static void main(String...s)
{
ThreadSafe tf=new ThreadSafe();  //ThreadSafe class is a Synchronized class. This means that if 1 object of thread safe class is given to different threads then methods called by the object will be executed one after the other
Thread1 t1=new Thread1(tf,"Thread1");
Thread2 t2=new Thread2(tf,"Thread2");
Thread4 t4=new Thread4(tf,"Thread4");



}


}

class Thread1 extends Thread
{ 
	ThreadSafe s;
	Thread1(ThreadSafe ts,String name)
	{
		super(name);
		s=ts;
		start();
	}

	public void run()
	{
       s.show(Thread.currentThread().getName(),10);
       System.out.println("The sum of 10 and 20 is  "+s.add(10,20));

	}
}



class Thread2 extends Thread
{ 
	ThreadSafe s;
	Thread2(ThreadSafe ts,String name)
	{
		super(name);
		s=ts;
		start();
	}

	public void run()
	{
       s.show(Thread.currentThread().getName(),100);
       System.out.println("The sum of 100 and 200 is  "+s.add(100,200));

	}
}





class Thread4 extends Thread
{ 
	ThreadSafe s;
	Thread4(ThreadSafe ts,String name)
	{
		super(name);
		s=ts;
		start();
	}

	public void run()
	{
       s.show(Thread.currentThread().getName(),1000);
       System.out.println("The sum of 1000 and 2000 is  "+s.add(1000,2000));

	}
}


class ThreadSafe
{ int x,y;

 synchronized public void show(String s,int num)
{   x=num;

	System.out.println("Starting in method: "+s+" "+x);

	try{Thread.sleep(500);}catch(InterruptedException e){e.printStackTrace();}
	System.out.println("Exiting method: "+s+" "+x);
}

synchronized public int add(int a,int b)
{
	x=a;y=b;
	try{Thread.sleep(700);}catch(InterruptedException e){e.printStackTrace();}
	return x+y;
}


}