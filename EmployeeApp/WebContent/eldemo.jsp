<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br></br>
<% 
 pageContext.setAttribute("msg","hello welcome home");
 application.setAttribute("msg","I am in an app");
 pageContext.setAttribute("poppy","Welcome",PageContext.SESSION_SCOPE);
 session.setAttribute("poppy","good");%>
${msg}<br>
${applicationScope.msg}<br>
${sessionScope.poppy}<br>
${poppy}<br>
<%
String names[]={"ram","bhanu","Shayam"};
application.setAttribute("mynames",names);
ArrayList<String> al=new ArrayList<String>();
al.add("apple");al.add("orange");al.add("grapes");
al.add("berry");al.add("pineapplle");
session.setAttribute("fruits",al); %> 
${mynames[1]}<br>
${applicationScope.mynames[2]}<br>
${fruits}<br>
${fruits["1"]}<br>
${fruits[4]}<br>
${10/0}
<b>Using scripting</b><br>
contact us at <%=application.getInitParameter("mail") %>
<br><b>Using EL</b><br>
${initParam.mail}
<%Cookie cook=new Cookie("anyname","JSPWelcomesU");
Cookie cook1=new Cookie("uname1","EJB");
response.addCookie(cook);
response.addCookie(cook1);
%><br>
${cookie.anyname.value}<br>
${cookie.uname1.value}
<br>









</body>
</html>