<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2019/5/2
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="../../../java/servlet/LoginServlet" method="post" id="loginForm">
    <input type="text" name="account" id="account">
    <input type="password" name="password" id="password">
    <input type="button" id="loginSubmit" value="提交" onclick="toLogin()">
    <input type="button" id="register" value="注册" onclick="toRegister()">
</form>

<script type="text/javascript">
    function toLogin() {
        var loginForm = document.getElementById("loginForm");
        loginForm.submit();

    }
    function toRegister() {
        window.location.href="register.jsp";
    }
</script>


</body>
</html>
