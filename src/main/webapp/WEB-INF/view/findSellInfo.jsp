<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
        $(function () {

            var pageBean = '<%=session.getAttribute("pageBean")%>';
            if(pageBean == "null"){
                document.getElementById('saleInfo').submit();
            }
        })
    </script>
</head>
<body >
    <%@include file="header.jsp"%>
    <div id="right_Three">
        <div>
            <h3>销售信息查询：</h3>
            <form action="${APP_Path}/sale/findSaleAll" id="saleInfo">
                排序方式：
                <input type="hidden" name="pageNum" value="1">
                <select name="orderByName">
                    <option value="saleDate">销售日期</option>
                    <option value="quantity">销售量</option>
                    <option value="price">单笔总价</option>
                </select>
                <input type="submit" value="提交">
            </form>
            <table>
                <tr>
                    <td>ID</td>
                    <td>商品</td>
                    <td>单价</td>
                    <td>数量</td>
                    <td>总价</td>
                    <td>销售日期</td>
                    <td>销售员</td>
                </tr>
                <c:if test ="${not empty pageBean.list}">
                    <c:forEach  items="${pageBean.list}" var="sale">
                        <tr>
                            <td>${sale.id}</td>
                            <td>${sale.product.productName}</td>
                            <td>${sale.price}</td>
                            <td>${sale.quantity}</td>
                            <td>${sale.totalPrice}</td>
                            <td>${sale.saleDate}</td>
                            <td>${sale.users.readName}</td>
                        </tr>
                    </c:forEach>
                </c:if>
            </table>
            <div>
                <c:if test="${pageBean.pageNum > 1}">
                    <button onclick="document.getElementsByName('pageNum')[0].value = ${1};document.getElementById('saleInfo').submit();">首页</button>
                </c:if>
                <c:if test="${pageBean.pageNum > 1}">
                    <button onclick="document.getElementsByName('pageNum')[0].value = ${pageBean.pageNum - 1};document.getElementById('saleInfo').submit();">下一页</button>
                </c:if>

                <c:if test="${pageBean.totalPage > pageBean.pageNum}">
                    <button onclick="document.getElementsByName('pageNum')[0].value = ${pageBean.pageNum + 1};document.getElementById('saleInfo').submit();">下一页</button>
                </c:if>

                <c:if test="${pageBean.totalPage > pageBean.pageNum}">
                    <button onclick="document.getElementsByName('pageNum')[0].value = ${pageBean.totalPage};document.getElementById('saleInfo').submit();">末页</button>
                </c:if>
                <span> 第${pageBean.pageNum}页/共${pageBean.totalPage}页（${pageBean.totalRecord}条记录）</span>
            </div>
        <%
            session.removeAttribute("pageBean");
        %>
        </div>
    </div>
<%

    session.removeAttribute("saleItem");
%>
</body>
</html>
