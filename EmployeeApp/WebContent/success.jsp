<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.training.bean.Employee"%>
    <%@ page errorPage="errorHandler.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<jsp:include page="mylogo.jsp">
<jsp:param value="Profile Page" name="title"/>
</jsp:include>

<%-- <%
Employee employee = (Employee)request.getAttribute("employee");
out.print("Welcome "+employee.getEmpname()+"<br>");%> 

Mobile: <% out.print(employee.getMobile()); %><br>
EmpiD: <%out.print(employee.getEmpId()); %><br>
 --%>
<%@ include file="footer.jsp" %>


</body>
</html>