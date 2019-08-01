<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Products List</h1>
	<jsp:include page="menu.jsp" />
	<hr />


	<table align="center" cellpadding="5" cellspacing="5">

		<tr bgcolor="skyblue">
			<th>Product id</th>
			<th>Product name</th>
			<th>Price</th>
	
		</tr>

		
			<tr bgcolor="silver">
				<td>${product.prodId }</td>
				<td>${product.prodName }</td>
				<td>${product.price }</td>
				
			</tr>
		


	</table>









</body>
</html>