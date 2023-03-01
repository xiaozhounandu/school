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
<a href="compute_book.jsp">购买页面</a>
<%
    String deleteBook = request.getParameter("delete");

    ArrayList<String> books = (ArrayList<String>)session.getAttribute("books");

    if(deleteBook!=null){
        books.remove(deleteBook);
    }
    out.println("书籍：");
    for(int i=0; i<books.size(); i++){
        out.println("<p>"+books.get(i)+ "<a href='cart.jsp?delete="+books.get(i)+"'>删除</a></p>");
    }
%>

</body>
</html>