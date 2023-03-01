<%--<%@ page import="java.util.ArrayList" %>&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: weizhijie--%>
<%--  Date: 2022/11/1--%>
<%--  Time: 16:15--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>session</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<%--%>
<%--    ArrayList books = new ArrayList<String>();--%>

<%--    books.add("三国演义");--%>
<%--    books.add("水浒传");--%>
<%--    books.add("西游记");--%>
<%--    books.add("红楼梦");--%>
<%--    books.add("骆驼祥子");--%>
<%--    books.add("茶馆");--%>
<%--    session.setAttribute("books",books);--%>
<%--%>--%>
<%--<a href="books.jsp">查看购物车</a>--%>



<%--<br>--%>

<%--<%--%>
<%--    String id = session.getId();--%>
<%--    out.println("当前sessionId为"+id);--%>

<%--%>--%>



<%--<%--%>

<%--Integer count=(Integer) application.getAttribute("count");--%>
<%--if(count==null){--%>
<%--    count=new Integer(0);--%>
<%--}--%>
<%--count++;--%>
<%--application.setAttribute("count",count);--%>


<%--%>--%>
<%--<br>--%>
<%--您是第<%=count%> 个访问者--%>

<%--</body>--%>
<%--</html>--%>





<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/11/1
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>checklogin</title>
</head>
<body>
<%
    String username=new String(request.getParameter("username").getBytes("ISO8859_1"),"GBK");
    String password=new String(request.getParameter("password").getBytes("ISO8859_1"),"GBK");
    try {
        // 加载数据库驱动，注册到驱动管理器
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 数据库连接字符串
        String url = "jdbc:mysql://localhost:3306/userdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        // 数据库用户名
        String usename = "root";
        // 数据库密码
        String psw = "admin12345";
        // 创建Connection连接
        Connection conn = DriverManager.getConnection(url,usename,psw);
        // 判断 数据库连接是否为空
        if(conn != null){
            String sql="select * from `user` where username='"+username+"' and password='"+ password + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()){
                response.sendRedirect("shopp.jsp");
            }else{
                out.print("用户名或密码错误，请重新输入！");
%>
<a href="javascript:history.back()">返回</a>
<%
            }

            out.println("数据库连接成功！");
            conn.close();
        }else{
            // 输出连接信息
            out.println("数据库连接失败！");
        }
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
</body>
</html>
