
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Products</h1>
	<jsp:include page="menu.jsp" />
	<hr />
	<table align="center" cellpadding="5" cellspacing="5">

		<tr bgcolor="skyblue">
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Price</th>
		</tr>


		<c:forEach var="prod" items="${prods}">

			<tr bgcolor="silver">
				<td>${prod.prodId}</td>
				<td>${prod.prodName}</td>
				<td>${prod.price}</td>
			</tr>

		</c:forEach>



	</table>



</body>
</html>