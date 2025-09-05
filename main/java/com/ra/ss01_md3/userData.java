package com.ra.ss01_md3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "userData", value = "/userData")
public class userData extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       request.setAttribute("idNumber",1);
       request.setAttribute("name","Huan");
       request.setAttribute("email","huan@gmail.com");
       request.setAttribute("age",18);
    request.getRequestDispatcher("userData_02.jsp").forward(request,response);
    }
}