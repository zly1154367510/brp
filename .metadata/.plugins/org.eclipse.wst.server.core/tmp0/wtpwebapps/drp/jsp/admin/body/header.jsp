<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/header.css" type="text/css"/>
</head>
<body>
<div id="header_left">
	<%
	String name = (String)request.getSession().getAttribute("user");
	System.out.println(name);
	%>
	<h1>汽车管理员 ${name}</h1>
</div>
<div id="header_right">
	<a href="${pageContext.request.contextPath}/AdminLoginOutServlet" target="_parent">注销</a>
</div>
</body>
</html>