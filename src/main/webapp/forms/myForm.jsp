<%--
  Created by IntelliJ IDEA.
  User: lijieyi
  Date: 2022/12/23
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/cookieRegis" method="get">
    <label>Book Name: </label>
    <input type="text" name="name">
    <br>
    <label>Price : </label>
    <input type="number" name="price">
    <br>
    <label>Author : </label>
    <input type="text" name="author">
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
