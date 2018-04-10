<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>填写申请信息</h1>
	<form action="${pageContext.request.contextPath}/StoreDataReview?username=${username}" method="post" enctype="multipart/form-data">
		<input type="file" name="images_file">
		<input type="submit" value="上传">
	</form>

</body>
</html>