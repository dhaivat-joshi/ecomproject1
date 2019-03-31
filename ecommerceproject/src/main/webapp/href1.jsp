<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="adduser">
hello
<a href="<c:out value="/test/${object1.Prod_id}"/>">hello</a>

<input type="submit" value="click" name="click"/>
</form>

</body>
</html>