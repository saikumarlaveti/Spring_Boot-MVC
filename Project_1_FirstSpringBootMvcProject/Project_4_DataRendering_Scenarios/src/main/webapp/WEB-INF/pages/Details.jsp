<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Details</title>
</head>
<body>

    <b>Model data (Array, Collection) is:</b>

    <br><br>

    <b>Favourite Colors (Array):</b>
    <c:if test="${!empty favColors}">
        <c:forEach var="color" items="${favColors}">
            ${color},
        </c:forEach>
    </c:if>

    <br>

    <b>Nicknames (List Collection):</b>
    <c:if test="${!empty nickNames}">
        <c:forEach var="name" items="${nickNames}">
            ${name},
        </c:forEach>
    </c:if>

    <br>

    <b>Phone Numbers (Set Collection):</b>
    <c:if test="${!empty phoneNumbers}">
        <c:forEach var="phone" items="${phoneNumbers}">
            ${phone},
        </c:forEach>
    </c:if>

    <br>

    <b>ID Details (Map Collection - Accessing Specific Keys):</b>
    <c:if test="${!empty idDetails}">
        ${idDetails.aadhar}, ${idDetails.voterId}
    </c:if>

    <br>

    <b>ID Details (Map Collection - Keys & Values):</b>
    <c:if test="${!empty idDetails}">
        <c:forEach var="id" items="${idDetails}">
            ${id.key} <--> ${id.value} <br>
        </c:forEach>
    </c:if>

</body>
</html>
