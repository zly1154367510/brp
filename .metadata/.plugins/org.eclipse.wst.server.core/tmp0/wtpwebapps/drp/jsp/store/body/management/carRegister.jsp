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
</head>
<body>
	<div id="registerDiv" align="center">	
		<h1>
			汽车注册
		</h1>
		<form action="${pageContext.request.contextPath }/StoreCarRegisterServlet" method="post" >
			品牌:
			<br>
			<input type="text" name="brand" id="usernameInput">
			<br>
			型号:
			<br>
			<input type="text" name="name" id="passwordInput">
			<br>
			年份:
			<br>
			<input type="text" name="p_year" id="emailInput">
			<br>
			里程(万里):
			<br>
			<input type="text" name="mileage" id="phomeNumberInput">
			<br>
			类别:
			<br>
			<select name="d_id">
				<option value="1">a_car</option>
						<option value="2">b_car</option>
								<option value="3">c_car</option>
										<option value="4">d_car</option>
												<option value="5">gt_car</option>
														<option value="6">mini_suv</option>
																<option value="7">pu_suv</option>
																		<option value="8">big_suv</option>
			</select>
			<br>
			<br>
			价格(万元):
			<br>
			<input type="text" name="price" id="emailInput">
			<br>
			<br>
			<input type="submit" value="注册">
			<input type="button" value="重置" id="reset">
			<div id="error">
			${errorMap.brand}<br>
			${errorMap.name}<br>
			${errorMap.p_year}<br>
			${errorMap.mileage}<br>
			${errorMap.d_id}<br>
			${errorMap.price}<br>
			
			</div>
		</form>
	</div>

</body>
</html>