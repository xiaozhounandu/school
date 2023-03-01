<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/12/13
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*, java.sql.*" pageEncoding="gb2312" %>
<%@ page import ="Dao.StudentDao" %>
<%@ page import ="beans.Student" %>
<html>

<body>
<%
  StudentDao studentDao = new StudentDao();
  ArrayList students = studentDao.queryAllStudents();
%>

<table border="2" >
  <tr>
    <td>Ñ§ºÅ</td>
    <td>ÐÕÃû</td>
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
