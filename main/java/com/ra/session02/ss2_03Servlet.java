package com.ra.session02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ss2_03Servlet", value = "/ss2_03Servlet")
public class ss2_03Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       request.getRequestDispatcher("ss2_03.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int firstNumber=Integer.parseInt(req.getParameter("firstNumber"));
        int secondNumber=Integer.parseInt(req.getParameter("secondNumber"));
        String calculation=req.getParameter("calculation");
        int result=0;
       switch (calculation){
           case "sub":result=firstNumber+secondNumber;
           break;
           case "diff":result=firstNumber-secondNumber;
               break;
           case "product":result=firstNumber*secondNumber;
               break;
           case "quotient":result=firstNumber / secondNumber;
               break;
       }
       req.setAttribute("result",result);
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}