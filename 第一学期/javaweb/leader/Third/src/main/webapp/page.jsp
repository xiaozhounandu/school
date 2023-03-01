<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/10/18
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head> <meta charset="UTF-8"></head>

<body>
<%
String account =request.getParameter("account");
String pas =request.getParameter("password1");
if(account.equals("admin") && pas.equals("123456")){
  out.println("200");
}else{
  out.println("400");
}
%>
</body>
</html>
