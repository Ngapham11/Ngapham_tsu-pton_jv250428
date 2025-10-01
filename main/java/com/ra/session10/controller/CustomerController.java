package com.ra.session10.controller;

import com.ra.session10.entity.Customer;
import com.ra.session10.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("")
    public String customerHome(@RequestParam(name= "page",defaultValue = "1")int page ,
                               @RequestParam(name = "size" ,defaultValue = "2")int size,
                               Model model){
        int totalCustomer=customerService.countCustomer();
        int totalPage=(int)Math.ceil((double) totalCustomer/(double) size);
        model.addAttribute("page",page);
        model.addAttribute("totalPage",totalPage);
     model.addAttribute("customers",customerService.getCustomerWithPagination(page,size));
     return "customer_home";
    }
    @GetMapping("/add")
    public String addCustomer(Model model){
        model.addAttribute("customer",new Customer());
            return "add_customer";
        }
    @PostMapping("/add")
    public String addCustomer( @ModelAttribute ("customer") Customer customer, Model model, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            model.addAttribute("customer",customer);
            return "add_customer";
        }
        customerService.save(customer);
        return "redirect:/customer";

    }
}
