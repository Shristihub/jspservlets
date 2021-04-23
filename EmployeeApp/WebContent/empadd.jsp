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
<%
Employee employee = (Employee)request.getAttribute("employee");%>
Welcome : <%=employee.getEmpname() %><br>
City : <%=employee.getAddress().getCity() %><br>
State : <%=employee.getAddress().getState() %><br>
Mobile : <%=employee.getMobile() %><br>
EmpId : <%=employee.getEmpId() %><br>
<br>
<br>

Welcome : ${employee.empname}<br>
City : ${employee.address.city}<br>
State : ${employee.address.state}<br>
Mobile : ${employee.mobile } <br>
EmpId : ${employee.empId}<br>
<br>
<br>

<%@ include file="footer.jsp" %>
</body>
</html>



