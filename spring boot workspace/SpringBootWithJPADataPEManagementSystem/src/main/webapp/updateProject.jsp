<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<h3>Update Project</h3>
<form action="updateProject" method="post">
<label>Project Id</label>
<input type="number" name="pid"/><br/>
<label>Project Name</label>
<input type="text" name="pname"/><br/>
<input type="submit" value="Update Project"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>