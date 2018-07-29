import java.io.*;
class Inputstream
{
public static void main(String...s) throws Exception
{
ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream("sahil.txt"));
ObjectInputStream oin=new ObjectInputStream(new FileInputStream("sahil.txt"));
MyClass obj=new MyClass(46,20,"sahil");
oout.writeObject(obj);
MyClass obj2=(MyClass)oin.readObject();

System.out.println(obj.hashCode()+"  "+obj2.hashCode());
System.out.println(obj+"  "+obj2);




}

}
class MyClass implements Serializable
{
int age;int rollno;String name;
MyClass(int rollno,int age,String name)
{
this.rollno=rollno;this.age=age;this.name=name;

}
public String toString()
{
return "rollno= "+rollno+" age= "+age+" name= "+name;

}


}




