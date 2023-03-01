<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/11/29
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.sql.*" %>
<html>
<head>
  <title>数据库内容</title>
</head>
<body>
<%
  String driver_name = "com.mysql.cj.jdbc.Driver";	//mysql数据库驱动
  String user_name = "root";						//访问数据库的用户
  String password = "admin12345";					//用户登陆密码
  String db_name="bumen1";						//要访问的数据库
  String table_name = "bumen5";					//要访问的数据表

  //url指定要访问的数据库和访问数据库的用户及密码
  String url = "jdbc:mysql://localhost/"+db_name+"?user="+user_name+"&password="+password;
  //加载mysql数据库驱动
//  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection conn = DriverManager.getConnection(url);

  Statement stmt = conn.createStatement();
  String sql = "select * from "+table_name;
  ResultSet rs = stmt.executeQuery(sql);

  out.print("id  \t   姓名  \t   职业   \t 住址 ");
  out.print("<br>");

  while(rs.next()){
    out.print(rs.getString(1)+"");	//取结果集里某行的第一列的数据
    out.print(" \t ");
    out.print(rs.getString(2)+"");	//取结果集里某行的第二列的数据
    out.print(" \t ");
    out.print(rs.getString(3)+"");	//取结果集里某行的第三列的数据
    out.print(" \t ");
    out.print(rs.getString(4)+"");	//取结果集里某行的第三列的数据
    out.print(" \t ");
    out.print("<br>");
  }
  out.print("<br>");

  //关闭相关参数
  rs.close();
  stmt.close();
  conn.close();
%>
</body>
<a href="add.jsp">添加数据 </a>
</html>