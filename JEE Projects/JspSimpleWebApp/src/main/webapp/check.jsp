<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*;"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String emailid,password; %>
<%
emailid = request.getParameter("emailid");
password = request.getParameter("password");
//RequestDispatcher rd1 = request.getRequestDispatcher("home.jsp");
//RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");

// JDBC Code 
if(emailid.equals("akash@gmail.com") && password.equals("akash@123")){
	out.println("Successfully login");
	//rd1.forward(request, response);
	%>
		<jsp:forward page="home.jsp"></jsp:forward>
	<%
}else {
	out.println("failure try once again");
	//rd2.include(request, response);
			%>
			<jsp:include page="login.jsp"></jsp:include>
			<%
}
response.setContentType("text/html");
%>


</body>
</html>