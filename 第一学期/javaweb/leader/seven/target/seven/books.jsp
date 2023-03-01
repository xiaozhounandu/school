<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/11/1
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>books</title>
</head>
<body>
<%
  ArrayList books = (ArrayList) session.getAttribute("books");
  for (int i = 0; i < books.size(); i++) {
   String book=(String) books.get(i);
   out.println(book+"<br>");
  }
%>
<br>
<a href="addbooks.jsp">删除购物车</a>
<br>
<%
    String id = session.getId();
    out.println("当前sessionId为"+id);
%>

</body>
</html>
