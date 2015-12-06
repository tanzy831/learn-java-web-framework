<%--
  Created by IntelliJ IDEA.
  User: tanzy
  Date: 11/18/2015
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>Customer management</title>
</head>

<body>
    <h1>Customer list</h1>

    <table>
        <tr>
            <th>Name</th>
            <th>Contact</th>
            <th>Telephone</th>
            <th>Email</th>
            <th>Operation</th>
        </tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td>${customer.name}</td>
                <td>${customer.contact}</td>
                <td>${customer.telephone}</td>
                <td>${customer.email}</td>
                <td>
                    <a herf="${BASE}/customer_edit?id=${customer.id}">Edit</a>
                    <a herf="${BASE}/customer_delete?id=${customer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
