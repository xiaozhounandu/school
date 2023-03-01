<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>计算机图书</h2>
<p>java从入门到入土 100<a href="compute_book.jsp?book=java从入门到入土">购买</a></p>
<p>jvm精讲 50<a href="compute_book.jsp?book=jvm精讲">购买</a></p>
<p>java并发实战 60<a href="compute_book.jsp?book=java并发实战">购买</a></p>
<p>javaweb开发 70<a href='compute_book.jsp?book=javaweb开发 70'>购买</a></p>

<a  href="cart.jsp">购物车</a>
<%
ArrayList<String> books = (ArrayList<String>)session.getAttribute("books");
if(books==null){
	books=new ArrayList<>();
	session.setAttribute("books", books);
}

String book = request.getParameter("book");
if(book != null && books.indexOf(book)==-1){
	books.add(book);
}

out.println(books);
%>
</body>
</html>