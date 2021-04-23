<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Online Book Portal</h1>
<%
String name = (String)session.getAttribute("username");
out.println("Welcome "+name+"<br>");

out.println("SessionId in success page"+session.getId()+"<br>");
//session.setMaxInactiveInterval(2);

%>
<form action="bookServlet">
Select Category<select name="category">
  <option value="select">--select---</option>
  <option value="Fiction">Fiction</option>
  <option value="Horror">Horror</option>
  <option value="Action">Action</option>
  <option value="Comedy">Comedy</option>
</select><br>
<input type="hidden" name="usertype" value = '<% out.print(request.getAttribute("usertype")); %>' >
<input type="submit" value="Click here">
</form>
<%-- <% session.invalidate(); %> --%> 
</body>
</html>