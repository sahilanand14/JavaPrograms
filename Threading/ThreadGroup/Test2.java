class Test2
{
	public static void main(String ...s)
	{
		ThreadGroup pg=new ThreadGroup("ParentGroup");
		//adding childgroup to parent group.
		ThreadGroup cg=new ThreadGroup(pg,"ChildGroup");
		//adding 2 threads to parent group.
		MyThread t1=new MyThread(pg,"ChildThread1");
		MyThread t2=new MyThread(pg,"ChildThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		try{Thread.sleep(10000);}
		catch(InterruptedException e){}
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
       

         ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
         Thread[] t=new Thread[system.activeCount()];
         system.enumerate(t);
         for(Thread tt:t)
         {
         	System.out.println(tt.getName()+" , "+"is daemon? "+tt.isDaemon());
         }


	}
}
class MyThread extends Thread
{
	MyThread(ThreadGroup g,String name)
	{
		super(g,name);
	}

	public void run()
	{
		System.out.println("ChildThread");
		try{Thread.sleep(5000);}
		catch(InterruptedException e){}
	}
}