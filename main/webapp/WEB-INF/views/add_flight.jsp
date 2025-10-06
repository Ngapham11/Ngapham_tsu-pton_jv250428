<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 10/6/2025
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
<div class="container" style="width: 500px">
    <f:form method="post" modelAttribute="flight" enctype="multipart/form-data">
        <div class="form-group">
            <label >Flight Name</label>
            <f:input path="flight_name" class="form-control" id="exampleInputEmail1" />
           <f:errors path="flight_name" cssClass="error"/>
        </div>
        <div class="form-group">
            <label >Starting</label>
            <f:input path="starting_point" class="form-control" id="exampleInputEmail1" />
            <f:errors path="starting_point" cssClass="error"/>
        </div>
        <div class="form-group">
            <label >Destination</label>
            <f:input path="destination" class="form-control" id="exampleInputEmail1" />
            <f:errors path="destination" cssClass="error"/>
        </div>
        <div class="form-group">
            <label >Departure Date</label>
            <f:input path="departure_date" class="form-control" type="date" />
            <f:errors path="departure_date" cssClass="error"/>
        </div>
        <div class="form-group">
            <label >Travel Time</label>
            <f:input path="travel_time" class="form-control" type="number" />
            <f:errors path="travel_time" cssClass="error"/>
        </div>
        <div class="form-group">
            <label >Travel Unit</label>
            <f:input path="time_unit" class="form-control" id="exampleInputEmail1" />
            <f:errors path="time_unit" cssClass="error"/>
        </div>
        <div class="form-group">
            <label >Travel Image</label>
            <f:input path="travel_image" class="form-control" id="exampleInputEmail1" />
            <f:errors path="travel_image" cssClass="error"/>
        </div>
        <div class="form-group">
            <label >Status</label>
            <f:radiobutton path="status" value="true"/>Đang Thực Hiện
            <f:radiobutton path="status" value="false"/>Đã Hủy bỏ
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </f:form>
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
