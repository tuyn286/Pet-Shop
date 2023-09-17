<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Welcome Admin</h1>
    <c:forEach items="users" var="user">
        <p>${user.lastname}</p>
    </c:forEach>
    <a href="<c:url value='/demo/login-success'/>">Login Success</a>
</body>
</html>