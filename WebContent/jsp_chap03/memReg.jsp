<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<style type="text/css">
	#loginFormArea{
		text-align :center;
		width : 250px;
		margin : auto;
		border : 1px solid red
	}
	h1 {
		text-align :center;
	}
</style>
</head>
<body>
	<form action ="MemReg" method = "post">
		회원명 : <input type="text" name="name"><br>
		주소 : <input type ="text" name = "addr"><br>
		전화번호 : <input type ="text" name = "tel"><br>
		취미 : <input type ="text" name="hobby"><br>
		<input type="submit" value="회원가입"/>
	</form>
</body>
</html>