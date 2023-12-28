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
<%
Object obj1 = request.getAttribute("flag");
if(obj1!=null){
	boolean res = (boolean)obj1;
	if(res==true){
	Object obj2 = request.getAttribute("product");
	Product p = (Product)obj2;
		%>
		<h2>We are ready to update the product</h2>
	<form action="updateProductFromDb" method="post">
	<label>PId</label>
	<input type="text" name="pname" value="<%=p.getPid()%>" readonly="readonly"><br/>
	<label>PName</label>
	<input type="text" name="pname" value="<%=p.getPname()%>"><br/>
	<label>Price</label>
	<input type="number" name="price" value="<%=p.getPrice()%>"><br/>
	<label>Image URL</label>
	<input type="url" name="url" value="<%=p.getUrl()%>"><br/>
	<input type="submit" value="Update Product"/>
	<input type="reset" value="reset"/>
	</form>
		
		<%
	}
}
%>

<hr/>
<table border="1">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
		<th>Image URL</th>
		<th>Delete Product</th>
		<th>Update Product</th>
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
			<td>
		<a href="deleteProduct?pid=<%=p.getPid()%>">
			<img src="https://cdn-icons-png.flaticon.com/128/6861/6861362.png" 
			
			width="50px" height="50px"/>
				
		</a>
			</td>
			<td>
		<a href="updateProduct?pid=<%=p.getPid()%>">
			<img src="data:image/jpeg;base64,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" 
			
			width="50px" height="50px"/>
				
		</a>
			</td>
		</tr>
		<% 
	}
	%>
</table>
</body>
</html>