<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
   <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
   <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="jumbotron">
	<div class="container">
		<h1>网站标题</h1>
		<p>网站简介</p>
		<p><a href="" class="btn btn-default">快速进入</a></p>
	</div>
</div>
<br><br><br><br><br>
<h2>轮播图</h2>
<div class="container">
	<div id="myCarousel" class="carousel slide">
	    <!-- 轮播（Carousel）指标 -->
	    <ol class="carousel-indicators">
	        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
	        <li data-target="#myCarousel" data-slide-to="1"></li>
	        <li data-target="#myCarousel" data-slide-to="2"></li>
	    </ol>   
	    <!-- 轮播（Carousel）项目 -->
	    <div class="carousel-inner" >
	        <div class="item active">
	            <img src="C:\Users\zly11\Pictures\我的壁纸\c027a64ejw1f2qqql5q2dj20qq0qo0wi.jpg" alt="First slide">
	        </div>
	        <div class="item" >
	            <img src="C:\Users\zly11\Pictures\我的壁纸\c027a64ejw1f2qqql5q2dj20qq0qo0wi.jpg" alt="Second slide">
	        </div>
	        <div class="item">
	            <img src="C:\Users\zly11\Pictures\我的壁纸\c027a64ejw1f2qqql5q2dj20qq0qo0wi.jpg" alt="Third slide">
	        </div>
	    </div>
	    <!-- 轮播（Carousel）导航 -->
	    <a class="carousel-control left" href="#myCarousel" 
	        data-slide="prev">&lsaquo;
	    </a>
	    <a class="carousel-control right" href="#myCarousel" 
	        data-slide="next">&rsaquo;
	    </a>
	</div>
</div>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<h1>响应式</h1>
<div class="container">
	<div class="row">
		<div class="col-md-3 col-sm-4 col xs-6">111</div>
		<div class="col-md-3 col-sm-4 col xs-6">111</div>
		<div class="col-md-3 col-sm-4 col xs-6">111</div>
		<div class="col-md-3 col-sm-4 col xs-6">111</div>
	</div>
</div>




</body>
</html>