<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<h1 align="center">RECORD</h1>
<jsp:useBean id="u" class="user.MyBean" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<jsp:getProperty property="name" name="u"/><br>
<jsp:getProperty property="roll" name="u"/><br>
${u.name}
${u.roll}
<jsp:include page="hello.html"/><br>
<!-- 
the include action tag uses "page" as mandatory attribute
the @include directive uses "file" as mandatory attribute 
to see this open the translated servlet file.
-->

<%@include file="hello.html" %>

 



</body>
</html>