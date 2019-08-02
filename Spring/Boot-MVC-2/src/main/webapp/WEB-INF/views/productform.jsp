<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Product Form</h1>

<jsp:include page="menu.jsp"/> <br/>
 <hr/>


	<form action="saveProduct_v2" method="post">

		<table align="center">

			<tr>
				<td>Product Id</td>
				<td><input type="text" name="prodId">
			</tr>

			<tr>
				<td>Product Name</td>
				<td><input type="text" name="prodName">
			</tr>

			<tr>
				<td>Price</td>
				<td><input type="text" name="price">
			</tr>

			<tr>
				<th colspan="2">
				<input type="submit" value="Save"> <input
					type="reset" value="Clear All">
				</th>
			</tr>

		</table>
	</form>


</body>
</html>