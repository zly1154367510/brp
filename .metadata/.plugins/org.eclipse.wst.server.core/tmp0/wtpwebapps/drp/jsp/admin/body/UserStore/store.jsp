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
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://localhost:8080/drp/jsp/admin/body/UserStore/js/bodyJs.js" type="text/javascript"></script>

</head>
<body>
	<center>
		<h1>门店管理</h1>
		<table border="1">
			<tr>
				<th>序号</th>
					<th>用户名</th>
						<th>地址</th>
							<th>手机号</th>
								<th>法人代表</th>
									<th>照片</th>
										<th>是否激活</th>
			</tr>
	
			<c:forEach items="${storeList}" var="store">
				<tr>
					<td>${store.id }</td>
					<td>${store.username }</td>
					<td>${store.address }</td>
					<td>${store.phone_number }</td>
					<td>${store.legal_person }</td>
					<c:choose>
						<c:when test="${store.images_url=='1'}">
							<td>还未上传</td>
						</c:when>
						<c:otherwise>
							<td><a href="${pageContext.request.contextPath}/AdminCheckStoreImagesUiServlet?images_url=${store.images_url}" target="_self">点击查看</a></td>
						</c:otherwise>
					</c:choose>
					<c:choose>
					    <c:when test="${store.is_audit=='0'}">
					       <td><a href="" id=actiBtn onclick="activation(${store.id})">否！点击激活</a></td>
					    </c:when>
					    <c:when test="${store.is_audit== '1'}">
					       <td>是</td>
					    </c:when>
					</c:choose>
					
				</tr>
			</c:forEach>
			
		</table>
	</center>
</body>
<Script>

function activation(data){
	$.get(
		"StoreActivationServlet",
		{store_id:data},
		function(){
			alert("成功")
		}
	)
}

 
</Script>
</html>