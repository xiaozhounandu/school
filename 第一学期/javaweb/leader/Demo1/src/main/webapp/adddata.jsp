<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/12/13
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String buid = request.getParameter("buid");
    String buname = request.getParameter("buname");
    String bufun = request.getParameter("bufun");
    String buaddr = request.getParameter("buaddr");


    Class.forName("com.mysql.cj.jdbc.Driver");//记载数据库驱动，注册到驱动管理器
    String url="jdbc:mysql://localhost:3306/bumen1?useUnicode=true&characterEncoding=utf-8";  //根据自己的情况修改mysql数据库ip和端口，mysql是数据库上存在的一个库
    String username="root";   //登录账号
    String password="admin12345";  //登录密码
    Connection conn=DriverManager.getConnection(url,username,password);



    String sql ="insert into bumen5(d_id, d_name, fun,address) values (?,?,?,?)";
    PreparedStatement pr = conn.prepareStatement(sql);
    pr.setString(1,buid);
    pr.setString(2,buname);
    pr.setString(3,bufun);
    pr.setString(4,buaddr);
    int i = pr.executeUpdate();
    out.println("您已成功添加"+i+"行！！！");

    pr.close();
    conn.close();
    response.sendRedirect("test1.jsp");

%>
</body>



</html>
