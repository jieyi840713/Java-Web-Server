<%--
  Created by IntelliJ IDEA.
  User: lijieyi
  Date: 2022/12/25
  Time: 1:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  double jpn = 4.4382;
  double usd = 0.0345;
  double cny = 0.2300;
  int amount = Integer.parseInt(request.getParameter("amount"));
%>

<h2>美金: <%= amount * usd %></h2>
<h2>日幣: <%= amount * jpn %></h2>
<h2>人民幣: <%= amount * cny %></h2>
</body>
</html>
