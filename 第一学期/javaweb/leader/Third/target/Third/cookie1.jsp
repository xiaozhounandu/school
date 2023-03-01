<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/10/23
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookie</title>
</head>
<body>
<%
String str=null;

  Cookie[] cookies = request.getCookies();
  for (int i = 0; i < cookies.length; i++) {
    if ( cookies[i].getName().equals("number")){
     str = cookies[i].getValue();
     break;

    }

  }
int number=Integer.parseInt(str);

%>
立方为<%=number * number * number%>


</body>
</html>
