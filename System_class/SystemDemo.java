/*
System.setIn(Inputstream in)
System.setOut(PrintStream out)
System.setErr(PrintStream out)
System.exit();
System.gc();
*/

import java.util.*;
class SystemDemo
{
	public static void main(String[] args) {
		

		long time=System.currentTimeMillis();
		System.out.println(time);

		 System.out.println("//////////////////////////////////////////////////////////");


		Map<String,String> env=System.getenv();
		Set<Map.Entry<String,String>> set=env.entrySet();
		Iterator<Map.Entry<String,String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> entry=itr.next();
			System.out.println(entry.getKey()+"==>"+entry.getValue());
		}


     System.out.println("//////////////////////////////////////////////////////////");

		Properties properties=System.getProperties();
		Set<Map.Entry<Object,Object>> set1=properties.entrySet();
		Iterator<Map.Entry<Object,Object>> itr1=set1.iterator();

		 while(itr1.hasNext())
		{
			Map.Entry<Object,Object> entry=itr1.next();
			System.out.println(entry.getKey()+"==>"+entry.getValue());
		}

     System.out.println("//////////////////////////////////////////////////////////");


 		int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
         
        System.arraycopy(a, 0, b, 2, 2);
        System.out.println(Arrays.toString(b));

         System.out.println("//////////////////////////////////////////////////////////");


        System.out.println(System.lineSeparator());


         System.out.println("//////////////////////////////////////////////////////////");



	}
}