package com.ra.session11.controller;

import com.ra.session11.model.entity.User;
import com.ra.session11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public String userPage(@RequestParam (name = "page",defaultValue = "1")int page,
                           @RequestParam(name = "size",defaultValue = "3")int size,
                           Model model){
        int totalUser=userService.totalUser();
        int totalPage=(int) Math.ceil((double)totalUser/(double) size);
        model.addAttribute("page",page);
        model.addAttribute("totalPage",totalPage);
        model.addAttribute("users",userService.getAllWithPagination(page,size));
        return "userPage";
    }
    @GetMapping("/add")
    public String addUser(Model model){
        model.addAttribute("user",new User());
           return "addUser";
    }
    @PostMapping("/add")
    public String addUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult,
                          Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("user",user);
            return "addUser";
        }
        userService.save(user);
        return "redirect:/";
    }
}
