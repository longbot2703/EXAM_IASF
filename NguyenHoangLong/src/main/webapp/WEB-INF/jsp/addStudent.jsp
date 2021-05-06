<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en" xmlns:th="http://www.springframework.org/schema/data/jaxb">
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <link type="text/css" rel="stylesheet" href="bootstrap.min.css" th:href="@{bootstrap.min.css}"/>
</head>
<body>
<div class="col-3"></div>
<div class="container col-6">
    <h1>New Student</h1>
    <div class="col-md-auto">
        <form th:object="${student}" th:action="@{save}" action="#" method="post">
            <div>
                <label th:text="Name" th:for="name"></label>
                <input type="text" th:field="*{name}" class="form-control" placeholder="Name"/>
            </div>
            <div style="clear: both; display: block; height: 10px"></div>
            <div>
                <label th:text="Student ID" th:for="studentid"></label>
                <input type="text" th:field="*{studentid}" class="form-control" placeholder="Student ID"/>
            </div>
            <div style="clear: both; display: block; height: 10px"></div>
            <div>
                <label th:text="Sex" th:for="sex"></label>
                <input type="text" th:field="*{sex}" class="form-control" placeholder="Sex"/>
            </div>
            <div style="clear: both; display: block; height: 10px"></div>
            <div>
                <label th:text="Phone" th:for="phone"></label>
                <input type="text" th:field="*{phone}" class="form-control" placeholder="Phone"/>
            </div>
            <div style="clear: both; display: block; height: 10px"></div>
            <div>
                <label th:text="Birthday" th:for="birthday"></label>
                <input type="text" th:field="*{birthday}" class="form-control" placeholder="Birthday"/>
            </div>
            <div style="clear: both; display: block; height: 10px"></div>
            <div>
                <label th:text="City" th:for="city"></label>
                <input type="text" th:field="*{city}" class="form-control" placeholder="City"/>
            </div>
            <div style="clear: both; display: block; height: 10px"></div>
            <input type="submit" class="btn btn-success" value="Save"/>
        </form>
    </div>
</div>
</body>
</html>