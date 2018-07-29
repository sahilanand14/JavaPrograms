import java.io.*;
import java.sql.*;
class DisplayData
{
	public static void main(String []args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","sahil123");
		Statement stmt=con.createStatement();  
       ResultSet rs=stmt.executeQuery("select * from student");
ResultSetMetaData rsmd=rs.getMetaData();
int col=rsmd.getColumnCount();
for(int j=1;j<=col;j++)
System.out.print(rsmd.getColumnName(j)+"\t");
System.out.println();
while(rs.next())  
System.out.println(rs.getInt("rollno")+"  "+rs.getString(2)+"  "+rs.getInt(3));  
con.close();  
	}
}