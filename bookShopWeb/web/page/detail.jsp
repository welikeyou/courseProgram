<%@ page import="main.java.modul.Goods" %><%--
  Created by IntelliJ IDEA.
  User: HanJinli
  Date: 2019/5/5
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品详情</title>
    <link rel="stylesheet" href="../css/detail.css">
</head>
<body>
<% Goods goods = (Goods) request.getAttribute("goodsInfo");%>
<div class="leftBox">
    <img src="img/book.jpg"/>
    <div>书名：<%=goods.getGoodsName()%></div>
    <div>价格：<%=goods.getPrice()%>元</div>
    <div>描述：<%=goods.getDescribe()%></div>
</div>
<div class="rightBox">
    <span type="button"  id="detailBtn" onclick="">购买</span>
    <span type="button" id="addToCarBtn" onclick="">加入购物车</span>
    <span type="button" id="backToHome" onclick="">返回</span>
</div>
</body>

</html>
