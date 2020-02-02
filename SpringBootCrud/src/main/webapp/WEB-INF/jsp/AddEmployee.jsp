<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Employee New Details</h1>
<form:form modelAttribute="addemp"  method="POST"  action="/addEmployee">
Name: <form:input path="name"/>
<input type="submit" name="ADD">
</form:form>


<h1><font color="blue">${success}</font></h1>
</body>
</html>