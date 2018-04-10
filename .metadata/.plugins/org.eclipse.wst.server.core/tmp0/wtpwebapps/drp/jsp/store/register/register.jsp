<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:8080/drp/jsp/user/register/css/register.css" type="text/css"/>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://localhost:8080/drp/jsp/user/register/script/register.js" type="text/javascript"></script>
</head>
<body>
	<div id="registerDiv" align="center">	
		<h1>
			门店注册
		</h1>
		<form action="${pageContext.request.contextPath }/StoreRegisterServlet" method="post" >
			用户名:
			<br>
			<input type="text" name="username" id="usernameInput">
			<br>
			密码:
			<br>
			<input type="password" name="password" id="passwordInput">
			<br>
			门店地址:
			<br>
			<input type="text" name="address" id="emailInput">
			<br>
			手机号码:
			<br>
			<input type="text" name="phone_number" id="phomeNumberInput">
			<br>
			负责人:
			<br>
			<input type="text" name="legal_person" id="emailInput">
			<br>
			
			<br>
			<input type="submit" value="注册">
			<input type="button" value="重置" id="reset">
			<div id="error">
			${registerError.username}<br>
			${registerError.password}<br>
			${registerError.phone_number}<br>
			${registerError.address}<br>
			${registerError.legal_person}<br>
			${registerError.images_url}<br>
			${userExits	}<br>
			</div>
		</form>
	</div>
</body>
</html>