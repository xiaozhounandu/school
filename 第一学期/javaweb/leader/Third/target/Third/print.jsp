<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/10/18
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<%
  int x= Integer.parseInt(request.getParameter("num"));
  for (int i = 0; i < x; i++) {
    out.print("欢迎");
  }
%>
</body>
</html>
