<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
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

		<c:forEach var="product" items="${products}">
			<tr bgcolor="silver">
				<td>${product.prodId }</td>
				<td>${product.prodName }</td>
				<td>${product.price }</td>
			</tr>
		</c:forEach>


	</table>









</body>
</html>