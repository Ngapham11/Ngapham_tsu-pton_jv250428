package com.ra.ss01_md3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "time_now", value = "/time_now")
public class time_now extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        request.setAttribute("time", LocalDateTime.now().format(dtf));
        request.getRequestDispatcher("ss01.jsp").forward(request,response);

    }
}