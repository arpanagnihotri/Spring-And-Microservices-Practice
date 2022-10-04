<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<font color="red">${errorMessage}</font>
<form method="post">
Id:<input type="number" name="id"/>
Name:<input type="text" name="name"/>
Password:<input type="password" name="password"/>
Salary:<input type="number" name="salary"/>
<input type="submit"/>

</form>
</body>
</html>