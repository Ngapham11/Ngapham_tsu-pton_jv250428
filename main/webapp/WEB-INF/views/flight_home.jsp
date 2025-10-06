<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 10/6/2025
  Time: 9:35 PM
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
    <h1 style="text-align: center">DANH SÁCH CHUYẾN BAY</h1>
    <form class="form-inline" method="get">
        <div class="form-group">
            <input type="text" name="searchFlightName" class="form-control" ><br>
            <button type="submit" class="btn btn-primary" >Tim Kiem</button>
        </div>
    </form>
    <a  class="btn btn-primary" href="/add" role="button">Thêm Chuyến Bay</a>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Flight Name</th>
            <th>Starting</th>
            <th>Destination</th>
            <th>Departure Date</th>
            <th>Travel Time</th>
            <th>Time Unit</th>
            <th>Travel Image</th>
            <th>Status</th>
            <th>Edit</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${flights}" var="flight" >
        <tr>
            <td scope="row">${flight.id}</td>
            <td>${flight.flight_name}</td>
            <td>${flight.starting_point}</td>
            <td>${flight.destination}</td>
            <td>${flight.departure_date}</td>
            <td>${flight.travel_time}</td>
            <td>${flight.time_unit}</td>
            <td><img src="${flight.travel_image}" width="150px" alt=""></td>
            <td>${flight.status}</td>
            <td>
                <a  class="btn btn-primary" href="/edit/${flight.id}" >Edit</a>

            </td>

        </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li class="page-item disabled">
                <a class="page-link" href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                    <span class="sr-only">Previous</span>
                </a>
            </li>
            <c:forEach begin="1" end="${totalPage}" var="i">
                <li class="page-item ${(page==i?"active":"")}"><a class="page-link" href="?page=${i}">${i}</a></li>
            </c:forEach>
            <li class="page-item">
                <a class="page-link" href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                    <span class="sr-only">Next</span>
                </a>
            </li>
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
