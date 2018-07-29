class RunThread
{
    public static void main(String[] args)
    {

        Shared s = new Shared(); //creating only one object of shared class which will be used by different threads.
        MyRunnable1 runnable1 = new MyRunnable1(s);
        MyRunnable2 runnable2 = new MyRunnable2(s);
        Thread t1 = new Thread(runnable1, "Thread1");
        Thread t2 = new Thread(runnable2, "Thread2");
        t1.start();
        t2.start();

    }
}


class MyRunnable1 implements Runnable
{
    Shared s;
    MyRunnable1(Shared s)
    {
        this.s = s;
    }
    public void run()
    {
        s.show();     //Thread1 executes  synchronized show on instance of Shared class.

    }
}



class MyRunnable2 implements Runnable
{
    Shared s;
    MyRunnable2(Shared s)
    {
        this.s = s;
    }
    public void run()
    {

        s.staticSynchronized();    //Thread2 executes static synchronized method on same instance of Shared class.
    }
}

class Shared
{
    public synchronized void show()
    {

        System.out.println("starting in show:: " + Thread.currentThread().getName()); //prints the name of the thread on which this method is being executed.
        for(int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "  " + new java.util.Date());
        }




    }

    public  static synchronized void staticSynchronized()
    {



        System.out.println("lock aquired by:: " + Thread.currentThread().getName()); //prints the name of the thread on which this method is being executed.
        for(int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "  " + new java.util.Date());
        }





    }
}



// Conclusion:

// A synchronized method and a static-synchronized methods can be executed simultaneously on a single object by 2 threads.
//To execute synchronized method of a class, we reqire lock on that class instance(object) .But to execute static synchronized method we require lock on
// the instance(object) of Class class representing that class.