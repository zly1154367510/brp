<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
	
	<frameset rows="10%,*" >
		<frame name="header" src="${pageContext.request.contextPath}/jsp/admin/body/header.jsp">
		
		<frameset cols="15%,*">
			<frame name="left" src="${pageContext.request.contextPath}/jsp/admin/body/left.jsp">
			<frame name="bodys" src="${pageContext.request.contextPath}/jsp/admin/body/UserStore/bodys.jsp">
		</frameset>
	
		
	</frameset>

</html>