<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" />
<div class="container">
<c:choose>
<c:when test="${!empty empsData}">
<!--  <table border="1" bgcolor="cyan" align="center"> -->
   <!--  <table border="1" class="table table-hover"> --> 
<!--  <table border="1" class="table table-striped"> -->
<table border="1" class="table"> 
<tr class="table-danger">
	<th>EmpNo</th>
	<th>EmpName</th>
	<th>Job</th>
	<th>Salary</th>
	<th>Operations</th>
</tr>
<c:forEach var="emp" items="${empsData}">
<tr class = "table-success">
	<td>${emp.empno }</td>
	<td>${emp.ename }</td>
	<td>${emp.job }</td>
	<td>${emp.salary }</td>
<td><a href="edit?no=${emp.empno}">
<img src="images/edit.jpg" width="50" height="50"/></a> 


<a onclick="return confirm ('Do you want to delete')"
href="delete?no=${emp.empno}">
<img src="images/delete.png" width="50" height="50"/></a></td>
</tr>
</c:forEach>
</table>
</c:when>
	<c:otherwise>
		<h1 style="color:red;text-align:center">Records not found</h1>
	</c:otherwise>
</c:choose>

<br><br>
<hr>
<h1 style="text-align:center"><a href="add"><img alt="image not found" src="images/add.png" width="50" height="50">Add Employee</a></h1>
<c:if test="${!empty resultMsg}">
<h3 style="color:green;text-align:center">${resultMsg }</h3>
</c:if>
</div>