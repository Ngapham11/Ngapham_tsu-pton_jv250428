<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 07/09/2025
  Time: 12:48 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Tinh toan</title>
</head>
<body>
<div>
    <form action="ss2_03Servlet" method="post">
       <label>May Tinh Don Gian</label><br>
        <label>So thu nhat:</label>
      <input type="text" name="firstNumber"><br>
        <label> So thu hai:</label>
       <input type="text" name="secondNumber"><br>
        <label>Phep tinh</label>
        <select name="calculation">
           <option value="sub">Cong</option>
           <option value="diff">Tru</option>
           <option value="product">Nhan</option>
           <option value="quotient">Chia</option>
    </select><br>
        <input type="submit" value="Tinh toan">
    </form>
</div>

</body>
</html>
