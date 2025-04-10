<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<h1 style="color:red;text-align:center">Politician Registration</h1>
<form:form method="POST" modelAttribute="pp">
<table border="0" bgcolor="blue" align="center">

<tr>
<td>Politician Id :</td>
<td><form:input path="pid"/></td>
</tr>

<tr>
<td>Politician Name :</td>
<td><form:input path="pname"/></td>
</tr>

<tr>
<td>Politician Party :</td>
<td><form:input path="party"/></td>
</tr>

<tr>
<td>Date Of Birth :</td>
<td><form:input path="dob" type="date"/></td>
</tr>

<tr>
<td>Year :</td>
<td><form:input path="year" type="date"/></td>
</tr>

<tr>
<td>is Married ? :  </td>
<td>
<form:radiobutton path="married" value="true"/> Yes
<form:radiobutton path="married" value="false"/>No
</td>
</tr>
<tr>
	<td colspan="2"> <input type="submit" value="register"></td>
</tr>
</table>
</form:form>