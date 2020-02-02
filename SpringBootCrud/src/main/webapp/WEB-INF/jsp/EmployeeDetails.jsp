<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Details</h1>

<table border="1">
<tr>
<td>Id</td>
<td>Name</td>
</tr>
<c:forEach var="i" items="${empli }">
<tr>
<td><c:out value="${i.id }"></c:out> </td>
<td><c:out value="${i.name }"></c:out>


 </tr>

</c:forEach>

</table>
<table>
<tr></tr>
</table>
</body>
</html>