<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:8080/drp/jsp/admin/login/css/register.css" type="text/css"/>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://localhost:8080/drp/register/script/register.js" type="text/javascript"></script>
</head>
<body>
	<div id="registerDiv" align="center">	
		<h1>
			门店登录
		</h1>
		<form action="${pageContext.request.contextPath }/StoreLoginServlet" method="post"  class="form-inline">
			<div class="input-group">
			<span class="input-group-addon">账号</span>
			<input class="form-control" type="text" name="username" placeholder="请输入账号">
			</div>
			<div class="input-group">
			<span class="input-group-addon">密码</span>
			<input class="form-control" type="password" name="password" placeholder="请输入密码">
			</div>
			<input type="submit" value="登录">
			<input type="button" value="重置" id="reset">
			<div id="error">
			${loginError}<br>
			${message}
		
			</div>
		</form>
	</div>
	 <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
   <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
   <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>