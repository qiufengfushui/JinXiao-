<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/10/25
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${APP_Path}/statics/css/index.css" type="text/css" rel="stylesheet">
    <script src="${APP_Path}/statics/js/jquery-3.3.1.min.js"></script>
    <script src="${APP_Path}/statics/js/index.js"></script>
</head>
<body>
<%
    Object obj = session.getAttribute("userSession");
    if (null == obj){
        response.sendRedirect("../login.jsp");
    }
%>
    <div id="header">
        欢迎：${userSession.readName}，
        <a href="${APP_Path}/users/exit.do">退出登录</a>
    </div>
    <div id="context">
    <div id="left">
        <p><a href="${APP_Path}/addSell" id="addSell">添加销售</a></p>
        <p><a href="${APP_Path}/findSellInfo" id="findSellInfo">销售信息查询</a></p>
        <p><a href="${APP_Path}/findInventory" id="findInventory">查看库存</a></p>
    </div>
    </div>
</body>
</html>
