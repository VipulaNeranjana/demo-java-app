<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
		<th>
			Name
		</th>	
		<th>
			Email
		</th>	
		<th>
			Phone
		</th>	
		<th>
			User Name
		</th>	
	</tr>
		<c:forEach var="details" items="${allSignings}">
			<tr>
				<td>
					${details.name}				
				</td>
				<td>
					${details.email}				
				</td>
				<td>
					${details.phone}				
				</td>
				<td>
					${details.userName}
				</td>
			</tr>
		</c:forEach>
	</table>
		
</body>
</html>