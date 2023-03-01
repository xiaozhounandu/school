<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/12/13
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="user.UserInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
<%
  UserInfo user = (UserInfo)request.getAttribute("User");
%>
<table>
  <tr align="center">
    <td>用户名：</td>
    <td><%=user.getUserName() %></td>
  </tr>
  <tr>
    <td>密码：</td>
    <td><%=user.getUserPwd() %></td>
  </tr>
  <tr>
    <td>年龄：</td>
    <td><%=user.getUserAge() %></td>
  </tr>
  <tr>
    <td>Email：</td>
    <td><%=user.getEmail() %></td>
  </tr>
</table>
</body>
</html>
