<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles\makeChanges.css">
<title>Make Changes</title>
</head>
<body>

	<div class="container">
		<h1>Make Changes</h1>
		<form action="ChangesServelet" method="post">
			<c:forEach var="item" items="${customerdetail}">
				<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" value="${item.name}"></td>
				</tr>
				<tr>
					<td>email:</td>
					<td><input type="text" name="email" value="${item.email}"></td>
				</tr>
				<tr>
					<td>Phone:</td>
					<td><input type="text" name="phone" value="${item.phone}"></td>
				</tr>
				<tr>
					<td>userName:</td>
					<td><input type="text" name="userName" value="${item.userName}"></td>
				</tr>
				<tr>
					<td>password:</td>
					<td><input type="text" name="password" value="${item.password}"></td>
				</tr>
			
				</table>
			</c:forEach><br><br>
	
			<label>Change the details of the user</label>
			<input type="submit" name="requrement" value="Change">
			<label>Delete the student details</label>
			<input type="submit" name="requrement" value="Delete">
		</form>
	</div>
</body>
</html>