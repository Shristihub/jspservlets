<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page errorPage="errorHandler.jsp" %>
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
<jsp:param value="Have a good day" name="title"/>
</jsp:include>
	<form action="empServlet" >
		Name<input type="text" name="empname"><br>
	    EmployeeId<input type="text" name="empId"><br>
	    Mobile<input type="text" name="mobile"><br>
	    City<input type="text" name="city"><br>
	    State<input type="text" name="state"><br>
		<input type="submit" value="Login">
	</form>
<br>
<%@ include file="footer.jsp" %>
</body>
</html>