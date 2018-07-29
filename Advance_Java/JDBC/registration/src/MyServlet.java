import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String username=request.getParameter("user");  
String password=request.getParameter("pass");  

          
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/students","root","root");  
  
PreparedStatement ps=con.prepareStatement(  
"select * from student where username=? AND password=?");  
  
ps.setString(1,username);  
ps.setString(2,password);            
ResultSet rst=ps.executeQuery();
if(rst.next()==true)  
{	
out.print("<html>");
out.println("<body><h1>Welcome: "+n+" You have successfully logged in!</h1></body>");
 out.print("</html>"); 
 }
 else
 {
 	out.print("<html>");
out.println("<body><h1>Incorrect username or password!!</h1></body>");
 out.print("</html>"); 
}
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  