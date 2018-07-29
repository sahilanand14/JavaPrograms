import java.util.*;
import java.io.*;

//abstarct class just declares the method 
abstract class Plan
{
	abstract int getPlan();

	
}
//implementation classes
class HDFC extends Plan
{
	int getPlan()
	{
		return 1;
	}
}
class SBI extends Plan
{
	int getPlan()
	{
		return 2;
	}
}
class RBI extends Plan
{
	int getPlan()
	{
		return 3;
	}
}



//class with a factory method to produce objects
//This class is called the "FACTORY CLASS"
/*a single Factory class that returns the different sub-classes based on the input
provided and factory class uses if-else or switch statement to achieve this.
*/
class PlanFactory
{

	static Plan makePlan(String name)
	{
		if(name.equalsIgnoreCase("HDFC"))
			return new HDFC();
		else if(name.equalsIgnoreCase("SBI"))
			return new SBI();
		else if(name.equalsIgnoreCase("RBI"))
			return new RBI();
		else return null;
	}


}
class Driver
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String classname=br.readLine();
		Plan p=PlanFactory.makePlan(classname); //upcasting is done
		System.out.println(p.getPlan());


	}
}