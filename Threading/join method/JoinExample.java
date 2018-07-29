class JoinExample
{
	public static void main(String...s)
	{
		MyThread1 t1=new MyThread1("sahil");
		t1.start();
		try{t1.join();}catch(InterruptedException e){e.printStackTrace();}
		System.out.println(t1.total);
	}
}

class MyThread1 extends Thread
{
	MyThread1(String s)
	{
		super(s);
	}

	int total;
	public void run()
	{
		for(int i=0;i<10;i++)
			total+=i;
	}
}