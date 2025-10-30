package com.ra.ss6.controller;

import com.ra.ss6.model.entity.Customer;
import com.ra.ss6.model.entity.Role;
import com.ra.ss6.model.entity.UserSession;
import com.ra.ss6.service.loginService.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProcessLogin {
    @Autowired
    private LoginService loginService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")

    public String processLogin(HttpServletRequest request){

        UserSession userSession=new UserSession();
        userSession.setUserName(request.getParameter("name"));
        userSession.setPassword(request.getParameter("password"));
        Customer customer=loginService.getByName(userSession.getUserName());
        if (customer.getRole()== Role.ADMIN){
            return "redirect:/movie";
        } else if (customer.getRole()==Role.USER) {
           return  "redirect:/home";
        }return "login";
    }
}
