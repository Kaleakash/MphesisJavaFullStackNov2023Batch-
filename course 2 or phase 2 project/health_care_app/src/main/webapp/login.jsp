<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h2>Login Page</h2>
<form action="LoginController" method="post" class="form-group">
<label>EmailId</label>
<input type="email" name="email" class="form-control"><br/>
<label>Password</label>
<input type="password" name="password" class="form-control"><br/>
<input type="submit" value="submit" class="btn btn-success"/>
<input type="reset" value="reset" class="btn btn-info"/>
</form>
</div>
</body>
</html>