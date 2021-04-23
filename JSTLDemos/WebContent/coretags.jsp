<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% session.setAttribute("message","welcome to JSTL"); %>
<c:set value="welcome to JSTL" var = "message" scope="session">
</c:set>
${message}
<c:out value="hello! ${message}"></c:out>
<br>
<c:set value="Admin" var = "obj" ></c:set>
<c:if test="${obj eq 'Admin'}">
	<c:out value="Authenticated ${obj}"></c:out>
</c:if>
<p>
Hello ${obj}</p>
<br>

Setting an attribute:
<br>
using scripting---<%pageContext.setAttribute("name","Ramana");%><br>
using JSTL----
<c:set var="val"  value="Goodmorning" /><br>
<c:set var="val" scope="session" value="hello"/>
<h2>Getting an attribute:</h2>
using scripting<br>
<%=session.getAttribute("val") %><br>
<%=pageContext.getAttribute("val") %><br>
using EL<br>
${sessionScope.val}<br>
${val}<br>

<c:remove var="val" scope="page"/><br>
Removing an attribute:<br>
<%=session.getAttribute("val") %><br>
${val}<br>
<br>
<c:choose >
	<c:when test="${obj eq 'Admin' }">
		Hello ${obj}
	</c:when>
	<c:when test="${obj eq 'priya' }">
		welcome ${obj}
	</c:when>
	<c:otherwise>
		sorry wrong user
	</c:otherwise>
</c:choose>
<br>
<%ArrayList<String> fruits=new ArrayList<String>();
fruits.add("Mango");
fruits.add("Apple");
fruits.add("Orange");
fruits.add("Grapes"); 
fruits.add("Papaya");
pageContext.setAttribute("fruits",fruits);%>
${fruits }
<c:forEach var="fruit" items="${fruits}" step= "2" >
${fruit}<br>
</c:forEach>

<h2>USING TRY CATCH</h2>
<c:catch>
I am inside the catch
<%int x=10/0;%>
hello will not be printed
</c:catch>
completed after catch


<c:import url="http://localhost:8080/EmployeeApp/mylogo.jsp">
<c:param name="title" value="Learning Coretags"></c:param>
</c:import>
 












</body>
</html>