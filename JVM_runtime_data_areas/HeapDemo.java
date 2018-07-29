class HeapDemo
{
	
	public static void main(String...s)
	{  long mb=1024*1024L;
		String str;
		for(int i=0;i<100000;i++)
		 str=new String("asaak");
		Runtime rt=Runtime.getRuntime();
		System.out.println("Maximum Memory: "+rt.maxMemory()/mb+" MB");
		System.out.println("Initial Memory: "+rt.totalMemory()/mb+" MB");
		System.out.println("Free Memory : "+rt.freeMemory()/mb+" MB");
		System.out.println("Consumed Memory: "+(rt.totalMemory()-rt.freeMemory())/mb+" MB");
	}
}


// NOTE: to set maximum heap size use:
// java -Xmx512m HeapDemo
//this will set maximum heap size to 512 mb.

// to set minimum heap size(initial heap size) use:
// java -Xms512m HeapDemo
// this will set minimum heap size to 512 mb.


// to set both minimum and maximum size use:
// java -Xmx1000m -Xms512m HeapDemo
//this will set maximum heap size to 1000 mb and minimum heap size to 512 mb. 