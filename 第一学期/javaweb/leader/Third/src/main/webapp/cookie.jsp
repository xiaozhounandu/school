<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/10/23
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookie</title>
</head>
<body>
<%
String str="12";
int number=Integer.parseInt(str);
%>


该数字的平方和为<%= number * number%><hr>

<%
  Cookie cookie =new Cookie("number",str);
  cookie.setMaxAge(500);
  response.addCookie(cookie);


%>
<a href="cookie1.jsp" > 到达</a>
</body>
</html>
