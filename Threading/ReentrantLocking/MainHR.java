import java.util.concurrent.locks.ReentrantLock;
class MainHR
{

public static void main(String...s)
{
	ReentrantLock rl=new ReentrantLock();
	new TechLead(rl,"lalu").start();
	new TechLead(rl,"bhalu").start();
	new TechLead(rl,"shalu").start();

	System.out.println("HR completes his work and exits");
}

}

class TechLead extends Thread
{
 ReentrantLock question_paper;
TechLead(ReentrantLock r,String name)
{
	super(name);
   question_paper=r;
}
public void run()
{
	System.out.println(getName()+" is waiting for question paper");
	
	question_paper.lock();
	
	System.out.println(getName()+" takes questionpaper");
	System.out.println(getName()+" starts taking test");
	try{Thread.sleep(1000);}catch(Exception e){}
	System.out.println(getName()+" has taken test");
	System.out.println(getName()+" returns question_paper");

	question_paper.unlock();
}

}