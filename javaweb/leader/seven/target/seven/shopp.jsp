<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/11/1
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session</title>
</head>
<body>
<%
    ArrayList books = new ArrayList<String>();

    books.add("三国演义");
    books.add("水浒传");
    books.add("西游记");
    books.add("红楼梦");
    books.add("骆驼祥子");
    books.add("茶馆");
    session.setAttribute("books",books);
%>
<a href="books.jsp">查看购物车</a>



<br>

<%
    String id = session.getId();
    out.println("当前sessionId为"+id);

%>



<%

Integer count=(Integer) application.getAttribute("count");
if(count==null){
    count=new Integer(0);
}
count++;
application.setAttribute("count",count);


%>
<br>
您是第<%=count%> 个访问者

</body>
</html>