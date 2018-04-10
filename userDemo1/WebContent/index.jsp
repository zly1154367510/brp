<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
if(request.getSession().getAttribute("user")==null){
%>
<a href= "${pageContext.request.contextPath}/RegisterUIServlet">注册</a>
<a href="${pageContext.request.contextPath }/LoginUIServlet">登录</a>
<%
}else{
	

%>
<h1>欢迎${user.getCickname()}</h1>
<br>
<a href="${pageContext.request.contextPath}/LoginOutServlet">注销</a>

<%
}
%>
</body>
</html>