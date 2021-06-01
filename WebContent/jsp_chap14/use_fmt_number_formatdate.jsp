<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> numberformat formatDate</title>
</head>
<body>

 <c:set var="price" value="10000" />	

 	<fmt:formatNumber value="${price}" type="number"/><br>
	<fmt:formatNumber value="${price}" type="currency" currencySymbol="원"/>
	<br>
	<fmt:formatNumber value="${price }" type="percent" groupingUsed="false"/>
	<br>
	<fmt:formatNumber value="${price }" pattern="0000000.00"/><br>
	<fmt:formatNumber value="${price }" pattern="#.00"/><br>
	<fmt:formatNumber value="${price }" pattern="\ #,###.00 원"/><br>

	<h3>문자를 숫자로 변환</h3>
	<c:set var="strPrice" value="100000"/>
	<fmt:parseNumber value="${strPrice}"/><br>
	<fmt:parseNumber value="1000_00"/><br>qu
	
	<h3>날짜</h3>
	<c:set var="now" value="<%=new Date()%>" />
	<fmt:formatDate value="${now}" type="date" dateStyle="full"/><br>
	<fmt:formatDate value="${now }" type="date" dateStyle="short"/><br>
	<fmt:formatDate value="${now }" type="time"/><br>
	<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/><br>
	<fmt:formatDate value="${now }" type="both" pattern="z ah:mm"/><br>
	<fmt:formatDate value="${now }" type="both" pattern="yyyy-MM-dd a h:mm"/><br>


</body>
</html>