<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/10/25
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${APP_Path}/statics/css/index.css" type="text/css" rel="stylesheet">
    <script src="${APP_Path}/statics/js/jquery-3.3.1.min.js"></script>
    <script>
        //初始化
        $(function () {
            //加载商品名称
            function findProductNameAll() {
                $.getJSON("${APP_Path}/product/findProductNameAll",function (data) {
                    var select = []
                    var init = '<option value="null">--请选择商品--</option>';
                    for (var i = 0;i < data.length;i++){
                        var option = '<option value='+data[i]['id']+'>'+data[i]['productName']+'</option>'
                        select.push(option)
                    }
                    $(document.getElementsByName("productId")).html(init+select);
                });
            }
            findProductNameAll()
        })
        function findInventoryCount() {
            var productId = $(document.getElementsByName("productId")[1]).val()
            if(productId == "null"){
                alert("商品名称输入有误！！！")
                return false
            }
            return true
        }
    </script>
</head>
<body>
    <%@include file="header.jsp"%>
    <div id="right_Four">
        <div id="top">
            <h3>查看库存：</h3>
            <form action="${APP_Path}/product/findInventoryCount" onsubmit="return findInventoryCount()">
                商品名称：
                <select name="productId">
                    <option>--请选择商品--</option>
                </select>
                <input type="submit" value="查询">
            </form>
        </div>
        <h2>
            <%
                Object count = request.getAttribute("count");
                if (null != count){
                    %>
                            该商品的库存是：${count}
                    <%
                }
            %>
        </h2>
    </div>
</body>
</html>
