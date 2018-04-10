<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page language="java" import="org.apache.taglibs.standard.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" import="javax.servlet.jsp.jstl.*" %>

<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">用户管理</h1>
	<table border="1" align="center">
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>封禁原因</th>
			<th>封禁时间</th>
		</tr>
			<c:forEach items="${banUserList}"  var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.user_id}</td>
					<td>${user.reason }</td>
					<td>${user.ban_time	 }</td>
					
				</tr>
			
			</c:forEach>
	</table>
</body>
</html>