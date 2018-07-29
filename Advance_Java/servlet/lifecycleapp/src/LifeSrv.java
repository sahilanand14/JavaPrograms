
import javax.servlet.*;
import java.io.*;
public class LifeSrv implements Servlet
{
	public void init(ServletConfig config) throws ServletException
	{
	System.out.println("I am the init method");
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
	System.out.println("I am the Service method");
	}
	public void destroy()
	{
	System.out.println("I am the destroy method");
	}
	public String getServletInfo()
	{return "servlet version 4.0";}
	public ServletConfig getServletConfig()
	{return null;}
}