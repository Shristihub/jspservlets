<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<jsp:param value="Come Again Later" name="title"/>
</jsp:include>
<h1>Technical Error.....</h1>
<br>
<br>
<%@ include file="footer.jsp" %>
</body>
</html>