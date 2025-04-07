<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<style media ="all">
body{
background-color:pink;
}
span{
color:red;}
</style>
<script language = "JavaScript" src="js/validataions.js">
</script>
<h1 style="color:red;text-align:center">Employee Employee</h1>
<form:form modelAttribute="emp"  onsubmit="return validation(this)" >

<table border="1" bgcolor="cyan" align="center">
<tr>
	<td>employee no::</td>
	<td><form:input path="empno" readonly="true"/></td>
</tr>

<tr>
	<td>employee name::</td>
	<td><form:input path="ename" /><span id="enameErr"></span></td>
</tr>

<tr>
	<td>employee job::</td>
	<td><form:input path="job" /><span id="jobErr"></span></td>
</tr>

<tr>
<td>employee salary :: </td>
<td><form:input path="salary"/><span id="salErr"></span></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Edit Employee"/></td>

</tr>

</table>
</form:form>