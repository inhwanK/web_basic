<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>썸네일 이미지 폼</title>
</head>
<body>
	<form action="thumbnail" method="post" enctype="multipart/form-data">
	이미지 파일 : <input type="file" name="filename"><p>
	<input type="submit" value="전송">
	</form>
</body>
</html>