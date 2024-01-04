<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Search project details</h2>
<form action="ProjectAndEmployeeJoinByProjectName" method="get">
<label>Project Name</label>
<input type="search" name="projectname"/><br/>
<input type="submit" value="Search Project Info"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>