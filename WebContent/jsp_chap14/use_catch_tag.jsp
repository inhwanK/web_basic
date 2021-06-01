<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	name 파라미터 값 = <%=request.getParameter("name") %><br>
	<c:catch var="e">
		<% if(request.getParameter("name").equals("test")){ %>
			name 파라미터 값은 test<br>
		<%} %>
	</c:catch>
		${e}
	<c:if test="${e == null }">
	익셉션이 발생 <br>
	${e}
	</c:if>
</body>
</html>