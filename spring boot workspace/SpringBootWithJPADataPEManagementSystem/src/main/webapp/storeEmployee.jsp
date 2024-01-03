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
<ul>
	<%
		Object obj = request.getAttribute("projects");
		List<Project> listOfProject = (List<Project>)obj;
		Iterator<Project> li = listOfProject.iterator();
		while(li.hasNext()){
			Project p  = (Project)li.next();
			%>
				<li>PId: <%=p.getPid()%> PName : <%=p.getPname() %></li>
			<%
		}
	%>
</ul>
<hr/>
${requestScope.msg}
<h3>Store Employee</h3>
<form action="storeEmployeeInDb" method="post">
<label>Id</label>
<input type="number" name="id"/><br/>
<label>Name</label>
<input type="text" name="name"/><br/>
<label>Age </label>
<input type="text" name="age"/><br/>
<label>Project Id</label>
<input type="number" name="pid"/><br/>
<input type="submit" value="Store Employee"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>