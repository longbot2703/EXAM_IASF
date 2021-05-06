<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>Index</h1>

<div class="w3-container">

    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Student ID</th>
            <th>Sex</th>
            <th>Phone</th>
            <th>Birthday</th>
            <th>City</th>
        </tr>
        <c:forEach var="s" items="${students}">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.studentid}</td>
                <td>${s.sex}</td>
                <td>${s.phone}</td>
                <td>${s.birthday}</td>
                <td>${s.city}</td>
            </tr>
        </c:forEach>

    </table>
</div>