<%--
  Created by IntelliJ IDEA.
  User: 魏志杰
  Date: 2022/9/20
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
    <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
    <html>
<body>
<%

    Integer count = (Integer) application.getAttribute("count");
    if (count == null) {
        count = new Integer(0);
    }
    count++;
    application.setAttribute("count", count);


%>
<br>
您是第<%=count%> 个访问者
</body>
</html>




