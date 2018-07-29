import java.util.concurrent.CountDownLatch;

class MainHR
{
    public static void main(String...s)
    {

        CountDownLatch cdl = new CountDownLatch(4);
        new TechLead(cdl, "sahil").start();
        new TechLead(cdl, "manjeet").start();
        new TechLead(cdl, "lalit").start();
        new TechLead(cdl, "dushyant").start();
        try
        {
            System.out.println("HR manager waiting for recruitment to complete");
            cdl.await();
            // main thread will proceed only after countDown() method will be called 4 times
            System.out.println("Now HR is leaving as recruitment is completed");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }


}


class TechLead extends Thread
{
    CountDownLatch count;
    TechLead(CountDownLatch count, String name)
    {
        super(name);
        this.count = count;

    }
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is recruited");
        // Decreases count by 1
        count.countDown();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is dead");
    }


}