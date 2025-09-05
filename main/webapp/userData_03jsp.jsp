<%@ page import="java.util.List" %>
<%@ page import="com.ra.ss01_md3.Customer" %><%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 05/09/2025
  Time: 10:54 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Data</title>
    <style>
       body{
           background-color: cadetblue;
           color: white;
           text-align: center;
       }
       table{
           border:1px solid rebeccapurple;
           border-radius: 8px;
           margin: 10px;
           background-color: blueviolet;
       }
       th,td{
           text-align: center;
           margin: 20px;
           padding: 20px;
       }
    </style>
</head>
<body>
<h1>Customer Data</h1>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>Date</th>
        <th>ADDRESS</th>
        <th>IMAGE</th>
    </tr>
    <%
        List<Customer>customers= (List<Customer>) request.getAttribute("customers");
        if (customers!=null){
            int index=1;
            for (Customer customer : customers) {
    %>
    <tr>
        <td><%= index++%></td>
        <td><%= customer.getName()%></td>
        <td><%= customer.getDateOfBirth()%></td>
        <td><%= customer.getAddress()%></td>
        <td><img height="100" width="100" src="<%=customer.getImage()%>"></td>
    </tr>
    <%
            }
        }else {
    %>
             <tr>
                 <td colspan="5" style="text-align: center;">No customers found.</td>
             </tr>
          <%  }
          %>


</table>
</body>
</html>
