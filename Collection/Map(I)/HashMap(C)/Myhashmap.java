import java.util.*;
class Myhashmap
{
	public static void main(String[] args) {
		HashMap<Integer,Employee> hm=new HashMap<>();
		hm.put(1,new Employee(20,"sahil"));
		hm.put(2,new Employee(22,"lalit"));
		hm.put(3,new Employee(21,"manjeet"));
		hm.put(4,new Employee(24,"kartik"));
		hm.put(5,new Employee(25,"vibhor"));
		System.out.println(hm.get(1));
		System.out.println(hm.get(1).name);
		Set<Map.Entry<Integer,Employee>> me=hm.entrySet();
		Iterator<Map.Entry<Integer,Employee>> itr= me.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,Employee> entry=itr.next();
			Integer i=entry.getKey();
			Employee emp=entry.getValue();
			System.out.println("ID::: "+i);
			System.out.println("Name::: "+emp.name+" Age:::"+emp.age);

		}



	}
}

class Employee
{
   int age;
   String name;

	Employee(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
}