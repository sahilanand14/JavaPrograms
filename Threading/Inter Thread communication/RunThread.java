class RunThread
{
public static void main(String...s)
{
  JiskeLiyeWait j=new JiskeLiyeWait();
  new Waiter(j,"Waiter-Thread1").start();new Waiter(j,"Waiter-Thread2").start();
  new Notifier(j,"Notifier-Thread").start();
  for(int i=0;i<7;i++)
  	System.out.println(Thread.currentThread().getName()+"  "+i);
  System.out.println("End of main");
}

}

class Waiter extends Thread
{  JiskeLiyeWait jkw;
	Waiter( JiskeLiyeWait jkw,String name)
	{
		super(name);
		this.jkw=jkw;
	}

	public void run()
	{
		synchronized(jkw)
		{
			System.out.println(Thread.currentThread().getName()+" Attempting to wait");
			try{jkw.wait();}
			catch(Exception e){}
			for(int i=0;i<5;i++)
              System.out.println("More statements in synchronized block of "+ Thread.currentThread().getName()+" after receiving notificaton");
			// try{jkw.wait();}
			// catch(Exception e){} //if thread again goes in waiting state it will not be notified.
		}  
	}



}
class Notifier extends Thread
{
 JiskeLiyeWait jkw;
	Notifier( JiskeLiyeWait jkw,String name)
	{
		super(name);
		this.jkw=jkw;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"  doing some stuff outside synchronized block");
		synchronized(jkw)
		{
			System.out.println(Thread.currentThread().getName()+"  attempting to notify waiter Thread");
			 //waiks up any one thread "currently waiting" for lock on jkw.
			jkw.notify();
			//waiks up all threads "currently waiting" for lock on jkw. if only one thread is currently waiting it is 
			//awaken. But if later on it  again it goes in waiting state then nothing happens.
		
			//jkw.notifyAll(); 
				System.out.println("doing some other stuff after notifying");
			for(int i=0;i<10;i++)
				System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}


}

class JiskeLiyeWait
{

}