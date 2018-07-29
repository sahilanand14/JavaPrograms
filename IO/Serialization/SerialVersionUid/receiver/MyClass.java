import java.io.*;
class MyClass implements Serializable
{
	//if we comment below line then exception will occur at runtime as MyClass is different from Sender's MyClass.
	private static final long serialVersionUID=1L;
int sal=20000;
int d=90;
String name="sahil anand";
int roll=46;
public String toString()
{
	return "Salary:"+sal+"\nName:"+name+"\nRollno:"+roll;
}

}
