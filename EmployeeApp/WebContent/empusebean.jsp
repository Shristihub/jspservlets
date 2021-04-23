<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "com.training.bean.Employee" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<br>
<jsp:include page="mylogo.jsp">
<jsp:param value="Profile Page" name="title"/>
</jsp:include>

<%-- <jsp:useBean id="employee" class="com.training.bean.Employee" scope="request" ></jsp:useBean>
Welcome :<jsp:getProperty property="empname" name="employee"/><br>
EmpId:  <jsp:getProperty property="empId" name="employee"/><br>
Mobile:  <jsp:getProperty property="mobile" name="employee"/><br>
City: <jsp:getProperty property="city" name="employee"/><br>
<br>
 --%>
 Welcome : ${employee.empname}<br>
 EmpId :${employee.empId }<br>
 Mobile:${employee.mobile}<br>
 City:${employee.city}<br>
 

<%@ include file="footer.jsp" %>
</body>
</html>