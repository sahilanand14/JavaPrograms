import java.io.*;
import java.sql.*;
public class InsertData
{
	public static void main(String []args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		PreparedStatement ps=con.prepareStatement("insert into STUDENT(rollno,name,age) values(?,?,?)");
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i=1;
    while(true)
   {
  System.out.println("Enter Data of student "+i);
  System.out.print("Rollno: ");
  int rollno=Integer.parseInt(br.readLine());
  System.out.print("Name: ");
  String name=br.readLine();
  System.out.print("Age: ");
  int age=Integer.parseInt(br.readLine());
  ps.setInt(1,rollno);ps.setString(2,name);ps.setInt(3,age);
  ps.addBatch();
  System.out.print("Want to add more records y/n: ");  
   String ans=br.readLine();  
   if(ans.equals("n")) 
   break;  
   System.out.println();
   i++;
}
   ps.executeBatch();
	}
}