<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
  <c:when test="${not empty jsList}">
    <table border="1" align="center" bgcolor="cyan">
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Address</th>
        <th>Resume</th>
        <th>Photo</th>
      </tr>
      
      <c:forEach var="info" items="${jsList}">
        <tr>
          <td>${info.id}</td>
          <td>${info.name}</td>
          <td>${info.address}</td>
          <td><a href="download?id=${info.id}&type=resume">Download Resume</a></td>
          <td><a href="download?id=${info.id}&type=photo">Download Photo</a></td>
        </tr>
      </c:forEach>
    </table>
  </c:when>
  <c:otherwise>
    <h1 style="color:red; text-align:center;">NO JOB SEEKER FOUND</h1>
  </c:otherwise>
</c:choose>
