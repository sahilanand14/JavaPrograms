class Runthread
{
public static void main(String...s)
{
Thread1 t1=new Thread1("Thread1");
Thread2 t2=new Thread2("Thread2");
Thread4 t4=new Thread4("Thread4");
t1.start();
t2.start();
t4.start();
for(int i=0i<20;i++)
{
System.out.println(Thread.currentThread().getName());
try{Thread.sleep(1000);}
catch(InterruptedException e){}




}

}



}