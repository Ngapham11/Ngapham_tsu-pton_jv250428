package com.ra.ss6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeManager {
    @RequestMapping("/")
    public String homeManager(){
        return "homeManager";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }

}
