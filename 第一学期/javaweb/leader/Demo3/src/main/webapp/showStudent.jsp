<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.util.*, java.sql.*"%>
<%@ page import ="DAO.StudentDao1" %>
<%@ page import ="beans.Student" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
  StudentDao1 studentDao = new StudentDao1();
  ArrayList students = studentDao.queryAllStudents();
%>

<table border="2" >
  <tr>
    <td>学号</td>
    <td>姓名</td>
  </tr>

  <%
    for (int i = 0; i < students.size(); i++) {
      Student student = (Student) students.get(i);

  %>
  <tr>
    <td><%=student.getStuno()%></td>
    <td><%=student.getStuname()%></td>
  </tr>

  <%
    }
  %>
</table>
</body>
</html>