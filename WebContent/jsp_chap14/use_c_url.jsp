<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- http://seach.daum.net/search?w=blog&q=공원 -->
	<c:url value="http://search.daum.net/search" var="searchUrl">
		<c:param name="w" value="blog"/>
		<c:param name="q" value="공원"/>
	</c:url>
	
	<hr>
	${searchUrl}
	
	<c:redirect url="${searchUrl}">
	</c:redirect>
	<c:url value="/use_c_url.jsp"/>
	<br>
	<c:url value="./use_c_url.jsp"/>
</body>
</html>