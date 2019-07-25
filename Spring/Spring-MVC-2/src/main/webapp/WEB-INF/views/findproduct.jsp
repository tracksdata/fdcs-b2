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

	<h1 align="center">Find Product Page</h1>
	<jsp:include page="menu.jsp" />
	<hr />

	<form:form action="findProduct" method="post" modelAttribute="prods">

		<table align="center">

			<tr>
				<td>Select Product ID</td>
				<td><form:select path="prodId">
						<form:options items="${prods.ids}" />
					</form:select></td>

			</tr>


			<tr>
				<th colspan="2"><input type="submit" value="Find"></th>
			</tr>

		</table>


	</form:form>


    <hr/>
    
    <c:if test="${product ne null }">
     <table align="center" cellpadding="5" cellspacing="5">

		<tr bgcolor="skyblue">
			<th>Product id</th>
			<th>Product name</th>
			<th>Price</th>
		</tr>  
		
		<tr>
			<td> ${product.prodId }</td>
			<td> ${product.prodName }</td>
			<td> ${product.price }</td>
		</tr>  
    
    </table>
    
    </c:if>
    
   
    
    



</body>
</html>