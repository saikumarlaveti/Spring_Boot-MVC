<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<style media ="all">
body{
background-color:pink;
}
span{
color:red;}
</style>
<script language = "JavaScript" src="js/validataions.js">
</script>
<script language="JavaScript">
function sendReqForStates(frm){
	alert("hello")
	frm.action="statesurl";
	frm.submit();}
</script>
<h1 style="color:red;text-align:center">Register Employee</h1>

<form:form modelAttribute="emp" onsubmit="return validation(this)" name="frm" >
<table border="1" bgcolor="cyan" align="center">
<tr>
    <td>Employee Name:</td>
    <td><form:input path="ename"/><form:errors path="ename"/> <span id="enameErr"></span></td>
</tr>

<tr>
    <td>Employee Job:</td>
    <td><form:input path="job"/><form:errors path="job"/><span id="jobErr"></span></td>
</tr>

<tr>
    <td>Employee Salary:</td>
    <td><form:input path="salary"/><form:errors path="salary"/><span id="salErr"></span></td>
</tr>


<tr>
    <td>Select Country :</td>
    <td><form:select path="country" onchange="sendReqForStates(this.form)">
    	<form:options items="${countryInfo }"/>
    	</form:select>
    </td>
</tr>

<tr>
<td>select state :: </td>
<td><form:select path="state">
<form:options items="${statesInfo }"/>
</form:select>
</td>
</tr>

<tr>


    <td colspan="2" style="text-align:center;">
        <input type="submit" value="Register Employee" class="submit-btn">
    </td>
</tr>

<tr>
    
</tr>

</table>
</form:form>

