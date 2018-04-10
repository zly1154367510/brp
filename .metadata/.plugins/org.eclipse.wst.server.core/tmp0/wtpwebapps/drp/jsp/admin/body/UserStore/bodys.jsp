<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    


<%@ page language="java" import="org.apache.taglibs.standard.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" import="javax.servlet.jsp.jstl.*" %>

<%@ page isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://localhost:8080/drp/jsp/admin/body/UserStore/js/bodyJs.js" type="text/javascript"></script>
<link rel="stylesheet" href="http://localhost:8080/drp/jsp/admin/body/UserStore/css/body.css" type="text/css"/>
</head>
<body>

	<h1 align="center">用户管理</h1>
	<table border="1">
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>手机号</th>
			<th>电子邮箱</th>
			<th>注册时间</th>
		</tr>
			<c:forEach items="${UserSelectAll}"  var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.username }</td>
					<td>${user.phone_number }</td>
					<td>${user.email}</td>
					<td>${user.create_time }</td>
					<td><a href="${pageContext.request.contextPath}/AdminBanUserUiServlet?user_id=${user.id}">封禁</a></td>
				</tr>
			
			</c:forEach>
	</table>
</body>
</html>