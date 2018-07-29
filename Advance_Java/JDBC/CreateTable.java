//Mysql server should be running to access database.
//after compiling, we need to set classpath of com.mysql.jdbc.Driver class otherwise we will get RE:ClassNotFoundException
// javac CreateTable.java
//java -cp C:\Users\Sahil\Downloads\mysql-connector.jar;.; CreateTable
import java.io.*;
import java.sql.*;
public class CreateTable
{
	public static void main(String []args) throws Exception
	{
		
		//load the Driver class
		String driver_class_name="com.mysql.jdbc.Driver";//this class is found in "mysql-connector.jar" file.
		try{
		Class.forName(driver_class_name);
			}catch(ClassNotFoundException e){};

			//Establish Connection with Database
            String url="jdbc:mysql://localhost:3306/students";//students is name of Database already created.
            String username="root";
            String password="sahil123";
			Connection con=DriverManager.getConnection(url,username,password);



		//create Statement object.
			Statement stmt=con.createStatement();
			String query="create table student(rollno int(10),name varchar(40),age int(2))";
			int i=stmt.executeUpdate(query);
			if(i==0)
				System.out.println("Table created succesfully!");









	      
    } 
}