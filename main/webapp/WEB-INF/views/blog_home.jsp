<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 10/4/2025
  Time: 7:45 PM
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
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>STT</th>
            <th>Ten tac gia</th>
            <th>Bai viet</th>
            <th>Ngay tao</th>
            <th>Tieu de</th>
            <th>Status</th>
            <td>Anh</td>
            <th>Hanh dong</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${blogs}" var="blog" >
        <tr>
            <td scope="row">${blog.id}</td>
            <td>${blog.author}</td>
            <td>${blog.content}</td>
            <td>${blog.createdDate}</td>
            <td>${blog.title}</td>
            <td>${blog.status}</td>
            <td><img src="${blog.avatar}" width="100px"></td>
            <td>
                <a class="btn btn-primary" href="/blog_home/update/${blog.id}">Sua</a>
                <a class="btn btn-primary" href="/blog_home/edit/${blog.id}">Xoa</a>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <c:if test="${page>1}">
                <li class="page-item ">
                    <a class="page-link" href="?page=${page-1}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                        <span class="sr-only">Previous</span>
                    </a>
                </li>
            </c:if>

            <c:forEach begin="1" end="${totalPage}" var="i">
            <li class="page-item ${(page==i?"active":"")}"><a class="page-link" href="?page=${i}">${i}</a></li>
            </c:forEach>
            <c:if test="${page<totalPage}">
                <li class="page-item">
                    <a class="page-link" href="?page=${page+1}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                        <span class="sr-only">Next</span>
                    </a>
                </li>
            </c:if>

        </ul>
    </nav>
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
