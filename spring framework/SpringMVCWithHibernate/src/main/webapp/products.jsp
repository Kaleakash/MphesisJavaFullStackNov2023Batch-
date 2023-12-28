<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Product"%>
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
${requestScope.msg}<br/>
<h2>Product Management System</h2>
<form action="storeProduct" method="post">
<label>PName</label>
<input type="text" name="pname"><br/>
<label>Price</label>
<input type="number" name="price"><br/>
<label>Image URL</label>
<input type="url" name="url"><br/>
<input type="submit" value="Store Product"/>
<input type="reset" value="reset"/>
</form>
<hr/>
<table border="1">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
		<th>Image URL</th>
	</tr>
	<%
	Object obj = session.getAttribute("products");
	List<Product> list = (List<Product>)obj;
	Iterator<Product> ii = list.iterator();
	while(ii.hasNext()){
		Product p = ii.next();
		%>
		<tr>
			<td><%=p.getPid()%> </td>
			<td><%=p.getPname()%> </td>
			<td><%=p.getPrice()%> </td>
			<td><img src=<%=p.getUrl()%> width="100px" height="100px"/></td>
		</tr>
		<% 
	}
	%>
</table>
</body>
</html>