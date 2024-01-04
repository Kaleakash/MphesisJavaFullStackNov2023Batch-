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
<h3>All Employees details!</h3>
<table border="1">
	<tr>
		<th>Employee Id</th>
		<th>Name</th>
		<th>Age</th>
		<th>Project Id</th>
	</tr>
	<%
		Object obj = request.getAttribute("employees");
		List<Employees> listOfEmployees = (List<Employees>)obj;
		Iterator<Employees> li = listOfEmployees.iterator();
		while(li.hasNext()){
				Employees e = li.next();		
			%>
			<tr>
				<td><%=e.getId()%></td>
				<td><%=e.getName()%></td>
				<td><%=e.getAge()%></td>
				<td><%=e.getPid() %></td>
			</tr>
			<%
		}
	%>
</table>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>