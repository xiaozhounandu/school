<%--
  Created by IntelliJ IDEA.
  User: weizhijie
  Date: 2022/10/18
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <script type="application/javascript">
        function login() {
            let loginName =document.getElementById("loginName");
            if (loginName.account.value!= "admin")  {
                return;
            }if(loginName.password1.value !="123456"){
                return;
            }
            loginName.submit();
        }

    </script>
</head>

<body>

欢迎登陆本系统
<form id="loginName" action="loginsuc1.jsp">
    输入账号：<input name="account" type="text"><br>
    输入密码： <input name="password1" type="password"><br>
    <input type="button" value="login" onclick="login()">
</form>


</body>
</html>
