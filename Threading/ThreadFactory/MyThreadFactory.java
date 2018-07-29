// This program uses two annonymous inner classes
import java.util.concurrent.ThreadFactory;
class MyThreadFactory
{
	public static void main(String...s)
	{  
		Thread t=new ThreadFactory()
		              {
		              	public Thread newThread(Runnable r)//newThread() method mein Runnable ko implement karne wali class ka Object jaayega.
		              	{return new Thread(r);}
		              }.newThread(new Runnable(){public void run(){System.out.println(Thread.currentThread().getName());}});
t.start();         
	}

}
