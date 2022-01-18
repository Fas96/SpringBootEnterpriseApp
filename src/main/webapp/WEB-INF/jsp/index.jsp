<%--
  Created by IntelliJ IDEA.
  User: fasbhim
  Date: 2022/01/03
  Time: 12:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Spring boot security logout</h2>
<form action="/logout">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <input type="submit" value="Logout">
</form>
</body>
</html>
