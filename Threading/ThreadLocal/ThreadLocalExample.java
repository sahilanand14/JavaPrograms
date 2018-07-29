/**
 * ThreadLocal class provides thread-local variables.  These variables differ from
 * their normal counterparts in that each thread that accesses one (via its
 * {@code get} or {@code set} method) has its own, independently initialized
 * copy of the variable.  {@code ThreadLocal} instances are typically private
 * static fields in classes that wish to associate state with a thread (e.g.,
 * a user ID or Transaction ID).
 *
 * <p>For example, the class below generates unique identifiers local to each
 * thread.
 * A thread's id is assigned the first time it invokes {@code ThreadId.get()}
 * and remains unchanged on subsequent calls.
 * <pre>
 * import java.util.concurrent.atomic.AtomicInteger;
 *
 * public class ThreadId {
 *     // Atomic integer containing the next thread ID to be assigned
 *     private static final AtomicInteger nextId = new AtomicInteger(0);
 *
 *     // Thread local variable containing each thread's ID
 *     private static final ThreadLocal&lt;Integer&gt; threadId =
 *         new ThreadLocal&lt;Integer&gt;() {
 *             &#64;Override protected Integer initialValue() {
 *                 return nextId.getAndIncrement();
 *         }
 *     };
 *
 *     // Returns the current thread's unique ID, assigning it if necessary
 *     public static int get() {
 *         return threadId.get();
 *     }
 * }
 * </pre>
 * <p>Each thread holds an implicit reference to its copy of a thread-local
 * variable as long as the thread is alive and the {@code ThreadLocal}
 * instance is accessible; after a thread goes away, all of its copies of
 * thread-local instances are subject to garbage collection (unless other
 * references to these copies exist).
*/
class ThreadLocalExample
{
public static void main(String...s)
{
MyThread t1=new MyThread(); //we create only one MyThread object hence only 1 variable of type ThreadLocal<Integer> is created.
Thread tt1=new Thread(t1);
Thread tt2=new Thread(t1);
Thread tt4=new Thread(t1);
tt1.start();
tt2.start();
tt4.start();
}
}
class MyThread implements Runnable
{
	ThreadLocal<Integer> local=new ThreadLocal<Integer>();
	public void run()
	{
      int z=(int)(Math.random()*100D);//assign a random value to z each time run method is executed by a thread.
      System.out.println(Thread.currentThread().getName()+"  "+z);
      local.set(z);
      try
      {
	   Thread.sleep(1000);//this thread sleeps and meanwhile other thread runs.hence value of local would have been changed by other thread if it was normal variable.
	   }catch(InterruptedException e){}
        
        System.out.println(Thread.currentThread().getName()+"  "+local.get()); 

	}

}
