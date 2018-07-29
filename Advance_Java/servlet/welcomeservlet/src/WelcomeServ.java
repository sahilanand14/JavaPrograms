import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
 public class WelcomeServ extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{      
		
		PrintWriter pw=res.getWriter();
		pw.println("<html>");
		pw.println("<body bgcolor='yellow'>");
		 try{Class.forName("com.mysql.jdbc.Driver");}
		catch(Exception e){pw.println("<h1>found exception as jdbc driver not found!!</h1>");}
		
		pw.println("<marquee><h1>Welcome to my first servlet</h1></marquee>");
		ServletConfig  config= getServletConfig();
		ServletContext context=getServletContext();
		// ServletContext context=config.getServletContext();	we can get ServletContext object from ServletConfig object	
		

		String username=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		Enumeration<String> e=config.getInitParameterNames();
		pw.println("<h1>Config parameters:</h1>");
		pw.println("<p> username: "+username+" Password: "+password+"<br/>");
		while(e.hasMoreElements())
		{
			pw.println(config.getInitParameter(e.nextElement())+"<br/>");
		}
		pw.println("</p>");

		String dbname=context.getInitParameter("databasename");
		String dbpassword=context.getInitParameter("dbpassword");
		Enumeration<String> e1=context.getInitParameterNames();

		pw.println("<h1>Context parameters:</h1>");
		pw.println("<p> Databasename: "+dbname+" DbPassword: "+dbpassword+"<br/>");
		while(e1.hasMoreElements())
		{
			pw.println(context.getInitParameter(e1.nextElement())+"<br/>");
		}
		pw.println("</p>");





		pw.println("</body>");
		pw.println("</html>");
		pw.close();


	}
}
/*
note: we need to set classpath of servlet-api.jar file because classes related to servlet development are present in that jar and 
we can't use them without importing them in our program. if we don't set classpath ,it results in compilation error.
At runtime the web server itself has servlet-api.jar file in its lib folder. therefore no error occurs.


note : when we load a class Dynamically then its presence is not checked at compile time. hence we get no compile time error if class 
is not present.

note: we have placed mysql-connector jar in WEB-INF\lib folder if it is removed from there then at runtime the 
servlet container will not be able to find the Driver class and will throw ClassNotFoundException.
Another way is to place the mysql-connector jar file in lib folder of server. That way we dont need to place
the jar file in every project's Web-INF/lib folder that uses that jar.
*/