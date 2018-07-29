class RunThread
{
public static void main(String...s)
{

Thread1 t1=new Thread1("Thread1");
Thread2 t2=new Thread2("Thread2");
Thread4 t4=new Thread4("Thread4");
//t1.run();t2.run();t4.run();        //run this without comments and comment next line.
t1.start();t2.start();t4.start();
for(int i=0;i<5;i++)
{
	System.out.println(Thread.currentThread().getName());
	try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
}
//try{t1.join();t2.join();t4.join();} catch(InterruptedException e){e.printStackTrace();}
System.out.println("Exiting main");
}


}

class Thread1 extends Thread
{ Thread1(String s)
	{super(s);}

	public void run()
	{  for(int i=0;i<10;i++)
		{System.out.println(Thread.currentThread().getName()); 
		//	System.out.println(getName());      comment the above line and run threads by calling run method directly
  			try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		}
	}




}
class Thread2 extends Thread
{

Thread2(String s)
	{super(s);}

	public void run()
	{  for(int i=0;i<15;i++)
		{System.out.println(Thread.currentThread().getName());
		//	System.out.println(getName());        comment the above line and run threads by calling run method directly
  			try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		}
	}



}
class Thread4 extends Thread
{

Thread4(String s)
	{super(s);}

	public void run()
	{  for(int i=0;i<20;i++)
		{System.out.println(Thread.currentThread().getName());
		//	System.out.println(getName());    comment the above line and run threads by calling run method directly
  			try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		}
	}


}