package com.ra.session10.controller;

import com.ra.session10.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("")
    public String studentHome(Model model){
        model.addAttribute("students",studentService.findAll());
        return "student_home";
    }
}
