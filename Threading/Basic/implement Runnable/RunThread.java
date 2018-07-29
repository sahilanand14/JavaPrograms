// We cant use throws to throw Checked Exceptions from run method.Therefore we need to use try catch only in run method.
// This is because run() method of  Runnable interface dosent throws any Exception. Hence when we override it in our class
//we cant also throw any Checked Exception. Moreover even if run() throw Exception we cant catch it in the main program.
//For more info see java_programs//inheritance//ExceptionAndInheritance




class RunThread
{
public static void main(String...s)
{

Thread1 t11=new Thread1();
Thread2 t22=new Thread2();
Thread4 t44=new Thread4();
Thread t1=new Thread(t11,"Thread1");
Thread t2=new Thread(t22,"Thread2");
Thread t4=new Thread(t44,"Thread4");
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

class Thread1 implements Runnable
{ 
	public void run()
	{  for(int i=0;i<10;i++)
		{System.out.println(Thread.currentThread().getName()); 
		//	System.out.println(getName());      comment the above line and run threads by calling run method directly
  			try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		}
	}




}
class Thread2 implements Runnable
{


	public void run()
	{  for(int i=0;i<15;i++)
		{System.out.println(Thread.currentThread().getName());
		//	System.out.println(getName());        comment the above line and run threads by calling run method directly
  			try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		}
	}



}
class Thread4 implements Runnable
{
	public void run()
	{  for(int i=0;i<20;i++)
		{System.out.println(Thread.currentThread().getName());
		//	System.out.println(getName());    comment the above line and run threads by calling run method directly
  			try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		}
	}


}