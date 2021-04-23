<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="login" >
		Name<input type="text" name="username"><br>
	    City<input type="text" name="city"><br>
	    Mobile<input type="text" name="mobile"><br>
	    Choose Language
<select name="language" >
  <option value="select">--select---</option>
  <option value="Java">Java</option>
  <option value="JSP">JSP</option>
  <option value="Spring">Spring</option>
  <option value="Hibernate">Hibernate</option>
</select><br>
Enter  Hobby
<input type="checkbox" value="music" name="hobby">Music
<input type="checkbox" value="dance" name="hobby">Dance
<input type="checkbox" value="sports" name="hobby">Sports
<input type="checkbox" value="reading" name="hobby">Reading
<br>
<input type="submit" value="Click here">
	</form>
</body>
</html>