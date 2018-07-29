/*A semaphore controls access to a shared resource
through the use of a counter. If the counter is greater than zero, then access is allowed. If
it is zero, then access is denied.
What the counter is counting are permits that allow access to
the shared resource. Thus, to access the resource, a thread must be granted a permit from
the semaphore.
In general, to use a semaphore, the thread that wants access to the shared resource tries
to acquire a permit. If the semaphore’s count is greater than zero, then the thread acquires
a permit, which causes the semaphore’s count to be decremented. Otherwise, the thread
will be blocked until a permit can be acquired. When the thread no longer needs access
to the shared resource, it releases the permit, which causes the semaphore’s count to be
incremented. If there is another thread waiting for a permit, then that thread will acquire
a permit at that time. Java’s Semaphore class implements this mechanism.
Semaphore has the two constructors shown here:
Semaphore(int num)
Semaphore(int num, boolean how)
Here, num specifies the initial permit count. Thus, num specifies the number of threads
that can access a shared resource at any one time. If num is one, then only one thread can
access the resource at any one time. By default, waiting threads are granted a permit in an
undefined order. By setting how to true, you can ensure that waiting threads are granted a
permit in the order in which they requested access.
To acquire a permit, call the acquire( ) method, which has these two forms:
void acquire( ) throws InterruptedException
void acquire(int num) throws InterruptedException
The first form acquires one permit. The second form acquires num permits. Most often, the
first form is used. If the permit cannot be granted at the time of the call, then the invoking
thread suspends until the permit is available.
To release a permit, call release( ), which has these two forms:
void release( )
void release(int num)
The first form releases one permit. The second form releases the number of permits
specified by num.
To use a semaphore to control access to a resource, each thread that wants to use that
resource must first call acquire( ) before accessing the resource. When the thread is done
with the resource, it must call release( )



*/
import java.util.concurrent.*;
import java.util.*;
class RunSemaphore
{
    public static void main(String[] args)
    {
        Semaphore semaphore = new Semaphore(2);//change number of permits to 1 and see the output.

        new Thread(new IncCount(semaphore), "Increment_Count_Thread" ).start();
        new Thread( new DecCount(semaphore), "Decrement_count_Thread").start();

    }

}

class Shared
{
    static int count = 0;
}

class IncCount implements Runnable
{
    Semaphore semaphore;
    IncCount(Semaphore semaphore)
    {
        this.semaphore = semaphore;

    }
    public void run()
    {
        try
        {

            System.out.println(Thread.currentThread().getName() + " is waiting for permit");
            semaphore.acquire();
            // semaphore.acquire(3); aquires 3 permits.
            System.out.println(Thread.currentThread().getName() + " aquires the permit");
            for(int i = 0; i < 10; i++)
            {
                System.out.println(Thread.currentThread().getName() + "  " + ++Shared.count);
                Thread.sleep(1000);

            }

            System.out.println(Thread.currentThread().getName() + " releases the permit");
            semaphore.release();
            // semaphore.release(3);  releases 3 permits.




        }
        catch(Exception e)
        {

        }
    }
}




class DecCount implements Runnable
{
    Semaphore semaphore;

    DecCount(Semaphore semaphore)
    {
        this.semaphore = semaphore;

    }
    public void run()
    {
        try
        {

            System.out.println(Thread.currentThread().getName() + " is waiting for permit");
            semaphore.acquire();
            // semaphore.acquire(3); aquires 3 permits.
            System.out.println(Thread.currentThread().getName() + " aquires the permit");
            for(int i = 0; i < 10; i++)
            {
                System.out.println(Thread.currentThread().getName() + "  " + --Shared.count);
                Thread.sleep(1000);

            }

            System.out.println(Thread.currentThread().getName() + " releases the permit");
            semaphore.release();
            // semaphore.release(3);  releases 3 permits.




        }
        catch(Exception e)
        {

        }
    }

}
