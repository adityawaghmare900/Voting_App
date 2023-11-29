<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Votes</title>
</head>
<body>


	<table border="1">
		<thead>
			<tr>
				<th>Candidate</th>
				<th>Count</th>

			</tr>
		</thead>
		<tbody>
			<tr>
				<c:forEach items="${emp}" var="employee">
					<tr>
						<td><c:out value="${employee.can}" /></td>
						<br>
						<td><c:out value="${employee.count}" /></td>
					</tr>
				</c:forEach>
			</tr>
		</tbody>

	</table>



</body>
</html>