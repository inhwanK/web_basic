<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
	<c:set var="con" value="${JndiDS.getConnection()}" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/erp_style.css">
<meta charset="UTF-8">
<title>데이터 베이스 연동 테스트</title>
</head>
<body>
	<c:out value="${con }"/>
	<fieldset>
	<legend>ERP</legend>
	<ul>
		<li><a href="TitleServlet">직책 관리</a></li>
		<li><a href="DepartmentServlet">부서 관리</a></li>
		<li><a href="EmployeeServlet">직원 관리</a></li>		
	</ul>
	</fieldset>
</body>
</html>