<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Product</h2>
<form action="ProductController" method="post">
	<input type="hidden" name="operation" value="add">
<label>PName</label>
<input type="text" name="pname"/><br/>
<label>Price</label>
<input type="number" name="price"/><br/>
<label>URL</label>
<input type="url" name="url"/><br/>
<input type="submit" value="Store Product"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>