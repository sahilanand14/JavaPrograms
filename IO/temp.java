import java.io.*;

class temp
{
public static void main(String...s) throws Exception
{
ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream("sahil.txt"));
Student arr[]={new Student(10,20,"sahil"),new Student(40,50,"rahul"),new Student(90,100,"preeti")};
oout.writeObject(arr);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter Student age whose details are to be found");
String st=br.readLine();
int t=Integer.parseInt(st);
ObjectInputStream oin=new ObjectInputStream(new FileInputStream("sahil.txt"));
Student arr1[]=(Student[])oin.readObject();
for(int i=0;i<arr1.length;i++)
{
//System.out.println(arr1[i].name);
if(t==arr1[i].age)
{
System.out.println(arr1[i].name+" "+arr1[i].marks+" "+arr1[i].age);
break;
}

}





}



}
class Student implements Serializable
{
int age;
int marks;
String name;
Student(int age,int marks,String name)
{
this.marks=marks;
this.age=age;
this.name=name;
}



}