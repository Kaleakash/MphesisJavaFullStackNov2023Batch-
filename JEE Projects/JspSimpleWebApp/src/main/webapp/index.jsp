<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Simple HTML Page</h2>
<%!int a,b,sum; %>
<%
a=100;
b=200;
sum = a+b;
System.out.println("Welcome to JSP on console");
out.println("Welcome to JSP on browser<br/>");
out.println("Sum of two number is "+sum);
out.println("<br/><font color=red> Sum of two number is "+sum+"</font>");
%>
<p>Sum of two number is <%=10+20 %></p>
<font color="orange">Sum of <%=a %> and <%=b %> is <%=sum %></font>
<br/>
<a href="login.jsp">Login Page</a>
</body>
</html>