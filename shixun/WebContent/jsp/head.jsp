<%@ page import="java.util.List" %>
<%@ page import="vo.ShoppingCart" %>
<%@ page import="DAO.ShoppingCartDAO" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	String uid =(String)session.getAttribute("uid");
	String type =(String)session.getAttribute("type");
	List<ShoppingCart> list = ShoppingCartDAO.searchFromSQL(uid);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Head</title>
        <base href="<%=basePath%>">
        <!-- Bootstrap css -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Icon Font -->
		<link rel="stylesheet" href="css/font-awesome.min.css">
		<link rel="stylesheet" href="css/pe-icon-7-stroke.css">
        <link rel="stylesheet" href="css/style_for_index.css">
        <!-- Responsive css -->
		<link rel="stylesheet" href="css/responsive.css">
		<!-- Modernizr JS -->
		<script src="js/modernizr-2.8.3.min.js"></script>
			<!-- jQuery latest version -->
		<script src="js/jquery-3.1.1.min.js"></script>
		<!-- Bootstrap js -->
		<script src="js/bootstrap.min.js"></script>
		<!-- Plugins js -->
		<script src="js/plugins.js"></script>
		<!-- Main js -->
		<script src="js/main.js"></script>
		<style>
			#sachCon {
	margin-left: 100px;
}
			.new-info{
				display: none;
				background-color: red;
				border-radius: 50%;
				color: #fff;
				font-size: 10px;
				font-weight: 500;
				height: 16px;
				line-height: 16px;
				padding-left: 1px;
				position: absolute;
				right: -4px;
				text-align: center;
				top: 0;
				width: 16px;
			}

</style>
    </head>
    <body>


	<!-- START HEADER SECTION -->
			<header class="header-section section sticker">
				<div class="container">
					<div class="row">
						<div class="col-xs-12">
							
							<!-- 左上角logo -->
							<div class="header-logo float-left">
								<a href="index.jsp"><img src="images/logo2.png" alt="main logo"></a>
							</div >


							<!-- header-search & total-cart -->
							
							<div class="float-right">
								<div class="header-option-btns float-right">
									<!-- header-搜索 -->
									<div class="header-search float-left">
										<button class="search-toggle"  type="button" data-toggle="dropdown"><i class="pe-7s-search"></i></button>
										<div class="dropdown-menu header-search-form">
											<form action="SearchServlet">
												<input type="text" placeholder="Search" name="search">
												<button><i class="fa fa-long-arrow-right"></i></button>
											</form>
										</div>
										
									</div>
									<%if(!(uid==null)){%>
									<!-- header 讯息 -->
									<div class="header-account float-left">
										<ul>
											<li>
												<a href="jsp/chat.jsp" style="position: relative" target="_blank"><i class="pe-7s-mail"></i><span class="new-info">1</span></a>
												<!--<ul class="dropdown-menu">
													<li>
														<a href="login.html">Log in</a>
													</li>
													<li>
														<a href="register.html">Register</a>
													</li>
													<li>
														<a href="#">My Account</a>
													</li>
													<li>
														<a href="wishlist.html">Wish list</a>
													</li>
													<li>
														<a href="checkout.html">Checkout</a>
													</li>
												</ul>-->
											</li>
										</ul>
									</div>
									<!-- Header Cart -->
									<%if(type.equals("0")){%>
									<div class="header-cart float-left">
										<!-- Cart Toggle -->
										<a class="cart-toggle" href="#" data-toggle="dropdown">
											<i class="pe-7s-cart"></i>
											<!--
                                            	显示购物车里有多少个商品
                                            -->
											<span><%=list.size()%></span>
										</a>
										<!-- Mini Cart Brief -->
										<div class="mini-cart-brief dropdown-menu text-left">

											<!-- Cart Products -->
											<div class="all-cart-product clearfix">
												<%
													double total = 0.0;
												    for (int i=0;i<list.size();i++){
											    %>
												<div class="single-cart clearfix">
													
													<!--放入购物车中的商品-->
													<div class="cart-image">
														<a href="jsp/product_detail.jsp?gid=<%=list.get(i).getProduct().getId()%>"><img src="<%=list.get(i).getProduct().getPath()%>" alt=""></a>
													</div>
													<div class="cart-info">
														<h5><a href="jsp/product_detail.jsp?gid=<%=list.get(i).getProduct().getId()%>"><%=list.get(i).getProduct().getName()%></a></h5>
														<p><%=list.get(i).getNum()%> x RMB <%=list.get(i).getProduct().getPrice()%></p>
														<!--<a href="#" class="cart-delete" title="Remove this item"><i class="pe-7s-trash"></i></a>-->
													</div>
												</div>
												<%
													total = total + list.get(i).getNum()*list.get(i).getProduct().getPrice();
													}
												%>
											</div>
											<!-- 购物车总价 -->
											<div class="cart-totals">
												<h5>Total <span><%=total%></span></h5>
											</div>
											<!-- Cart Button -->
											<div class="cart-bottom  clearfix">
												<a href="jsp/shoppingCart.jsp">查看购物车</a>
											</div>
										</div>
									</div>
									<%}%>
								<%}%>
								</div>
								<nav class="main-menu menu-right float-right">
									<ul>
										<%if(uid==null){%>
											<li class="active">
                                        <a href="login_registe.jsp">登陆/注册</a>
                                        </li>
                                        <%}else if(type.equals("0")){%>
										<li class="active">
											<a href="index.jsp">首页</a>
						
										</li>
										<li class="active">
											<a href="jsp/perInfo.jsp">个人信息</a>
						
										</li>
										<li class="active">
											<a href="jsp/alreadyBuy.jsp">查询订单</a>
						
										</li>
										<li class="active">
											<a href="login">退出登录</a>

										</li>
										<%}else{%>
											<li class="active">
											<a href="index.jsp">首页</a>
						
										</li>
										<li class="active">
											<a href="jsp/perInfo.jsp">个人信息</a>
						
										</li>
										<li class="active">
											<a href="jsp/table_list_img.jsp">查看商品</a>

										</li>
										<li class="active">
											<a href="jsp/ordersForShop.jsp">修改订单</a>
						
										</li>
										<li class="active">
											<a href="login">退出登录</a>

										</li>
										<%}%>
										
										<!--sub-menu在这里-->
										<!--<li>
											<a href="#">Pages</a>
											<ul class="sub-menu">
												<li>
													<a href="cart.html">cart</a>
												</li>
												<li>
													<a href="checkout.html">checkout</a>
												</li>
												<li>
													<a href="login.html">login</a>
												</li>
												<li>
													<a href="register.html">register</a>
												</li>
												<li>
													<a href="wishlist.html">wishlist</a>
												</li>
											</ul>
										</li>-->
										
										
									</ul>
								</nav>
							</div>
							<div class="mobile-menu"></div>
						</div>
					</div>
					
				</div>

			
			</header>
			<div id="block" style="width: 100%;">

			</div>
			<!-- END HEADER SECTION -->
			<script>
				$("#searchBtn1").click(function(){
					if(document.getElementById("sachCon").style.display=="none")
					{
					$("#sachCon").show(5);
					}
					else{
						$("#sachCon").hide(5);
					}
				});
			</script>

	<script>
		<%
			if(uid!=null){
		%>
			var notice = document.querySelector('.new-info')
			var count = 0
			var uid = '${sessionScope.uid}'
			var ws = new WebSocket('ws://<%=request.getServerName()%>:<%=request.getServerPort()%><%=request.getContextPath()%>/websocket/'+uid+'/1')
			ws.onopen = function (event) { console.log('连接建立成功') }
			window.onbeforeunload = function () {
				ws.close()
            }
            ws.onmessage = function (mes) {
				mes = mes.data
				mes = JSON.parse(mes)
				if(mes.reduce==undefined) count = count + 1
				else count = count - mes.reduce
				updateCount()
			}
			$.ajax({
				url:'message',
				data:{
					type:2,
				},
				method:'get',
				success:function (response) {
					count = Number(response)
					updateCount()
                }
			})

			function updateCount() {
				notice.innerText = count
				if(count==0) notice.style.display='none'
				else notice.style.display='block'
            }


		<% }  %>
	</script>
			
 	</body>
</html>