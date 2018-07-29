<!-- Architecturally, JSP may be viewed as a high-level abstraction of Java servlets. JSPs are translated into servlets at runtime, therefore JSP is a Servlet; each JSP servlet is cached and re-used until the original JSP is modified. 
JSP can be used independently or as the view component of a server-side model–view–controller design, normally with JavaBeans as the model and Java servlets (or a framework such as Apache Struts) as the controller. This is a type of Model 2 architecture.
-->

<!-- count.jsp -->
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<center>
	<%!
	int count=0;
	%>
	<br><br>
	<%count++;%>
	<h1>The Number of times client hit the server:</h1>
	<br><br>
	<h1>
		<%=count%>
	</h1>

</center>
</body>
</html>





<!-- NOTE : to run above program:
1.deploy the prject in webapps folder in C:\Program Files\Apache Software Foundation\Tomcat 9.0
2.start the server.
3.go to the url http://localhost:4040/jspfirstapp/count.jsp.
4.on refreshing each time count will be inremented by 1.


lifecycle:
count.jsp is first translated into count_jsp.java which is servlet source file by the jsp container(jasper).
then count_jsp.java is compiled to count_jsp.class.
then class is loaded.
after that an instance of class is created.
then jspInit() method is invoked by the container.
then _jspService() method is invoked by the container.
then jspDestroy() method is invoked by the container.
 -->






 <!-- Why use JSP?
In Java server pages JSP, the execution is much faster compared to other dynamic languages.

It is much better than Common Gateway Interface (CGI).

Java server pages JSP are always compiled before its processed by the server as it reduces the effort of the server to create process.

Java server pages JSP are built over Java Servlets API. Hence, it has access to all Java APIs, even it has access to JNDI, JDBC EJB and other components of java.

JSP are used in MVC architecture (which will be covered in MVC architecture topic) as view layer.

The request is processed by a view layer which is JSP and then to servlet layer which is java servlet and then finally to a model layer class which interacts with the database.



Advantages of JSP
The advantage of JSP is that the programming language used is JAVA, which is a dynamic language and easily portable to other operating systems.

It is very much convenient to modify the regular HTML. We can write the servlet code into the JSP.

It is only intended for simple inclusions which can use form data and make connections.

JSP can also include the database connections into it. It can contain all type of java objects.

It is very easy to maintain

Performance and scalability of JSP are very good because JSP allows embedding of dynamic elements in HTML pages.

As it is built on Java technology, hence it is platform independent and not depending on any operating systems.

Also, it includes the feature of multithreading of java into it.

We can also make use of exception handling of java into JSP.

It enables to separate presentation layer with the business logic layer in the web application.

It is easy for developers to show as well as process the information.
 -->