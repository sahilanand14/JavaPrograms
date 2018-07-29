// Every thread belongs to a threadgroup in java.
//main() method is called by main Thread.
// main thread belongs to main group.
// like every class in java is a child of Object class likewise every ThreadGroup in java is a child group of System Group either directly or indirectly.
//main group is a direct child of System group.
//system group contains system level thread like Finalizer,AttachListener,SignalDispatcher,ReferenceHandler etc.
class Test1
{
	public static void main(String []args)
	{
	    System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("ThreadGroupName: "+Thread.currentThread().getThreadGroup().getName());
		System.out.println("Parent ThreadGroupName: "+Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup tg1=new ThreadGroup("first group");
		System.out.println("parent group of first group: "+tg1.getParent().getName());
		ThreadGroup tg2=new ThreadGroup(tg1,"second group");
		System.out.println("parent group of second group: "+tg2.getParent().getName());
		
//default MAX_PRIORITY of ThreadGroup is 10.
//default priority of a Thread is 5.
		Thread t1=new Thread(tg1,"Thread1");
		Thread t2=new Thread(tg1,"Thread2");
		tg1.setMaxPriority(4);
		Thread t4=new Thread(tg1,"Thread4");
        System.out.println(t1.getName()+" "+t1.getPriority());
        System.out.println(t2.getName()+" "+t2.getPriority());
        System.out.println(t4.getName()+" "+t4.getPriority());

        

	}
}