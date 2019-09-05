<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="com.czy.dao.GoodsDao"%>
<%@ page import="com.czy.bean.Goods"%>
<%@ page import="com.czy.factory.DAOFactory"%>
<%@ page import="java.util.List"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<title>购物</title>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/another_style.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/popuo-box.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/responsiveslides.min.js"></script>
<script>
	$(function() {
		$("#slider").responsiveSlides({
			auto : true,
			speed : 500,
			namespace : "callbacks",
			pager : true,
		});
	});
	function showtime(){
		var myDate = new Date();
		document.getElementById("time").innerHTML = myDate.getHours() + "时" + myDate.getMinutes() + "分"+ myDate.getSeconds() + "秒" ;
		setTimeout("showtime()",1000);
	}
</script>
</head>
<body>
	<jsp:include page="jsp/head.jsp"></jsp:include>
	<!--content-->
	<div class="content">
		<div class="container">
			<div class="content-top">
				<%
					GoodsDao dao = DAOFactory.getGoodsServiceInstance();
					List<Goods> goodsList = dao.getAllGoods();
					if (goodsList != null && goodsList.size() > 0) {
						for (int i = 0; i < goodsList.size(); i++) {
							if (i % 4 == 0) {
				%>
				<div class="content-top1">
					<%
						}
					%>
					<div class="col-md-3 col-md2">
						<div class="col-md1 simpleCart_shelfItem">
							<a
								href="jsp/goodsDescribed.jsp?gid=<%=goodsList.get(i).getGid()%>"
								target="_blank"> <%
 	String photoPath = "images/" + goodsList.get(i).getPhoto();
 %> <img class="img-responsive" src=<%=photoPath%> alt="图片" />
							</a>
							<h3>
								<a
									href="jsp/goodsDescribed.jsp?gid=<%=goodsList.get(i).getGid()%>"
									target="_blank"><%=goodsList.get(i).getGname()%></a>
							</h3>
							<div class="price">
								<h5 class="item_price"><%=goodsList.get(i).getPrice()%>元
								</h5>
								<a
									href="jsp/addToCart.jsp?gid=<%=goodsList.get(i).getGid()%>&buyNumber=1"
									class="item_add">加入购物车</a>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<%
						if (i % 4 == 3) {
					%>
					<div class="clearfix"></div>
				</div>
				<%
					}
						}
					}
				%>
			</div>
		</div>
	</div>
</body>
</html>