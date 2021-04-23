<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.ArrayList" %>
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

out.println("SessionId in final page"+session.getId()+"<br>");
%>
<br>
<% 
ArrayList<String> bookList = (ArrayList<String>)request.getAttribute("bookList");
if(bookList!=null){
	out.print("<h4>The books available are</h4>");
	for(String bookName:bookList){
		out.print(bookName+"<br>");
	}
	
}else{
	out.print("No books in this category");
}
%>
</body>
</html>