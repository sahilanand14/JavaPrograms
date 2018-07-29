import java.util.*;
class Run
{
    public static void main(String[] args)
    {


        TreeSet <Employee> hs = new TreeSet<>(new EmployeeSalarySort());
        hs.add(new Employee(1, "sahil"));
        hs.add(new Employee(8, "gaurav"));
        hs.add(new Employee(2, "vibhor"));
        hs.add(new Employee(90, "lalit"));
        hs.add(new Employee(23, "manjeet"));
        Iterator<Employee> itr = hs.iterator();
        while(itr.hasNext())
        {
            Employee e = itr.next();
            System.out.println("Salary: " + e.salary);
            System.out.println("Name: " + e.name);

        }

    }
}

class Employee
{
    int salary;
    String name;
    Employee(int salary, String name)
    {
        this.salary = salary;
        this.name = name;
    }
}

class EmployeeNameSort implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        return e1.name.compareTo(e2.name);
    }

}

class EmployeeSalarySort implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        if(e1.salary > e2.salary)
            return 1;
        else if(e1.salary == e2.salary)
            return 0;
        else
            return -1;
    }


}