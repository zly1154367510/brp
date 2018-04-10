<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
 <%@ page language="java" import="org.apache.taglibs.standard.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" import="javax.servlet.jsp.jstl.*" %>

<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="F:/Bootstarp/bootstrapTest/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

</table>
	<h1 align="center">车辆管理</h1>
	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<th>序号</th>
				<th>品牌</th>
				<th>型号</th>
				<th>年份</th>
				<th>里程</th>
				<th>类型</th>
				<th>价格</th>
			</tr>
			<tbody>
				<c:forEach items="${carList}"  var="car">
					<tr>
						<td>${car.id }</td>
						<td>${car.brand}</td>
						<td>${car.name }</td>
						<td>${car.p_year}</td>
						<td>${car.mileage }</td>
						<td>${car.d_id}</td>
						<td>${car.price }</td>
						<td><a href="${pageContext.request.contextPath}/jsp/store/body/management/imagesUpload.jsp?c_id=${car.id}">上传图片</a></td>
						<td><a href="${pageContext.request.contextPath}/StoreLookCarImagesServlet?c_id=${car.id}">查看图片</a></td>
						
					</tr>
				
				</c:forEach>
			</tbody>
		</thead>
	</table>
 <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
   <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
   <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>