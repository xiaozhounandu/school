<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%
     String user= (String) session.getAttribute("user");
    String password= (String)session.getAttribute("password");
    out.println("欢迎用户"+user+"密码是"+password);

%>
</body>
</html>
