<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.print("Session Id "+session.getId()); %>

	<form action="login" method="post">
		Username<input type="text" name="username"><br>
	    Password<input type="password" name="password"><br>
	    <input type="hidden" name="usertype" value="admin">
	    <input type="submit" value="Click here">
	</form>
</body>
</html>