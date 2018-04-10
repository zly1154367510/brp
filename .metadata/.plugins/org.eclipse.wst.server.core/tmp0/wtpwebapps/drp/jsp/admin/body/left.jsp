<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"">
<title>Insert title here</title>
</head>
<body>
	<div id="left_td">
		<tr>
			<h2>人员管理</h2>
		</tr>
		<tr>
			<a href="${pageContext.request.contextPath}/StoreSelectAllServlet" target="bodys">门店管理</a>
		</tr>
		<br>
		<tr>
			<a href="http://localhost:8080/drp/UserSelectAllServlet" target="bodys">用户管理</a>
		</tr>
		<br>
		<tr>
			<a href="${pageContext.request.contextPath}/AdminBanUserListServlet" target="bodys">封禁用户</a>
		</tr>
	</div>
</body>
</html>