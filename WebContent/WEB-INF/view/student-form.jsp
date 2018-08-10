<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
	<br><br>
	Last Name:  <form:input path='lastName' />
	<br><br>
	Country: <form:select path="country">
		<form:options items="${countryOps}" />
	 </form:select>
	<p>Favorite Language:</p>
	<form:radiobuttons path="programmingLanguage" items="${student.favoriteProgrammingLanguages}"/>
	 
	<input type="submit" value="Submit">

	</form:form>
	
</body>
</html>