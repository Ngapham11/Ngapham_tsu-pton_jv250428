<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 06/09/2025
  Time: 2:15 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chuyen doi ngoai te</title>
    <style>
        div{
            background-color: cornflowerblue;
            width: 300px;
            border:2px solid blueviolet;
            padding: 20px;
            margin: auto;
        }
        input{
            padding: 20px;

            width: calc(100% - 10px );

        }
        button{
            padding: 20px;
            width: calc(100% - 10px );
           margin-top: 10px;
        }
        button:hover{
            background-color: blue;
        }
    </style>
</head>
<body>
<h1>Chuyen doi ngoai te</h1>
<div>
    <form action="Rate_04" method="post">
        RATE:<input type="text" name="rate">
        <br>
        USD:<input type="text" name="usd">
        <br>
        <button type="submit" >Convert</button>
    </form>
</div>


</body>
</html>
