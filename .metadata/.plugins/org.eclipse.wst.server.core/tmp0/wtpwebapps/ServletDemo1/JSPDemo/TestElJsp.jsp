<%@page import="com.zly.test.jsp.address"%>
<%@page import="com.zly.test.jsp.Person"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
  <%
    request.setCharacterEncoding("UTF-8");
  	String date = new Date().toLocaleString();
  	request.setAttribute("date",date);
  %>
  EL语法显示数据
  ${date}
    <br>
    
  <%
  Person p = new Person();
  p.setName("张三");
  request.setAttribute("p",p);
  
  ArrayList<Person> list = new ArrayList<Person>();
  list.add(new Person("张三","183cm",new address("上海")));
  list.add(new Person("张四","184cm",new address("广州")));
  list.add(new Person("张五","185cm",new address("北京")));
  request.setAttribute("Personlist",list);
  %>
  EL语法输出
  ${p.name }; 
  <br>
  
  EL语法输出list
  ${Personlist[1].name}
  <br>
  
  <%
  Map personMap = new HashMap();
  personMap.put("aaa",new Person("张三","183cm",new address("上海")));
  personMap.put("bbb",new Person("张四","184cm",new address("广州")));
  personMap.put("ccc",new Person("张五","185cm",new address("北京")));
  request.setAttribute("personMap",personMap);
  %>
  EL语法输出MAP
  
  ${personMap.aaa.name };
  <br>
  jstlTest:
   <c:out value="Hello JSTL." />
   
   <br>
   jstl迭代List
  	<c:forEach var="person" items="${Personlist }">
  		${person.name }
  	</c:forEach>
  	
  	<br>
  	
  	jstl迭代Map
  	<c:forEach items="${personMap }" var="entry" >
  		${entry.key }:${entry.value.name }
  	</c:forEach>
</body>
</html>