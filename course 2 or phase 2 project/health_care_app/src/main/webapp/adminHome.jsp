<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Object obj = session.getAttribute("admin");
if(obj==null){
	response.sendRedirect("login.jsp");
}else {
	%>
	<h2>Welcome to Admin Homme Page</h2>
	
	<%
}
%>

</body>
</html>