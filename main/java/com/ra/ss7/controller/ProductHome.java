package com.ra.ss7.controller;

import com.ra.ss7.model.entity.Product;
import com.ra.ss7.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductHome {
    @Autowired
    private ProductService productService;
    @GetMapping("")
    public String productHome(Model model){
        model.addAttribute("products",productService.findAll());
        return "productHome";
    }
    @GetMapping("/add")
    public String addProduct(Model model){
        model.addAttribute("product",new Product());
        return "addProduct";
    }
    @PostMapping ("/add")
    public String addProduct(@ModelAttribute("product") Product product){
productService.save(product);
return "redirect:/product";
    }
    @GetMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") long id, Model model){
       Product product= productService.findById(id);
        model.addAttribute("product",product);
        return "updateProduct";
    }
@PostMapping("/update/{id}")
    public String updateProduct(@ModelAttribute("product") Product product){
        productService.save(product);
        return "redirect:/product";
}
@GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id")long id){
        productService.delete(id);
        return "redirect:/product";
}
}
