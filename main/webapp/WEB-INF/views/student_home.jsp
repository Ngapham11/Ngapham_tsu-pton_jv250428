<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 9/28/2025
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="container" style="text-align: center">
    <h1>Danh sach sinh vien</h1>
    <a class="btn btn-success" href="/add" role="button">Them moi sinh vien</a>
    <table class="table m-2">
        <thead>
        <tr class="btn-success">
            <th>ID</th>
            <th>TEN</th>
            <th>EMAIL</th>
            <th>DIEM SO</th>
            <th>TINH TRANG</th>
            <th>HANH DONG</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${students}" var="student" varStatus="loop">
        <tr>
            <td scope="row">${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.ageMark}</td>
            <td>${student.studying ?'Dang hoc':'Da nghi'}</td>
            <td>
                <a class="btn btn-primary" href="/update/${student.id}" >Sua</a>
                <a class="btn btn-danger" href="/delete/${student.id}" >Xoa</a>
            </td>

        </tr>
        </c:forEach >
        </tbody>
    </table>
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