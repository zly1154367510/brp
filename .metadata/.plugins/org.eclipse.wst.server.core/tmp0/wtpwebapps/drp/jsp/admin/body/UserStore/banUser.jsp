<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8	">
<title>Insert title here</title>
</head>
<body>
   	<div name="banReason">
		<h2>用户${user_id}封禁表单</h2>
		<form action="${pageContext.request.contextPath}/AdminBanUserServlet?user_id=${user_id}" method="post">
			封禁原因：<input type="text" name="banReason">
			<input type="submit" value="提交">
		</form>	
	</div>
</body>
</html>