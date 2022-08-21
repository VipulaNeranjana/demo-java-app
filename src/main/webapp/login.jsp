<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginServelet" method="post">
		User Name <input type="text" name="userName"><br>
		Password <input type="password" name="password"><br>

		Submit <input type="submit" name="submit" value="login">
		<input type="submit" name="submit" value="Make Changes"><br>
		
		<a href="Form.jsp">Sign in</a>
	</form>
		
	<form action="ViewServelet" method="post">
		<button type="submit">view all</button>
	</form>
	<p>${customerdetail}</p>
	

</body>
</html>