<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
</head>

<body>
<p>hello world</p>
<h1>你好</h1>

<form action="/action_page.php">
    <label for="fname">First name:</label><br>
    <input type="text" id="fname" name="fname" value="Bill"><br>
    <label for="lname">Last name:</label><br>
    <input type="text" id="lname" name="lname" value="Gates"><br><br>
    <input type="submit" value="Submit">
</form>


<ul>
    <li>Coffee</li>
    <li>Milk</li>
</ul>


<table border="1">
    <tr>
        <th>Heading</th>
        <th>Another Heading</th>
    </tr>
    <tr>
        <td>row 1, cell 1</td>
        <td>row 1, cell 2</td>
    </tr>
    <tr>
        <td>row 2, cell 1</td>
        <td>row 2, cell 2</td>
    </tr>
</table>

</body>
</html>









<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Inser title here</title>--%>


<%--</head>--%>

<%--<script type = "text/javascript" charset="UTF-8">--%>
<%--    var numEl;--%>
<%--    var msgEl;--%>
<%--    function fun(){--%>
<%--        if(!numEl){--%>
<%--            numEl = document.getElementById('num');--%>
<%--        }--%>
<%--        var money = parseInt(numEl.value);--%>
<%--        if(isNaN(money)){--%>
<%--            alert("请输入0~100");--%>
<%--            numEl.value = '';--%>
<%--            numEl.focus();--%>
<%--            return ;--%>
<%--        }--%>
<%--        else if(money <1 || money > 100){--%>
<%--            alert("请输入0~100");--%>
<%--            numEl.focus();--%>
<%--            return ;--%>
<%--        }--%>
<%--        var left1 = parseInt(money / 50);--%>
<%--        var money1 = money % 50;--%>

<%--        var left2 = parseInt(money1 / 20);--%>
<%--        var money2 = money1 % 20;--%>

<%--        var left3 = parseInt(money2 / 10);--%>
<%--        var money3 = money2 % 10;--%>

<%--        var left4 = parseInt(money3 / 5);--%>
<%--        var money4 = money3 % 5;--%>

<%--        var output = money + "元应该找零为<br/> "+" 50元  <font color = 'red'>"+ left1 + "</font>张<br/>"+--%>
<%--            "20元<font color = 'red' >" + left2 + "</font>张<br/>"+--%>
<%--            "10元<font color = 'red' >" + left3 + "</font>张<br/>"+--%>
<%--            "5元<font color = 'red' >" + left4 + "</font>张<br/>"+--%>
<%--            "1元<font color = 'red' >" + money4 + "</font>张";--%>
<%--        if(!msgEl){--%>
<%--            msgEl = document.getElementById('msg');--%>
<%--            msgEl.innerHTML = output;--%>
<%--        }--%>
<%--    }--%>
<%--</script>--%>
<%--<body>--%>
<%--<center>--%>
<%--    <h1>货币找零系统</h1>--%>
<%--    请输入一个1~100的数值：<input type = "text" id = "num"/> &nbsp;--%>
<%--    元&nbsp;<input type = "submit" value = "确定" onclick = "fun()"/>--%>
<%--    <div id = "msg"></div>--%>
<%--</center>--%>


<%--<tr>--%>
<%--    <td>第二个作业</td>--%>
<%--    <td><a href="<%=request.getContextPath() %>/redirect/redirect_01.jsp" target="_blank">作业二跳转</a></td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--    <td>第三个个作业</td>--%>
<%--    <td><a href="<%=request.getContextPath() %>/redirect/redirect_02.jsp" target="_blank">作业三跳转</a></td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--    <td>第四个作业</td>--%>
<%--    <td><a href="<%=request.getContextPath() %>/redirect/redirect_03.jsp" target="_blank">作业四跳转</a></td>--%>
<%--</tr>--%>
<%--</body>--%>
<%--</html>--%>
