<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 연산자 사용 예제</title>
</head>
<body>
	<h3>\${5+7} = ${5+7}</h3>
	<h3>\${5-7} = ${5-7}</h3>
	<h3>\${5==7} = ${5==7}</h3>
	<h3>\${5 eq 7} = ${5 eq 7}</h3>
	<h3>\${5!=7} = ${5!=7}</h3>
	<h3>\${5 ne 7} = ${5 ne 7}</h3>
	<h3>\${5>7} = ${5>7}</h3>
	<h3>\${5<7} = ${5<7}</h3>
	<h3>\${5*7} = ${5*7}</h3>
	<h3>\${5+7==8 ? 8 : 10} = ${5+7==8?8:10}</h3>
	<%=5 %>
</body>
</html>