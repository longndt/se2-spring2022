<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 17/12/2021
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="tp" items="${city}">
        <h3>${tp}</h3>
    </c:forEach>
    <br>
    <%
        int i = 1;
    %>
    <table>
        <thead>
            <tr>
                <th>No.</th>
                <th>Name</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="s" items="${sports}">
            <tr>
                <td><%= i %></td>
                <td>${s}</td>
            </tr>
            <% i++; %>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
