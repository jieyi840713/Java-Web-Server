<%--
  Created by IntelliJ IDEA.
  User: lijieyi
  Date: 2022/12/25
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="counter" class = "Ojb.Counter" scope="application"></jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% counter.increaseCount(); %>
  <p>You are a visitor number <%= counter.getCount() %></p>
</body>
</html>
