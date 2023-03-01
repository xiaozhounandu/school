<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/12/13
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="adddata.jsp" method="post">
    输入ID ：<input type="text" name="buid"><br>
    输入姓名：<input type="text" name="buname"><br>
    输入部门： <input type="text" name="bufun"><br>
    输入地址： <input type="text" name="buaddr"><br>
<input type="submit" value="提交">

</form>

</body>
</html>
