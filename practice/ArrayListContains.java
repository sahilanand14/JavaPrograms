import java.util.*;
class ArrayListContains
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Hello");al.add("Hel");al.add("Hllo");al.add("Hell");
		Iterator<String> i=al.iterator();
		//al.add("Hellodfsd");al.add("Helff");al.add("Hglo");al.add("Heil");
		
		 String stt=i.next();
	    String stt2=i.remove();

	
	    System.out.println(stt1+"   "+stt2);
	  //  i.remove();
 System.out.println(al.size());
 
  System.out.println(al);

	}
}