<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="std" class="web_basic.jsp_ch07.Student" scope="page"></jsp:useBean>
<jsp:setProperty name="std" property="stdNo" param="stdNo"/>
<jsp:setProperty name="std" property="stdName" param="stdName"/>
<jsp:setProperty name="std" property="kor" param="kor"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavaBean Test</title>
</head>
<body>
	<b>자바빈 사용 예제</b>
	<h3><%=std.getStdNo() %></h3>
	<h3><%=std.getStdName() %></h3>
	<h3><%=std.getKor() %></h3>
</body>
</html>