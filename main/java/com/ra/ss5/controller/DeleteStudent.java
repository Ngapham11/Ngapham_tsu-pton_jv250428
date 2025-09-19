package com.ra.ss5.controller;

import com.ra.ss5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class DeleteStudent {
    @Autowired
    private StudentService studentService;
    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id){
        if (studentService.delete(id)){
            return "redirect:/";
        }return "home";
    }
}
