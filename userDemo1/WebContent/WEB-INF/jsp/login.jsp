<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我是登录</title>
</head>
<body>
<h1>登录页</h1>
	<form action="${pageContext.request.contextPath }/LoginServlet"  method="post">
		<table>
			<tr>
			<td>用户名</td>
			<td><input type="text" name="username"></td>
			</tr>
			<tr>
			<td>密码</td>
			<td><input type="password" name="password"></td>
			</tr>
		
			<tr>
			<td>验证码</td>
			<td><input type="text" name="code"></td>
			</tr>
			
			<tr>
			<td><img src="http://localhost:8080/userDemo1/VerificationCodeServlet"></td>
			</tr>
			<tr>
			<td><input type="submit" value="登录"></td>
			</tr>
		</table>
	</form>
</body>
</html>