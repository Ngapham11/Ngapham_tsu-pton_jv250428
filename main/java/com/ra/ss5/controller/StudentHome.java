package com.ra.ss5.controller;

import com.ra.ss5.model.entity.Student;
import com.ra.ss5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentHome {
    @Autowired
    private StudentService studentService;
    @RequestMapping("")
    public String home(Model model){
        List<Student> students=studentService.findAll();
        model.addAttribute("students",students);
        return "home";
    }
}
