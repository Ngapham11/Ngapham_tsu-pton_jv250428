package com.ra.session10.controller;

import com.ra.session10.entity.Student;
import com.ra.session10.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

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
    @GetMapping("/add")
    public String addStudent(Model model){
        model.addAttribute("student",new Student());
        return "add_student";
    }
    @PostMapping("add")
    public String addStudent(@Valid @ModelAttribute Student student, BindingResult bindingResult,
                             RedirectAttributes redirectAttributes,Model model){
//binding de chua loi
        //redirec de hien thi thong bao
        if (bindingResult.hasErrors()){
            model.addAttribute("student",student);
            return "add_student";
            // neu sinh ra loi thi van giu thong tin student o trang add 
        }
boolean result=studentService.save(student);
        if (result){// hien thi thong bao 
            redirectAttributes.addFlashAttribute("message","Da them thanh cong");
        }else {redirectAttributes.addAttribute("message","Them that bai");}
        return "redirect:/";
    }
    @GetMapping("/update/{id}")
    public String updateStudent(@PathVariable long id,Model model){
        model.addAttribute("student",studentService.findById(id));
        return "update_student";
    }
    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable long id,@Valid @ModelAttribute Student student,BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("student",student);
            return "update_student";
        }studentService.updateStudent(student,id);
            return "redirect:/";
        
    }

}
