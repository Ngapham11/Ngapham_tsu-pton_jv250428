<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 9/19/2025
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sach sinh vien</title>
</head>
<body>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form class="form-inline" method="get">
        <div class="form-group" >
            <label for=""></label>
            <input type="text" name="" id="" class="form-control" >
            <select class="form-control" >
                <option value="DESC">Giam dan</option>
                <option value="ASC">Tang dan</option>
            </select>
            <button type="submit" class="btn btn-primary">Tim kiem</button>
        </div>
    </form>

    <table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Ten</th>
        <th scope="col">Email</th>
        <th scope="col">Ngay sinh</th>
        <th scope="col">Hanh dong</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="student" varStatus="loop">
        <tr>
            <th scope="row">${student.id}</th>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.birthday}</td>
            <td><a class="btn btn-primary" href="/update/${student.id}" role="button">Sua</a>
            <a  class="btn btn-primary" href="/delete/${student.id}" role="button">Xoa</a></td>
        </tr>
    </c:forEach>


    </tbody>
</table>
<a type="submit" class="btn btn-primary"  href="add">Them moi</a>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
