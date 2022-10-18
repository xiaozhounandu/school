<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/10/18
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<%
    String account =request.getParameter("account");
    String pas =request.getParameter("password1");
    if(account.equals("admin") && pas.equals("123456")){

        response.sendRedirect("loginsuc1.jsp");
    }else{
        out.println("error");
    }

%>

</body>
</html>
