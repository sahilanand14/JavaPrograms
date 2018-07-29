import java.io.*;
class Emp implements Serializable
{
   int age=20;
   transient int e_id=1244;
   final int number=99105;
   static String department="Software";
   transient final int salary=1000000;
   transient static String role="developer";
public String toString()
{
return "Employee age:    "+age+" \nEmployee id:    "+e_id+" \nEmployee Number:    "+number+" \nEmployee Department:    "+department+" \nEmployee salary:    "+salary+" \nEmployee Role:    "+role;


}


}
class RunEmp
{
public static void main(String...s) throws Exception
{
    //Serialisation
    Emp e1=new Emp();
    System.out.println("Before Serialisation:");
    System.out.println(e1); 
	FileOutputStream fout=new FileOutputStream("EmpDatabase.txt");
	ObjectOutputStream oout=new ObjectOutputStream(fout);
	oout.writeObject(e1);

	//Deserialisation
	System.out.println("After Deserialisation:");
	FileInputStream fin=new FileInputStream("EmpDatabase.txt");
	ObjectInputStream ooin=new ObjectInputStream(fin);
	Emp e=(Emp)ooin.readObject();
	System.out.println(e);

}

}