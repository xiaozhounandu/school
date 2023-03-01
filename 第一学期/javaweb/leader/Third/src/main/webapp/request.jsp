<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/10/23
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request</title>
</head>
<body>
提交方式：<%= request.getMethod() %><br>
请求的URL地址：<%= request.getRequestURL() %><br>
协议：<%= request.getProtocol() %><br>
文件路径：<%= request.getServletPath() %><br>
URL的查询部分：<%= request.getQueryString()%><br>
服务器名称：<%= request.getServerName() %><br>
服务器端口号：<%= request.getServerPort() %><br>
远程地址：<%= request.getRemoteAddr()%><br>

</body>
</html>
