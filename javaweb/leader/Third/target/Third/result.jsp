<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/10/18
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head> <meta charset="UTF-8"></head>

<body>
<%
    String[] numberList = request.getParameterValues("number");
    for(int i=0; i<numberList.length; i++) {
        out.println(numberList[i]);
    }
%>
</body>
</html>

