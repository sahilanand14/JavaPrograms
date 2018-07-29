import java.util.*;
class ArrayListProblem
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("c");al.add("c++");al.add("Angular");al.add("nodejs");al.add("Python");al.add("Html");
		Thread1 t1=new Thread1(al);
		Thread2 t2=new Thread2(al);
		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t2);
		tt1.setPriority(10);
		tt1.start();
		tt2.start();


	}
}

class Thread1 implements Runnable
{   
	ArrayList<String> al;
	Thread1(ArrayList<String> al)
	{
		this.al=al;
	}
	public void run()
	{
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			try{
			System.out.println("Name: "+itr.next());
			Thread.sleep(2000);
		      }catch(InterruptedException e){}
		}

	}
}
class Thread2 implements Runnable
{
	ArrayList<String> al;
	Thread2(ArrayList<String> al)
	{
		this.al=al;
	}
	public void run()
	{
		try{
				for(int i=0;i<5;i++)
					{
						al.add("Java");al.add("Javascript");
						Thread.sleep(1900);
			        }
	     	}catch(InterruptedException e){}

	}
}