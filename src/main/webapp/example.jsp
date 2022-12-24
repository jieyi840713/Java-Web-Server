<%--
  Created by IntelliJ IDEA.
  User: lijieyi
  Date: 2022/12/24
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% for(int j = 1; j< 100; j++) { %>
1 + 2 +3 +4 + ... + <%= j %> = <%= addUpto(j)%>
<br>
<% } %>

<%!
  private int addUpto(int n){
    int result =0;
    for(int i = 0 ; i<=n ;i++){
      result+=i;
    }
    return result;
  }
%>
</body>
</html>
