<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		application.setAttribute("name",name);
		String appname = (String)application.getAttribute("name");
		
		System.out.println(name);
		System.out.println(appname);
	%>
	<h3><%=name %><br> <%=appname%></h3>
</body>
</html>