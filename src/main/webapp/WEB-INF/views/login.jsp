<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Login page</h1>
    <form action="<c:url value='/login' />" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" /><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" /><br><br>
        
        <input type="submit" value="Login" />
    </form>
</body>
</html>