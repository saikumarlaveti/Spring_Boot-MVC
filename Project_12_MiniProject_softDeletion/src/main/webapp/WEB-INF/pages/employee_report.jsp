<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" />
<div class="container">
<c:choose>
<c:when test="${!empty empsData.getContent()}">

<table border="1" class="table"> 
<tr class="table-danger">
	<th>EmpNo</th>
	<th>EmpName</th>
	<th>Job</th>
	<th>Salary</th>
	<th>Operations</th>
</tr>
<c:forEach var="emp" items="${empsData.getContent()}">
<tr class="table-success">
	<td>${emp.empno }</td>
	<td>${emp.ename }</td>
	<td>${emp.job }</td>
	<td>${emp.salary }</td>
	<td>
        <a href="edit?no=${emp.empno}">
            <img src="images/edit.jpg" width="50" height="50"/>
        </a> 
        <a onclick="return confirm ('Do you want to delete')" href="delete?no=${emp.empno}">
            <img src="images/delete.png" width="50" height="50"/>
        </a>
    </td>
</tr>
</c:forEach>
</table>

<!-- Pagination -->
<p style="text-align:center">

<!-- First Page Link -->
<c:if test="${empsData.getPageable().pageNumber > 0}">
    <a href="report?page=0">First</a> |
</c:if>

<!-- Previous Page Link -->
<c:if test="${empsData.hasPrevious()}">
    <a href="report?page=${empsData.getPageable().pageNumber - 1}">Previous</a> |
</c:if>

<!-- Page Numbers -->
<c:forEach var="i" begin="1" end="${empsData.getTotalPages()}" step="1">
    <c:choose>
        <c:when test="${empsData.getPageable().pageNumber + 1 == i}">
            <strong>${i}</strong>
        </c:when>
        <c:otherwise>
            <a href="report?page=${i-1}">${i}</a>
        </c:otherwise>
    </c:choose>
    |
</c:forEach>

<!-- Next Page Link -->
<c:if test="${empsData.hasNext()}">
    <a href="report?page=${empsData.getPageable().pageNumber + 1}">Next</a> |
</c:if>

<!-- Last Page Link -->
<c:if test="${empsData.getPageable().pageNumber < empsData.getTotalPages() - 1}">
    <a href="report?page=${empsData.getTotalPages() - 1}">Last</a>
</c:if>

</p>

</c:when>
<c:otherwise>
    <h1 style="color:red;text-align:center">Records not found</h1>
</c:otherwise>
</c:choose>

<br><br>
<hr>
<h1 style="text-align:center">
    <a href="add">
        <img alt="image not found" src="images/add.png" width="50" height="50"> Add Employee
    </a>
</h1>
<c:if test="${!empty resultMsg}">
    <h3 style="color:green;text-align:center">${resultMsg }</h3>
</c:if>
</div>
