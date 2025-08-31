<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor=cyan>
<form action="AddToCartServlet" method="post">
<select name="product">
<option value="Laptop">Laptop</option>
<option value="Mobile">Mobile</option>
<option value="Speaker">Speaker</option>
</select>
<input type="submit" value="Add to Cart">

</form>
<a href="ViewCartServlet">View Cart</a>

</body>
</html>