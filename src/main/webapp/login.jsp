<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles/login.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container1">
		<form action="LoginServelet" method="post">
		
			<div class="user">
				<label>User Name:</label>
				<input class="in" type="text" name="userName"><br>
			</div>
			<div class="pass">
				<label>Password:</label>
				<input class="in" type="password" name="password">
			</div><br><br>
			
			<div>
				Submit <input type="submit" name="submit" value="login">
				<input type="submit" name="submit" value="Make Changes">
				<button type="submit" name="submit" value="viewAll">view all</button><br>
			</div>
	
			<div class"newsign">
				<a href="Form.jsp">Sign in</a>
			</div>
		</form>	
	</div>	

	<p>${customerdetail}</p>
	

</body>
</html>