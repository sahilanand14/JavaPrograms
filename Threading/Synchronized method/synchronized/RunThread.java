class RunThread
{
	public static void main(String...s)
	{  My m=new My();
		MyThread t1=new MyThread("Thread 1",m);
		MyThread t2=new MyThread("Thread 2",m);
		MyThread t4=new MyThread("Thread 4",m);
		t1.start();t2.start();t4.start();

	}
}
class MyThread extends Thread
{  My m1;
	MyThread(String s,My m1)
	{super(s);this.m1=m1;}


	public void run()
	{
	m1.show();  
	} 
}

class My
{
	static int x=20;
	synchronized public void show()
	{ for(int i=0;i<10;i++){
		System.out.println(Thread.currentThread().getName()+"  In show Method  "+x++);
		try{Thread.sleep(1000);}catch(Exception e){}
	}
	}
}