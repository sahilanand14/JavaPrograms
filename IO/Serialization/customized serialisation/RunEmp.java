
//Need of customized Serialization
//In the example below the fields of Emp class which are transient store their default values in the file rather than actual values.
//But the problem here is that when we deserialise the object, there is no way to get the actual values.
//This is a major problem in Projects where we need to validate username and password of user.
//as the password is confidential we make it transient so that it is not saved in file and anyone else cant corrupt it.
//but when we deserialise we cant get the original password back.
//to solve this problem we use customized serialisatin.



import java.io.*;
class Emp implements Serializable
{
int age=20;
transient int pin=1245;
transient String pwd="sahil";
//comment the below  2 functions and see difference in output
private void writeObject(ObjectOutputStream os) throws Exception //this method is called internally by writeObject() method.
{
  os.defaultWriteObject(); //it does default serialization,i.e transient fields contain default values and remaining fields are stored with their actual values.
  String encryptedPassword="1245"+pwd; //
  int encryptedpin=pin+1245;
  os.writeObject(encryptedPassword);//this saves the pwd in file in encrypted manner.
  os.writeInt(encryptedpin);//this saves pin in file in encrypted form.

}
private void readObject(ObjectInputStream in) throws Exception// this method is called internally by readObject() method.
{
   in.defaultReadObject();
    pwd=((String)in.readObject()).substring(4);
    pin=(in.readInt())-1245;
}
public String toString()
{
	return "Age:  "+age+"\nPin:"+pin+"\n password:"+pwd;

}


}
class RunEmp
{
public static void main(String...s) throws Exception
{
Emp e1=new Emp();
System.out.println(e1);
ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream("Emp.txt"));
oout.writeObject(e1);
ObjectInputStream oin=new ObjectInputStream(new FileInputStream("Emp.txt"));
Emp e2=(Emp)oin.readObject();
System.out.println(e2);

}

}