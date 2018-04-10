<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:8080/drp/register/css/register.css" type="text/css"/>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://localhost:8080/drp/register/script/register.js" type="text/javascript"></script>
</head>
<body>

		<div id="loginDiv" align="center">	
			<h1>
				管理员登录
			</h1>
			<form action="${pageContext.request.contextPath}/AdminLoginServlet" method="post">
				用户名:<br>
				<input type="text" name="username" id="usernameInput">
				<br>
				密码:
				<br>
				<input type="password" name="password" id="passwordInput">
				<br>
				<input type="submit" value="登录">
				<input type="button" value="重置" id="reset">
			</form>
			<h2>${loginError}</h2>
		</div>

</body>
</html>