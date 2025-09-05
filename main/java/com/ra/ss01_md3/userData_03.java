package com.ra.ss01_md3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "userData_03", value = "/userData_03")
public class userData_03 extends HttpServlet {
    private final List<Customer>customers=new ArrayList<Customer>();
    @Override
    public void init() throws ServletException {
     customers.add(new Customer(1,"Nguyen Van A", LocalDate.of(1983,10,12),"Ha Noi","https://cdn-media.sforum.vn/storage/app/media/anh-hoat-hinh-cute-8.jpg"));
     customers.add(new Customer(1,"Nguyen Van Minh", LocalDate.of(1999,10,14),"Thanh Hoa","https://cdn-media.sforum.vn/storage/app/media/anh-hoat-hinh-cute-8.jpg"));
     customers.add(new Customer(1,"Nguyen Van Tu", LocalDate.of(1980,5,25),"Quang Tri","https://cdn-media.sforum.vn/storage/app/media/anh-hoat-hinh-cute-8.jpg"));
        customers.add(new Customer(1,"Nguyen Thi Trang", LocalDate.of(1993,9,7),"Ha Noi","https://cdn-media.sforum.vn/storage/app/media/anh-hoat-hinh-cute-8.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("customers",customers);
        request.getRequestDispatcher("userData_03jsp.jsp").forward(request,response);
    }
}