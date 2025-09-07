package com.ra.session02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ss2_02Servlet", value = "/ss2_02Servlet")
public class ss2_02Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("age",10);
        request.getRequestDispatcher("ss2_02.jsp").forward(request,response);
    }
}