<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Text Input</h2>

<form action="processForm" method="GET">
  First name:<br>
  <input type="text" name="firstname" placeholder="First Name">
  <br>
  Last name:<br>
  <input type="text" name="lastname" placeholder="Last Name">
  <br>
  <input type="submit"/>
</form>

<form action="processFormVersonTwo" method="GET">
  <h2>Form 2</h2>
  <input type="text" name="firstName" placeholder="First Name">
  <br>
  Last name:<br>
  <input type="text" name="lastName" placeholder="Last Name">
  <br>
  <input type="submit"/>
</form>

<p>Note that the form itself is not visible.</p>

<p>Also note that the default width of a text input field is 20 characters.</p>

</body>
</html>