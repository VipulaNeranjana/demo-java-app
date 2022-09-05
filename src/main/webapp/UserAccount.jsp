<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles\userAccount.css"></link>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<c:forEach var="details" items="${customerdetail}">
			<div class="">
				<div class="labels">
					<label>User Id:</label>
				</div>
				<div class="details">
					${details.id}
				</div>
				<div class="labels">
					<label>Name:</label>
				</div>
				<div class="details">
					${details.name}				
				</div>
				<div class="labels">
					<label>User Email:</label>
				</div>
				<div class="details">
					${details.email}
				</div>
				<div class="labels">
					<label>Phone Number:</label>
				</div>
				<div class="details">
					${details.phone}
				</div>
				<div class="labels">
					<label>User name:</label>
				</div>
				<div class="details">
				${details.userName}
				</div>
			</div>
			
		</c:forEach><br><br>
		
		
		<form action="LoginServelet" method="post">
			<div>
				<input type="hidden" name="userName" value="${customerdetail[0].userName}">
				<input type="hidden" name="password" value="${customerdetail[0].password}">
				<input type="submit" name="submit" value="Make Changes">
				<button type="submit" name="submit" value="viewAll">view all</button><br>
			</div><br>
	
		<div style="color:#0bea0b;">${statement}</div>
	
		</form>
	</div>

	

</body>
</html>