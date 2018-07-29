class DeadLock
{
    public static void main(String[] args)
    {
        Object lock1 = new Object();
        Object lock2 = new Object();

        new Thread1("Thread1", lock1, lock2).start();
        new Thread2("Thread2", lock1, lock2).start();


    }


}

class Thread1 extends Thread
{
    Object lock2;
    Object lock1;
    Thread1(String name, Object lock1, Object lock2)
    {
        super(name);
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + " is aquiring lock1");
            synchronized(lock1)
            {
                System.out.println(Thread.currentThread().getName() + " aquired lock1 and is in synchronized block");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " is waiting for lock2");
                synchronized(lock2)
                {
                    System.out.println(Thread.currentThread().getName() + " is has lock2");

                }

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}



class Thread2 extends Thread
{
    Object lock2;
    Object lock1;
    Thread2(String name, Object lock1, Object lock2)
    {
        super(name);
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + " is aquiring lock2");
            synchronized(lock2)
            {
                System.out.println(Thread.currentThread().getName() + " aquired lock2 and is in synchronized block");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " is waiting for lock1");
                synchronized(lock1)
                {
                    System.out.println(Thread.currentThread().getName() + " is has lock1");

                }

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}