
import java.util.concurrent.CyclicBarrier;

class MainHR
{
    public static void main(String...s)
    {
        CyclicBarrier cb = new CyclicBarrier(4);
        new TechLead(cb, "Sahil").start();
        new TechLead(cb, "Lalit").start();
        new TechLead(cb, "Manjeet").start();
        new TechLead(cb, "Dushyant1").start();


        System.out.println("Hr completes his work");

    }


}


class TechLead extends Thread
{
    CyclicBarrier barrier;
    TechLead(CyclicBarrier barrier, String name)
    {
        super(name);
        this.barrier = barrier;

    }

    public void run()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " recruited developer");
            System.out.println(Thread.currentThread().getName() + " Waiting for others to complete...");
            barrier.await();
            System.out.println("All finished recruiting" + Thread.currentThread().getName() + "  gives offer letter to candidate");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}