<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/11/15
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>

<%
  String parameter = request.getParameter("username");
  String parameter1 = request.getParameter("password");

  if(parameter.equals("admin") && parameter1.equals("123456")){
    response.sendRedirect("redirect_01.jsp");
    session.setAttribute("user",parameter);
    session.setAttribute("password",parameter1);
  }else {
    response.sendRedirect("redirect_02.jsp");
  }
%>

</body>
</html>
