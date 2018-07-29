// NOTE : To sort elements of Collection classes use Collections.sort(name,Comparator<>) instead of Arrays.sort().
// Collections.sort() works in same manner as Arrays.sort() method.



import java.util.*;
class Arrays_sort
{
    public static void main(String[] args)
    {

        Employee[] employee =
        {
            new Employee("sahil", 1000, 20, 1001),
            new Employee("lalit", 1, 22, 1004),
            new Employee("manjeet", 101, 21, 1003),
            new Employee("samarth", 10, 23, 1007),
            new Employee("vikas", 100, 25, 1005)
        };


        //Arrays.sort(Object[] arr,Comparator<T>)  the method takes a Comparator which defines sorting order.
        Arrays.sort(employee, new Comparator<Employee>()
        {
            public int compare(Employee e1, Employee e2)
            {
                if(e1.getSalary() > e2.getSalary())
                    return 1;
                else if(e1.getSalary() == e2.getSalary())
                    return 0;
                else
                    return -1;
            }
        });                              //Annonymous inner class is used here which implements Comparator interface and overrides it compare() method.

        System.out.println("After salary sorting:");
        System.out.println(Arrays.toString(employee));



        Arrays.sort(employee, (Employee e1, Employee e2)->e1.getName().compareTo(e2.getName())); //Lambda expressions are used here.

        System.out.println("After name sorting:");
        System.out.println(Arrays.toString(employee));





        Arrays.sort(employee, (Employee e1, Employee e2)->
        {
            if(e1.getAge() > e2.getAge())
                return 1;
            else if(e1.getAge() == e2.getAge())
                return 0;                                                   //using lambdas
            else
                return -1;
        });

        System.out.println("After Age sorting:");
        System.out.println(Arrays.toString(employee));


        Arrays.sort(employee, new IdCompare());                            //passing reference of class that implements Comparator and defines sorting order.
        System.out.println("After Id sorting:");
        System.out.println(Arrays.toString(employee));




    }

}

class Employee
{
    private int salary;
    private String name;
    private int age;
    private int id;
    Employee(String name, int salary, int age, int id)
    {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.id = id;

    }

    public String toString()
    {
        return "Salary: " + salary + "\n" + " Name: " + name + "\n" + " Age: " + age + "\n" + " Id: " + id + "\n" ;
    }
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
}

class IdCompare implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        if(e1.getId() > e2.getId())
            return 1;
        else if(e1.getId() == e2.getId())
            return 0;
        else
            return -1;

    }
}