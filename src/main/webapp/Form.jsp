<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="SigninServerlet1" method="post">
		<h1>Form</h1>
		
		<label>Name:</label>
		<input type="text" name="name" placeholder="Name" ><br>
		<label>Email:</label>
		<input type="text" name="email" placeholder="Email" ><br>
		<label>Phone number:</label>
		<input type="text" name="phone" placeholder="Phone number" ><br>
		<label>User name:</label>
		<input type="text" name="userName" placeholder="User name" ><br>
		<label>Password:</label>
		<input type="password" name="password" placeholder="Password" ><br>
		<input type="submit" name="submit">
		
	</form>
</body>
</html>