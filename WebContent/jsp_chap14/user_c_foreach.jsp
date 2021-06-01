<%@page import="java.util.Date"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	Map<String, Object> mapDate = new HashMap<>();
	mapDate.put("name", "김상건");
	mapDate.put("name", new Date());
%>
<c:set var="intArray" value="<%=new Integer[]{1,2,3,4,5} %>"/>
<c:set var="map" value="<%=mapDate %>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>1부터 100까지의 짝수합 </h4>
	<c:set var="sum" value="0"/>
	<c:forEach var="i" begin="0" end="100" step="2">
		<c:set var="sum"> ${sum+i}</c:set>
	
	</c:forEach>
	결과 = ${sum}
	<h4>구구단 4단</h4>
		<c:forEach var="i" begin="1" end="9">
			${4*i}<br>
		</c:forEach>
	<hr>
	<c:set var="intArray" value="<%=new Integer[]{1,2,3,4,5} %>"/>
	<h4>int형 배열</h4>
	<c:forEach var="i" items="${intArray}" begin="0" end="4" varStatus="status">
		${status.index} - ${status.count} - ${i } <br>
	</c:forEach>
	<hr>
	<%
	Map<String, Object> mapDate1 = new HashMap<>();
	
	mapDate1.put("name", new Date());
	mapDate1.put("name", "김상건");
%>
	<c:set var="map" value="<%=mapDate1 %>"/>
	<c:forEach var="i" items="${map}">
		${i.key} =${i.value}<br>
	</c:forEach>
	
	
</body>
</html>