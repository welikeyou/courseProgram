<%--
  Created by IntelliJ IDEA.
  User: DongShuYuan
  Date: 2019/5/2
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/homePage.css">
    <script src="../js/homePage.js"></script>
</head>
<body>
<img src="img/head.jpg" class="upImg">

<div class="bottomBox">
    <!--<%--左部导航栏--%>-->

    <div class="leftBox">

        <div class="leftUpBox" id="messageBox">
            <div>欢迎您ll</div>
        </div>


        <div id="bookType" class="bookType">
            <div>书籍分类</div>
            <ul>
                <li>
                    文学经典
                </li>
                <li>
                    网络文学
                </li>
                <li>
                    自然科学
                </li>
                <li>
                    教辅资料
                </li>
                <li>
                    其他
                </li>
            </ul>
        </div>
    </div>

    <div class="rightBox">

        <div id="searchBox">
            <input type="search" placeholder="搜索">
        </div>

        <div class="showBordColumn">
            <div class="showBordRow">
                <form action="DetailServlet.do" method="post" id="showDetailForm"></form>
                <input type="text" value="goodsId" id="goodsId" name="goodsId" style="display: none"/>
                <div  class="showBox" >
                    <img src="img/book.jpg"/>
                    <div>书名：假如给我三天光明</div>
                    <div>价格：30元</div>
                    <span type="button"  id="detailBtn" onclick="toDetail()">详情</span>
                    <span type="button" id="addToCarBtn" onclick="toAddToCar()">加入购物车</span>
                </div>

                <div  class="showBox" >
                    <img src="img/book.jpg"/>
                    <div>书名：假如给我三天光明</div>
                    <div>价格：30元</div>
                    <span type="button"  id="detailBtn" onclick="">详情</span>
                    <span type="button" id="addToCarBtn" onclick="">加入购物车</span>
                </div>

                <div  class="showBox" >
                    <img src="img/book.jpg"/>
                    <div>书名：假如给我三天光明</div>
                    <div>价格：30元</div>
                    <span type="button"  id="detailBtn" onclick="">详情</span>
                    <span type="button" id="addToCarBtn" onclick="">加入购物车</span>
                </div>
            </div>
            <div class="showBordRow">
                <div  class="showBox" >
                    <img src="img/book.jpg"/>
                    <div>书名：假如给我三天光明</div>
                    <div>价格：30元</div>
                    <span type="button"  id="detailBtn" onclick="">详情</span>
                    <span type="button" id="addToCarBtn" onclick="">加入购物车</span>
                </div>

                <div  class="showBox" >
                    <img src="img/book.jpg"/>
                    <div>书名：假如给我三天光明</div>
                    <div>价格：30元</div>
                    <span type="button"  id="detailBtn" onclick="">详情</span>
                    <span type="button" id="addToCarBtn" onclick="">加入购物车</span>
                </div>

                <div  class="showBox" >
                    <img src="img/book.jpg"/>
                    <div>书名：假如给我三天光明</div>
                    <div>价格：30元</div>
                    <span type="button"  id="detailBtn" onclick="">详情</span>
                    <span type="button" id="addToCarBtn" onclick="">加入购物车</span>
                </div>
            </div>
        </div>

    </div>
</div>
</div>
</body>

</html>
