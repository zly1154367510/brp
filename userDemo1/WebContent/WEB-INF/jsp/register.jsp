<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>注册</h1>
	
	<%

	
	%>
	${error.e}
	
	<div class="registerForm">
	<form action="${pageContext.request.contextPath }/RegisterServlet" method="post">
		<table>
			<tr>
			<td>用户名:</td>	<td><input name="username" type="text"></td>
			<td><div class="errorMassage">${errors.usernameError }</div></td>
			</tr>
				<tr>
					<td>密码:	</td><td><input name="password" type="password"></td>
					<td><div class="errorMassage">${errors.passwordError }</div></td>
				</tr>
					<tr>
						<td>email:	</td><td><input name="email" type="text"></td>
						<td><div class="errorMassage">${errors.emailError }</div></td>
					</tr>
						<tr>
							<td>生日:	</td><td><input name="birhday" type="text"></td>
						</tr>
							<tr>
								<td>真实姓名:	</td><td><input name="cickname" type="text"></td>
								<td><div class="errorMassage">${errors.cicknameError }</div></td>
							</tr>
								<tr>
								<td><input type="submit" value="提交"></td>
								</tr>
		</table>
	</form>
	</div>
</body>
</html>