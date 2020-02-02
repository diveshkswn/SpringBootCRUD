<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello to this new Spring Boot Project</h1>
<a href="${pageContext.request.contextPath}/getE">GetEmployee</a>
<a href="${pageContext.request.contextPath}/addE">AddEmployee</a>
</body>
</html>