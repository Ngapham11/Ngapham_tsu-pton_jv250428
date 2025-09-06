package com.ra.ss01_md3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Rate_04", value = "/Rate_04")
public class Rate_04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      request.getRequestDispatcher("rate_usd_04.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double rate=Double.parseDouble(request.getParameter("rate"));
        Double usd=Double.parseDouble(request.getParameter("usd"));
        double vnd=rate*usd;
        request.setAttribute("rate",rate);
        request.setAttribute("usd",usd);
        request.setAttribute("vnd",vnd);
        request.getRequestDispatcher("result.jsp").forward(request,response);

    }
}