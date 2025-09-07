package com.ra.session02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ss2_04Servlet", value = "/ss2_04Servlet")
public class ss2_04Servlet extends HttpServlet {
    public static final List<Product>products=new ArrayList<Product>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       products.add(new Product(products.size()+1,"Gao lut","Mo ta gao lut",20000,"https://login.medlatec.vn//ImagePath/images/20211127/20211127_gao-lut-co-tot-khong-2.png"))
    }
}