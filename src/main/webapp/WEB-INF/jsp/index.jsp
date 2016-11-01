<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$List of Students</title>
</head>
<body>
<br>
<form action="/search" method="POST">
<input name="search" placeholder="search" >
<input type="submit" value="search">
<br>
</form>
<table>
  <thead>
  <td>Id</td>
  <td>First name</td>
  <td>Last name</td>
  <td>Sex</td>
  <td>Birth date</td>
  <td>Controls</td>
  </thead>
  <tbody>
  <a href="/add/">Add new student</a>
  <c:forEach items="${list}" var="item">
    <tr>
      <td>${item.id}</td>
      <td>${item.firstName}</td>
      <td>${item.lastName}</td>
      <td>${item.sex}</td>
      <td>${item.birth}</td>
      <td>
        <a href="/student/${item.id}">view/edit</a>
        <a href="/del/${item.id}">delete</a>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>

