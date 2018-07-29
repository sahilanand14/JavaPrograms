class Thread1 extends Thread
{

Thread1(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread().getName());
try{Thread.sleep(1000);}
catch(InterruptedException e){}


}

}

}
class Thread2 extends Thread
{
Thread2(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(Thread.currentThread().getName());
try{Thread.sleep(1000);}
catch(InterruptedException e){}


}



}

}
class Thread4 extends Thread
{
Thread4(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<15;i++)
{
System.out.println(Thread.currentThread().getName());
try{Thread.sleep(1000);}
catch(InterruptedException e){}


}





}

}