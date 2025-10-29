package com.ra.ss5.controller;

import com.ra.ss5.model.entity.Student;
import com.ra.ss5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
public class UpdateStudent {
    @Autowired
    private StudentService studentService;
    @GetMapping("/update/{id}")
    public String update(@PathVariable int id, Model model){
        Student student=studentService.findById(id);
        model.addAttribute("student",student);

        return "update";
    }
    @PostMapping("/update/{id}")
    public String update(@PathVariable int id, HttpServletRequest request){
      Student student=new Student();
      student.setId(id);
      student.setName(request.getParameter("name"));
      student.setEmail(request.getParameter("email"));
      student.setBirthday(LocalDate.parse(request.getParameter("date")));
      if (studentService.update(student)){
          return "redirect:/";
      }return "update";
    }
}
