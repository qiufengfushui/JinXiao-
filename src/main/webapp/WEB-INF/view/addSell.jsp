<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/10/25
  Time: 11:00
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
        function addSale(){
            var price = $(document.getElementById("price"))
            var productId = $(document.getElementsByName("productId")[0])
            var quantity = $(document.getElementById("quantity"))
            if(productId.val() == "null"){
                alert("商品名称输入有误！！！")
                return false
            }else if (price.val() == "") {
                alert("商品单价输入有误！！！")
                return false
            }else if(quantity.val() == ""){
                alert("销售数量输入有误！！！")
                return false
            }
            return true;
        }
    </script>
</head>
<body>
    <%@include file="header.jsp"%>
    <div id="right_Two">
        <h3 style="margin-left: -130px;">添加销售：</h3>
        <form action="${APP_Path}/sale/addSales" onsubmit="return addSale(this)">
            <p style="margin-left: -52px">
                商品名称：
                <select name="productId" >
                    <option value="null">--请选择商品--</option>
                </select>
            </p>
            <p>商品单价：<input type="text" name="price" id="price" ></p>
            <p>销售数量：<input type="text" name="quantity" id="quantity" ></p>
            <p><input type="submit" value="保存"></p>
        </form>
    </div>
</body>
</html>
