<%@page import="com.czy.bean.User"%>
<%@page import="com.czy.factory.DAOFactory"%>
<%@page import="com.czy.dao.UserDao"%>
<%@page import="com.czy.service.UserService"%>
<%@ page language="java" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	String uname = (String) session.getAttribute("uname");
	String usid = String.valueOf(session.getAttribute("usid"));
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>个人信息</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="js/kit.js"></script>
<!--[if IE]>
		<script src="js/ieFix.js"></script>
		<![endif]-->
<script type="text/javascript">
	var _gaq = _gaq || [];
	_gaq.push([ '_setAccount', 'UA-30210234-1' ]);
	_gaq.push([ '_trackPageview' ]);
	(function() {
		var ga = document.createElement('script');
		ga.type = 'text/javascript';
		ga.async = true;
		ga.src = ('https:' == document.location.protocol ? 'https://ssl'
				: 'http://www')
				+ '.google-analytics.com/ga.js';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(ga, s);
	})();
</script>
<script src="js/dom.js"></script>
<script src="js/form.js"></script>
<link rel="stylesheet" href="css/css.css" />
<link rel="stylesheet" href="css/login.css" />
<link rel="stylesheet" href="css/validator.css" />
<!--validator-->
<script src="js/validator.js"></script>
<script src="js/autowired.validator.js"></script>
<style>
table td {
	font-size: 19px;
}

label {
	cursor: pointer;
	margin-right: 1em;
}
</style>

<script type="text/javascript">
	function editInfo() {
		if (document.getElementById("submit").value == "编辑个人信息") {
			document.getElementById("Email").disabled = false;
			document.getElementById("Password").disabled = false;
			document.getElementById("submit").value = "确认修改";
			return false;
		}
		return true;
	}
</script>

</head>
<body>
	<h1>个人信息</h1>
	<div id="regist-main">
		<form id="registForm" action="servlet/EditInfoServlet" method="get">
			<ol>
				<%
					UserDao dao = DAOFactory.getUserServiceInstance();
					User user = dao.queryByName(uname);
					if (user != null) {

					}
				%>

				<li><label for="UserName">用户名： <span
						class="kitjs-validator" for="@UserName"
						rules="[{notNull:true, message:'用户名不能为空'}]"></span>
				</label> <span class="field-validation-valid" data-valmsg-for="UserName"
					data-valmsg-replace="true"></span> <input id="UserName"
					name="UserName" type="text" value="<%=user.getUname()%>"
					disabled="true"></li>

				<label></label>

				<li><label for="Email">邮箱地址： <span
						class="kitjs-validator" for="@Email"
						rules="[{notNull:true, message:'电子邮件不能为空'},{isEmail:true,message:'电子邮件格式不正确'}]"></span>
				</label> <span class="field-validation-valid" data-valmsg-for="Email"
					data-valmsg-replace="true"></span> <input id="Email" name="Email"
					type="text" value="<%=user.getEmail()%>" disabled="true"></li>

				<label></label>

				<li><label for="Password">密码： <span
						class="kitjs-validator" for="@Password"
						rules="[{notNull:true, message:'密码不能为空'},{minLength:'6',message:'密码长度最少为6位'}]"></span>
				</label> <span class="field-validation-valid" data-valmsg-for="Password"
					data-valmsg-replace="true"></span> <input id="Password"
					name="Password" type="password" value="<%=user.getPasswd()%>"
					disabled="true"></li>

				<label></label>

			</ol>
			<div class="registError"></div>
			<input id="submit" type="submit" value="编辑个人信息" class="btn-submit"
				onclick="return editInfo()">
		</form>
	</div>
</body>
</html>