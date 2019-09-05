<%--
  Created by IntelliJ IDEA.
  User: HanJinli
  Date: 2019/5/5
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="AddToCarServlet.do" method="post" id="addToCarForm">
    <div  class="addToCarDiv" >
        <input type="text" value="<%=request.getParameter("goodsIdAddIndex")%>" name="goodsIdAdd" style="display: none">
        <img src="img/book.jpg"/>
        <div>书名：假如给我三天光明</div>
        <div>价格：30元</div>
        <div>库存：<span id="beforeNum" name="beforeNum">1780</span>本</div>
        <div id="chooseAmount">
            <div id="decrease">-</div>
            <div><span id="num" name="num">1</span>本</div>
            <div id="increase">+</div>
        </div>
        <div id="addBtn">
            <span onclick="toHomePage()">取消</span>
            <span onclick="addToCar()">确定</span>
        </div>
    </div>
</form>
</body>
</html>
