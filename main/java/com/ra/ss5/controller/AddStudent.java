package com.ra.ss5.controller;

import com.ra.ss5.model.dao.StudentDao;
import com.ra.ss5.model.entity.Student;
import com.ra.ss5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class AddStudent {
    @Autowired
    private StudentService studentService;
    @GetMapping("/add")
    public String add(Model model){
        return "add";
    }
    @PostMapping ("/add")
    public String save(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("date")@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date, Model model) {
       Student student=new Student();
       student.setName(name);
       student.setEmail(email);
       student.setBirthday(date);
        if (studentService.save(student)){
            return "redirect:/";
        }
   return "add";
    }
}
