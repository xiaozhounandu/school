<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<script type = "text/javascript">
function add() {
//得到这两个文本框的内容
n1 = Number(document.form1.txt1.value);
n2 = Number(document.form1.txt2.value);
n3 = Number(document.form1.txt3.value);
n4 = Number(document.form1.txt4.value);
n5 = Number(document.form1.txt5.value);
document.form1.txt6.value = n1 + n2 + n3 + n4 + n5;
}
</script >
<form name ="form1">
<input name ="txt1" type ="text"><br>
<input name = "txt2" type = "text"> <br>
    <input name = "txt3" type = "text"> <br>
    <input name = "txt4" type = "text"> <br>
    <input name = "txt5" type = "text"> <br>
<input type = "button" onclick="add()" value = "求和"><br>
<input name = "txt6" type = "text"><br>
</form>
</body>
</html>
