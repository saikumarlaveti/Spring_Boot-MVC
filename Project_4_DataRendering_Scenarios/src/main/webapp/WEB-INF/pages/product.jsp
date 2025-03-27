<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
</head>
<body>
<c:if test="${!empty Pro1}">
	productId :: ${Pro1.id }<br>
	productName :: ${Pro1.name }<br>
	productPrice :: ${Pro1.price }<br>
	productCompany :: ${Pro1.company }<br>
</c:if>

</body>
</html>