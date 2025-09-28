<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 9/28/2025
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        h2 {
            color: #333;
            text-align: center;
            margin-bottom: 20px;
        }
        form {
            width: 500px; /* Chiều rộng form 500px */
            margin: 0 auto;
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
        }
        div {
            margin-bottom: 25px;
        }
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 8px;
            color: #555;
        }
        .form-control {
            width: 100%;
            padding: 12px; /* Tăng padding cho input */
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box; /* Đảm bảo padding không làm tăng chiều rộng */
            font-size: 14px; /* Kích thước chữ lớn hơn */
        }
        input[type="radio"] {
            width: auto; /* Đặt chiều rộng của radio button */
            margin-right: 5px;
            display: inline-block; /* Hiển thị inline */
        }
        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 12px 15px;
            border-radius: 5px;
            cursor: pointer;
            width: 100%; /* Đặt chiều rộng nút submit 100% */
            font-size: 16px; /* Kích thước chữ lớn hơn */
            transition: background-color 0.3s ease; /* Hiệu ứng chuyển đổi */
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .error {
            color: red;
            font-size: 0.9em;
            margin-top: 5px;
        }
    </style>
</head>
<body>
<div class="container" >
    <h1 style="text-align: center">Them moi hoc sinh</h1>
    <form:form method="post" style="width: 500px" modelAttribute="student">
        <div >
            <label for="name">Ten sinh vien</label>
            <form:input path="name" cssClass="form-control"/>
          <form:errors path="name" cssClass="error"/>
        </div>
        <div >
            <form:label path="email" >Email</form:label>
            <form:input path="email" cssClass="form-control"/>
            <form:errors path="email" cssClass="error"/>
        </div>
        <div >
            <form:label path="ageMark" >Diem so</form:label>
            <form:input path="ageMark" type="number" cssClass="form-control"/>
            <form:errors path="ageMark" cssClass="error"/>
        </div>
        <div>
            <form:label path="studying">Tinh trang</form:label>
            <div>
                <form:radiobutton path="studying" value="true" />Dang hoc
                <form:radiobutton path="studying" value="false"/>Da nghi
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Them moi</button>
    </form:form>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->

</body>
</html>