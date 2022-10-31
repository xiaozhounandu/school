<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/10/18
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%
    String account =request.getParameter("account");
    String account1 =request.getParameter("account1");
    out.println("用户是："+"account");
    out.println("账号是："+"account1");
  %>
</head>
<body>

</body>
</html>
