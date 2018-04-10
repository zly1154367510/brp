<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
   <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
   <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="dropdown">
		<button class="btn btn-default" data-toggle="dropdown">信息管理
			<span class="caret"></span>
		</button>
		<ul class="dropdown-menu">
			<li class="dropdown-header">信息管理</li>
			<li><a href="${pageContext.request.contextPath }/StoreDataServlet" target="welcome">门店信息</a></li>
			<li><a href="${pageContext.request.contextPath }/StoreCarSelectAll" target="welcome">汽车管理</a></li>
			<li><a href="${pageContext.request.contextPath }/StoreCarRegisterUiServlet" target="welcome">汽车登记</a></li>
			<li class="divider"></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>