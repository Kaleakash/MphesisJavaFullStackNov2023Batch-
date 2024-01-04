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
		<th>PId</th>
		<th>ProjectName</th>
		<th>Employee Id</th>
		<th>Name</th>
		<th>Age</th>
	</tr>
	<%
		Object obj = request.getAttribute("projects");
		List<Project> listOfProject = (List<Project>)obj;
		Iterator<Project> li = listOfProject.iterator();
		while(li.hasNext()){
			Project p  = (Project)li.next();
				List<Employees> emps = p.getListOfEmployees();
				Iterator<Employees> li1 = emps.iterator();
				while(li1.hasNext()){
				Employees e = li1.next();		
			%>
			<tr>
				<td><%=p.getPid()%></td>
				<td><%=p.getPname() %></td>
				<td><%=e.getId()%></td>
				<td><%=e.getName()%></td>
				<td><%=e.getAge()%></td>
			</tr>
			<%
			}
		}
	%>
</table>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>