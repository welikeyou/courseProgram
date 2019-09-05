<%@ page import="main.java.modul.Goods" %>
<%@ page import="java.util.List" %>
<%@ page import="main.java.dao.GoodsDao" %><%--
  Created by IntelliJ IDEA.
  User: HanJinLi
  Date: 2019/5/6
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/orderList.css">
</head>
<body>
<%
    GoodsDao goodsDao=new GoodsDao();
    List<Goods> goodsList = goodsDao.getGoods(); %>
<div class="lists">
    <%for(int i=0; i<goodsList.size(); i++){%>
    <div class="goodsList">
        <img src="img/threeLight.jpg">
        <div class="info">
            <span>书名：<%=goodsList.get(i).getGoodsName()%></span>
            <span>单价：<%=goodsList.get(i).getPrice()%>元</span>
            <span>数量：<%=goodsList.get(i).getAmount()%>本</span>
        </div>
    </div>
<%}%>
</div>

</body>
</html>
