<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 06/09/2025
  Time: 10:58 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Tuoi cua ban la :${age}</h1>
<c:if test="${age<12}"><h1>Ban la tre em</h1></c:if>
<c:if test="${age>=12 and age<18}"><h1>Ban la thieu nien</h1></c:if>
<c:if test="${age>=18}"><h1>Ban la nguoi truong thanh</h1></c:if>
</body>
</html>
