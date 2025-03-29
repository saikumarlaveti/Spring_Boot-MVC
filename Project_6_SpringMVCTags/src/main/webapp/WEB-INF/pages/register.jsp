<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color:red;text-align:center"> student registration page</h1>

<form:form method = "POST" modelAttribute="std">
<table align="center" bgcolor="cyan"></table>
<tr>
<td>student id</td>
<td><form:input path="id"/></td>
</tr>

<tr>
<td>student name</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td>student age</td>
<td><form:input path="age"/></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="Register"></td>
</tr>
</table>
</form:form>