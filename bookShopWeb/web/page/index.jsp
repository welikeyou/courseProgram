<%@ page import="main.java.modul.Goods" %>
<%@ page import="java.util.List" %>
<%@ page import="main.java.dao.GoodsDao" %><%--
  Created by IntelliJ IDEA.
  User: Dongshuyuan
  Date: 2019/5/2
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" href="../css/homePage.css">
  <script src="../js/homePage.js"></script>
  <script src="../js/jquery.easing.1.3.js"></script>
  <script src="../js/jquery-3.2.1.min.js"></script>
</head>
<body>
<%
  GoodsDao goodsDao=new GoodsDao();
  List<Goods> goodsList = goodsDao.getGoods(); %>
<img src="img/head.jpg" class="upImg">
<div class="userInfo" style="display: none">
  <input id="isAccount" value="<%=request.getSession().getAttribute("account")%>">
</div>
<div class="bottomBox">

  <div class="leftBox">
    <div class="leftUpBox" id="loginBox">
      <form action="LoginServlet.do" method="post" id="loginForm">
              <span style="display: inline">
                  账号：
              </span>
        <input type="text" name="account" id="account" ><br/>
        <span style="display: inline">
                   密码：
               </span>
        <input type="password" name="password" id="password"><br/>

        <input type="button" id="loginBtn" value="提交" onclick="login()">
        <input type="button" id="registerBtn" value="注册" onclick="toRegister()">
      </form>
    </div>

    <div class="leftUpBox" id="messageBox" style="display:none">
      <div>欢迎您李兰</div>
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

      <%for(int i=0; i<goodsList.size();i++){%>
    <%if(i%3==0){%>
    <div class="showBordRow">
      <%}%>
        <form action="DetailServlet.do" method="post" id="showDetailForm">
          <input type="text" value="<%=goodsList.get(i).getGoodsId()%>" id="goodsId" name="goodsId" style="display: none"/>
          <div  class="showBox" >
            <img src="<%=goodsList.get(i).getPicture()%>"/>
            <div>书名：<%=goodsList.get(i).getGoodsName()%></div>
            <div>价格：<%=goodsList.get(i).getPrice()%>元</div>
            <span type="button"  id="detailBtn" onclick="toDetail()">详情</span>
            <span type="button" id="addToCarBtn" onclick="toAddToCarIndex()">加入购物车</span>
          </div>
        </form>
   <%if(i%3==2){%>
    </div>
<%}
   }%>
  </div>
</div>
</div>

<div id="regiserDiv" style="display: none">
  <form action="Register.do" method="post" id="regiserForm" >
    <input type="tel" id="accountReg" placeholder="请输入账号">
    <input type="text" id="name" placeholder="请输入用户名">
    <input type="password" id="password1" placeholder="请输入密码">
    <input type="password" id="password2" placeholder="确认密码">
    <input type="button" id="registerSubBtn" value="提交" onclick="register()">
    <span id="toLogin" onclick="toLogin()">去登陆</span>
  </form>
</div>
</body>
</html>
