import java.util.*;
class SortingOwnClass
{
	public static void main(String[] args) {
		
		TreeSet<Employee> set=new TreeSet<>();
		set.add(new Employee(1,"sahil"));
		set.add(new Employee(2,"kiran"));
		set.add(new Employee(3,"ashu"));
		set.add(new Employee(4,"karan"));
		set.add(new Employee(5,"himani"));
		set.add(new Employee(66,"haema"));
		System.out.println(set.add(new Employee(4,"karan")));

		System.out.println(set);
		

	}
}

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	public int compareTo(Employee e1)
	{
		return this.name.compareTo(e1.name);
	}

	public String toString()
	{
		return this.name+"::::"+this.id;
	}

}