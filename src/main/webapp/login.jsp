<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/10/22
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${APP_Path}/statics/css/login.css" type="text/css" rel="stylesheet">
    <script src="${APP_Path}/statics/js/jquery-3.3.1.min.js"></script>
    <script src="${APP_Path}/statics/js/login.js"></script>
</head>
<body>
    <div>
        <h3>小型进销存系统</h3>
        <form action="${APP_Path}/users/login.do">
            <p>用户名：<input type="text" name="userName"></p>
            <p>密码：&nbsp;&nbsp;&nbsp;<input type="password" name="password"></p>
            <p><input type="submit" value="登录"></p>
            <%
                Object obj = request.getAttribute("error");
                if (obj != null){
                    %>
                    <p style="color: red">登录失败！！！</p>
            <%
                }
            %>
        </form>
    </div>
</body>
</html>
