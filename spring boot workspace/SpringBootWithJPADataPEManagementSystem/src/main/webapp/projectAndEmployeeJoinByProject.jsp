<%@page import="com.pems.entity.Employees"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.pems.entity.Project"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>All Project details!</h3>
<table border="1">
	<tr>
		<th>Project Name</th>
		<th>Employee Name</th>
	</tr>
	<%
		Object obj = request.getAttribute("projectemployeesinfobyproject");
		List<Object[]> listOfProject = (List<Object[]>)obj;
		Iterator<Object[]> li = listOfProject.iterator();
		while(li.hasNext()){
				Object row[]=li.next();
			%>
			<tr>
				<td><%=row[0]%></td>
				<td><%=row[1] %></td>
			</tr>
			<%
		
		}
	%>
</table>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>