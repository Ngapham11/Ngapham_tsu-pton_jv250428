<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 12/09/2025
  Time: 12:16 SA
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 10/09/2025
  Time: 9:48 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<div class="container mt-3">
    <a class="btn btn-success text-white" href="?action=create">Them moi du an</a>
    <h3 class="text-center">Danh sach du an</h3>
    <table class="table">
        <thead>
        <tr class="bg-primary text-white">
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>image</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${projects}" var="project">
            <tr>
                <td scope="row">${project.id}</td>
                <td>${project.name}</td>
                <td>${project.description}</td>
                <td>
                    <img width="100px" height="120px"  src="${project.image}">
                </td>
                <td>
                    <a class="btn btn-primary" href="<%=request.getContextPath()%>/project?action=update&id=${project.id}" role="button">Sua</a>
                    <a class="btn btn-danger" href="<%=request.getContextPath()%>/project?action=delete&id=${project.id}" onclick="return confirm('Bạn có chắc chắn muốn xóa thông tin này không?')" role="button">Xoa</a>
                </td>
            </tr>
        </c:forEach>
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

