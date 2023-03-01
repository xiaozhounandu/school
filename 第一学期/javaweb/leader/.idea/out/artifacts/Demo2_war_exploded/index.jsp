<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/12/13
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
<form action="PassServlet" method="post">
  <table align="center">
    <tr>
      <td>用户名：</td>
      <td><input type="text" name="name" /></td>
    </tr>
    <tr>
      <td>密码：</td>
      <td><input type="password" name="pwd" /></td>
    </tr>

    <tr>
      <td>年龄：</td>
      <td><input type="text" name="age"  /></td>
    </tr>
    <tr>
      <td>Email:</td>
      <td><input type="text" name="email" /></td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" value="注 册" />
        <input type="reset" value="重 置" />
      </td>
    </tr>
  </table>
</form>
</body>
</html>
