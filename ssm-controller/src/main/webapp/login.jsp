<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<font style="color:red">${message }</font><br>
	<form action="login" method="post">
		<input type="text" name="userName" placeholder="请输入用户名"><br>
		<input type="text" name="password" placeholder="请输入密码"><br>
		<input type="submit" value="登录" />
	</form>
</body>
</html>