<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="myvariable" value="Hello Welcome"/>
<c:if test="${fn:startsWith(myvariable,'Hello') }">
 Test Success
</c:if>
<br>
<c:if test="${fn:contains(myvariable,'o') }">
		o is present in the string
</c:if>
<c:if test="${fn:contains(myvariable,'x') }">
		x is present in the string
</c:if>
<br>
<c:set var="message" value="This is a demo"></c:set>
<!-- splits the array delimiter is space -->

<c:set var="splitname" value="${fn:split(message,'i') }"/>
${splitname[0] }
<br>
<c:forEach var="val" items="${splitname }" >
${val} <br>
</c:forEach>
<c:set var="mylength" value="${fn:length(message) }"></c:set>
Length: ${mylength }
<br>
<c:set var="joinname" value="${fn:join(splitname,' ') }">
</c:set>
Joined String: ${joinname }



</body>
</html>