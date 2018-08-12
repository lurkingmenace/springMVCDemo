<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/student-form.css">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
	<form:errors path="firstName" cssClass="error"/> <!--  Step 2: setup form errors -->
	<br><br>
	Last Name:  <form:input path='lastName' />
	<form:errors path="lastName" cssClass="error"/> <!--  Step 2: setup form errors -->
	<br><br>
	Country: <form:select path="country">
		<form:options items="${countryOps}" />
	 </form:select>
	<p>Favorite Language:</p>
	<form:radiobuttons path="programmingLanguage" items="${student.favoriteProgrammingLanguages}"/>
	<p>Operating System:</p>
	<form:checkboxes items="${student.favoriteOSs}" path="operatingSystems"/>
	<input type="submit" value="Submit">

	</form:form>
	
</body>
</html>