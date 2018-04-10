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
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
<%	
	String c_id = request.getParameter("c_id");
	request.getSession().setAttribute("c_id",c_id);
%>
	<h1>汽车图片上传</h1>
	<form action="${pageContext.request.contextPath }/StoreCarImagesUpload" method="post" enctype="multipart/form-data">
		<input type="file" name="carImage[]" class="images"/>
		<input type="submit" value="提交">
		<input type="button" value="添加一张" id="addBtn">
	</form>
</body>
<script>
	$(function(){
		$("#addBtn").click(function(){
			$("body").append('<input type="file" name="carImage[]" class="images"/><br>');
		});
	});
</script>
</html>