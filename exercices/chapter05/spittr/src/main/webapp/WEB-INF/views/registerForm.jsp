<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spitter</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
</head>
<body>
	<h1>Register</h1>
	
	<form method="post">
		First Name: <input type="text" name="firstName" ><br>
		Last Name: <input type="text" name="lastName" ><br>
		Email: <input type="email" name="email" ><br>
		Username: <input type="text" name="username" ><br>
		Password: <input type="password" name="password" ><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>