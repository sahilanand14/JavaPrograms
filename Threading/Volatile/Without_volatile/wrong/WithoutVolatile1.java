// this program is wrong as it dosent use threading
class WithoutVolatile1
{
	public static void main(String...s)
	{
		
		MyThread1 tt1=new MyThread1();
		MyThread1 tt2=new MyThread1();
		tt1.start();
		tt2.start();
		try{
		tt1.join();
		tt2.join();
		}
		catch(InterruptedException e){}
		System.out.println(tt2.getCount());
		System.out.println(tt1.getCount());
	}
}
class MyThread1 extends Thread
{
	private int count;
	public void run() 
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("In Thread: "+Thread.currentThread().getName());
			try
			{Thread.sleep(1000);}
			catch(InterruptedException e){}
			count++;
		}

	}
	public int getCount()
	{return count;}
}