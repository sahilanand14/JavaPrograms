class sample
{
public static void main(String...s)
{

Thread1 t1=new Thread1("Thread1");
Thread1 t2=new Thread1("Thread2");
Thread1 t4=new Thread1("Thread4");
t1.start();t2.start();t4.start();
try{
t1.join();
t2.join();
t4.join();
}
catch(InterruptedException e){}

System.out.println("Exiting main");
}


}
class Thread1 extends Thread
{
 Thread1(String name)
 {
 	super(name);
 }
public void run()
{
for(int i=0;i<10;i++)
{System.out.println(Thread.currentThread().getName()+" is running");

try{Thread.sleep(1000);}catch(InterruptedException e){}
}
}



}