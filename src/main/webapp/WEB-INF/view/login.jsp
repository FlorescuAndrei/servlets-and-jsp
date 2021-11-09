<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login form JSP</title>
</head>
<body>

 Hello from JSP!

<div>
	<% Date date = new Date(); %>
	Current Date is: <%=date%>
	(Scriplet example, not recomanded to use)
</div>

<hr>

	<form action="/login.do" method="POST">

		<p><font color="red">${errorMessage}</font></p>
	
	Enter your name <input type="text" name="name" />

	Enter your password <input type="text" name="password"/>

		<input type="submit" value="Logg In"/>
	</form>

</body>
</html>