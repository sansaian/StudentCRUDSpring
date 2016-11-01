<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>
<form action="/student/${student.id}" method="POST">
    <label>First name</label>
    <input name="firstName" placeholder="firstName" value="${student.firstName}">
    <br>
    <label>Last name</label>
    <input name="lastName" placeholder="lastName" value="${student.lastName}">
    <br>
    <label>Sex</label>
    <select name="sex">
        <option value="m" <c:if test="${student.sex == 'male'}">selected="selected"</c:if> >male</option>
        <option value="f" <c:if test="${student.sex == 'female'}">selected="selected"</c:if> >female</option>
    </select>
    <br>
    <input name="birth" placeholder="dd-mm-yyyy" value="${student.birth}"><br>
    <input type="submit" value="Update">
    <br><a href="/">Back to list</a><br>
</form>
</body>
</html>
