<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Login page</h1>
    <form:form action="/api/v1/auth/login" method="post" modelAttribute="authenticationRequest">
        <form:label path="email">Email</form:label>
        <form:input path="email" /><br>
    
        <form:label path="password">Password</form:label>
        <form:input path="password" /><br><br>

        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>