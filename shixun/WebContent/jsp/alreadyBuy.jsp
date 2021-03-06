<%@ page import="java.util.List"%>
<%@ page import="vo.Order"%>
<%@ page import="vo.Product"%>
<%@ page import="DAO.OrderDAO"%>
<%@ page import="DAO.ProductDAO"%>

<%@ page language="java" pageEncoding="utf-8"%>


<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			int j=0;
%>


<!DOCTYPE html>
<html>
<head>
<title>已购买</title>
<!--
	<base href="<%=basePath%>">
-->

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="../css/another_style.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="../css/memenu.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="../css/cartTable.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="../css/popup.css" rel="stylesheet" type="text/css"
	media="all" />
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<%--<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>--%>
<%--<script--%>
<%--src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
<%--<script type="text/javascript" src="../js/jquery.min.js"></script>--%>
<script type="text/javascript" src="../js/responsiveslides.min.js"></script>
<script type="text/javascript" src="../js/memenu.js"></script>
<%--<script src="../js/jquery-3.1.1.min.js">--%>

<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="../js/bootstrap.min.js"></script>
<script src="../js/jquery.min.js"></script>
	<script src="../js/jquery.easing.1.3.js"></script>
	<script src="../js/jquery-3.2.1.min.js"></script>

</head>
<body>
	<!--插入head-->
	<jsp:include page="head.jsp"></jsp:include>
	<!--显示订单-->
	<center>
		<div class="content">
			<table cellspacing="0">
				<tr>
					<th style="padding: 20px; font-size: 14px; font-weight: 600;"
						colspan="8">已购买商品</th>
				</tr>
				<tr>
					<th>商品图片</th>
					<th>商品名</th>
					<th>数量</th>
					<th>价格</th>
					<th>总价</th>
					<th>购买时间</th>
					<th>订单状态</th>
					<th>操作</th>
				</tr>

				<%
					int i = 1;
					List<Order> orderList = OrderDAO.getOrderList((String) request.getSession().getAttribute("uid"));
					if (orderList != null) {
						for (Order o : orderList) {
						    Product p = ProductDAO.getProductInfo(o.getProduct());
							if(j<10){

				%>
				<tr id="<%=j%>">
					<td><img src="<%=p.getPath()%>" width="50px" height="70px"
						style="padding-top: 10px; padding-bottom: 10px;"></td>
					<td><a href="jsp/product_detail.jsp?gid=<%=p.getId()%>"><%=p.getName()%></a></td>
					<td><%=o.getQuantity()%></td>
					<td><%=p.getPrice()%></td>
					<td><%=p.getPrice() * o.getQuantity()%></td>
					<td><%=o.getStartTime()%></td>
					<td><a href="jsp/alreadyBuy.jsp#popup-<%=i%>"
						class="stateButton"><%=o.getStatus()%></a></td>
					<!--需要代码根据order的id是否已签收和是否已进行过评价判断，如果状态是已签收+未评价才能进行跳转到comment.jsp-->
					<%--暂未实现--%>
					<%
						if (o.getStates().equals("4")) {
					%>
					<td><a
						href="jsp/comment.jsp?oid=<%=o.getId()%>&pname=<%=p.getName()%>&path=<%=p.getPath()%>&pid=<%=p.getId()%>">评价</a></td>
					<%
						} else {
					%>
					<td>无可进行的操作</td>
					<%
						}
					%>
				</tr>
				<%
					i++;
					j++;
						}else{%>
							<tr id="<%=j%>" style="display:none">
					<td><img src="<%=p.getPath()%>" width="50px" height="70px"
						style="padding-top: 10px; padding-bottom: 10px;"></td>
					<td><a href="jsp/product_detail.jsp?gid=<%=p.getId()%>"><%=p.getName()%></a></td>
					<td><%=o.getQuantity()%></td>
					<td><%=p.getPrice()%></td>
					<td><%=p.getPrice() * o.getQuantity()%></td>
					<td><%=o.getStartTime()%></td>
					<td><a href="jsp/alreadyBuy.jsp#popup-<%=i%>"
						class="stateButton"><%=o.getStatus()%></a></td>
					<!--需要代码根据order的id是否已签收和是否已进行过评价判断，如果状态是已签收+未评价才能进行跳转到comment.jsp-->
					<%--暂未实现--%>
					<%
						if (o.getStates().equals("4")) {
					%>
					<td><a
						href="jsp/comment.jsp?oid=<%=o.getId()%>&pname=<%=p.getName()%>&path=<%=p.getPath()%>&pid=<%=p.getId()%>">评价</a></td>
					<%
						} else {
					%>
					<td>无可进行的操作</td>
					<%
						}
					%>
				</tr>														
							<%j++;}}
					} else {
				%>
				<tr>
					<td style="padding: 20px" colspan="8">暂无购买商品</td>
				</tr>

				<%
					}
					int m=orderList.size()-1;
				%>
			</table>
			<nav>
  <ul class="pager">
    <li><a onclick="last()" style="cursor:pointer">上一页</a></li>
    <li><a  onclick="next()" style="cursor:pointer">下一页</a></li>
  </ul>
</nav>
		</div>
	</center>
	<%
		i = 1;
		if (orderList != null) {
			for (Order o : orderList) {
				String status = o.getStatus();
				int id = o.getId();
				boolean op = true;
	%>
	<div class="popup" id="popup-<%=i%>">
		<div class="popup-inner">
			<div class="popup__text">
				<h1>修改订单状态</h1>
				<div class="radioCon" id='i<%=o.getId()%>'>
					<div class="radioText">状态修改为：</div>
					<div class="radioBlock">
						<%
							if (status.equals("已发货")) {
						%>
						<div class="radio">
							<label><input type="radio" name="optionsRadios"
								id="state-1" value="shou">确认收货</label>
						</div>
						<%
							} else if (status.equals("已签收")) {
						%>
						<div class="radio">
							<label><input type="radio" name="optionsRadios"
								id="state-2" value="tui">退货</label>
						</div>
						<%
							} else if (status.equals("未发货")) {
						%>
						<div class="radio">
							<label><input type="radio" name="optionsRadios"
								id="state-3" value="qv">取消订单</label>
						</div>
						<%
							} else {
										op = false;
									}
						%>
					</div>
				</div>
			</div>
			<a class="popup__close" href="jsp/alreadyBuy.jsp#">X</a>
			<div class="submitChoice">
				<form action="CustomerAlterOrderServlet" class="popupForm"
					id='f<%=o.getId()%>'>
					<input type="hidden" name="operation" value="" id="operation">
					<input type="hidden" name="id-<%=i%>" value="<%=id%>">
					<%
						if (op == true) {
					%>
					<input type="button" value="提交修改" class="blackButton"
						id='<%=o.getId()%>' onclick="tijiao(this)" />
					<%
						} else {
					%>
					<div class="singleInput">
						<input type="text" value="无可用操作" readonly="readonly" />
					</div>
					<%
						}
					%>
				</form>
			</div>

		</div>
	</div>
	<%
		i++;
			}
		}
	%>
	<script>
		function tijiao(e) {
			var id = e.id;
			var operation = $('#i' + id + ' [name=optionsRadios]:checked')
					.val();
			var form = document.getElementById('f' + id);
			form.querySelector('#operation').value = operation;
			form.submit();
		}
	</script>
	
	<script>
     var j=1;
     function last(){
     if(j>1){
     var k=j*10
     for(k=k-11;k>=(j*10-20);k--){
     $("#"+k).show(500);
     }
     var k=j*10
     for(k;k>(j*10-10);k--){
     $("#"+(k-1)).hide();
     }
     j--;
     }else{alert("当前页为首页")}
     }
     function next(){
     //if(j<=$("#coutnP").val()/10){
		 if(j<=5){
     var k=j*10
     for(k;k<(j*10+10);k++){
     $("#"+k).show(500);
     }
     var k=j*10
     for(k;k>(j*10-10);k--){
     $("#"+(k-1)).hide();
     }
     j++;
     }else{alert("已经是最后一页")}
     
     }
     </script>
	
</body>
</html>