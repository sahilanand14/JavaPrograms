import java.io.*;
class MyClass implements Serializable
{ private static final long serialVersionUID=1L;
int sal=200;
String name="sahil anand";
int roll=46;
public String toString()
{
	return "Salary:"+sal+"\nName:"+name+"\nRollno:"+roll;
}

}
