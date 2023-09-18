<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Pet Shop</title>
</head>
<body>
    <c:forEach var="user" items="${listUser}" varStatus="indexLoop">
            <p>${user.lastName}</p>
       </c:forEach>
</body>
</html>