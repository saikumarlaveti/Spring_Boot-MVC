<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
    <c:when test="${!empty products}">
        <table align="center" bgcolor="cyan" border="1">
            <tr>
                <th>PID</th> <th>PNAME</th> <th>PRICE</th> <th>QTY</th>
            </tr>
            <c:forEach var="products" items="${products}">
                <tr>
                    <td>${products.id}</td>
                    <td>${products.name}</td>
                    <td>${products.price}</td>
                    <td>${products.company}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1 style="color:red;text-align:center;">No Records found</h1>
    </c:otherwise>
</c:choose>
