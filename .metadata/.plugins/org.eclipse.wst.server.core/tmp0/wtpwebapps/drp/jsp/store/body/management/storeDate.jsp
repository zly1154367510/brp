<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page language="java" import="org.apache.taglibs.standard.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" import="javax.servlet.jsp.jstl.*" %>

<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">门店信息</h1>
	<table border="1" align="center">
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>地址</th>
			<th>手机号</th>
			<th>法人代表</th>
			<th>照片</th>
		</tr>
			<c:forEach items="${storeList}"  var="store">
				<tr>
					<td>${store.id }</td>
					<td>${store.username}</td>
					<td>${store.address }</td>
					<td>${store.phone_number}</td>
					<td>${store.legal_person}</td>
					<td><a href="${pageContext.request.contextPath}/AdminCheckStoreImagesUiServlet?images_url=${store.images_url}" target="_self">点击查看</a></td>
					
				</tr>
			
			</c:forEach>
	</table>


</body>
</html>