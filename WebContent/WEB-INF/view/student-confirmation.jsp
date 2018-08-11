<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- This allows for looping over a collection -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>

<p>Student name: ${student.firstName} ${student.lastName } from ${student.country}</p> <!--  Spring calls the student.getX() methods for these -->
<p>Favorite Computer Programming Language: ${student.programmingLanguage}</p>
<p>Favorite Operating System: </p>
<!--  this is how you loop over a collection to display it -->
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
	<li>${temp}</li>
	</c:forEach>
</ul>
</body>
</html>