<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/11/1
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<head>
    <title>addbook</title>
</head>
<body>
<form action="addbooks.jsp" method="post">
 please input you book <input name="book" type="text">
  <input type="submit" value="添加购物车">
</form>

<hr>
<%
  ArrayList books = (ArrayList) session.getAttribute("books");
  if(books == null){
    books=new ArrayList();
    session.setAttribute("books",books);
  }

  //get bookName
  String book=request.getParameter("book");
  if(book!=null){
    book=new String(book.getBytes("ISO-8859-1"));
    books.add(book);
  }
%>
购物车中的内容是:<br>
<%
  for (int i = 0; i < books.size(); i++) {
    out.println(books.get(i)+"<br>");

  }
%>



</body>
</html>
