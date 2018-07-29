import java.io.*;
class Employee implements Serializable
{
	String name;
	int age;
    transient NotSerialized obj; //without transient keyword we get RE: java.io.NotSerializable
	Employee(String name,int age,NotSerialized obj)
	{
		this.name=name;
		this.age=age;
		this.obj=obj;
		
	}
	public void show()
	{
		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("SALARY: "+obj.salary);
	}



private void writeObject(ObjectOutputStream os)  {
// throws IOException {
try {
os.defaultWriteObject();
os.writeInt(obj.salary);
} catch (Exception e) { e.printStackTrace(); }
}
private void readObject(ObjectInputStream is) {
//throws IOException, ClassNotFoundException {
try {
is.defaultReadObject();
obj = new NotSerialized(is.readInt());
} catch (Exception e) { e.printStackTrace(); }
	
}
}
class NotSerialized 
{
	int salary;
	public NotSerialized(int salary)
	{	this.salary=salary;
		System.out.println("Constructor of not serialised class");
	}
}