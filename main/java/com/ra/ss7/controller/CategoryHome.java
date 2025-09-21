package com.ra.ss7.controller;

import com.ra.ss7.model.entity.Category;
import com.ra.ss7.repository.CategoryRepository;
import com.ra.ss7.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryHome {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("")
    public String category(Model model){
        List<Category>categories=categoryService.findAll();
       model.addAttribute("categories",categories);
        return "categoryHome";
    }
    @GetMapping("/add")
    public String add(){
        return "addCategory";
    }
    @PostMapping("/add")
    public String addCategory(@ModelAttribute Category category,Model model){
        if (category==null || category.getName().isEmpty()){
          model.addAttribute("category",category);
          return "addCategory";
        } else if (categoryService.existsByName(category.getName())) {
            model.addAttribute("category",category);
            return "addCategory";
        }
        categoryService.save(category);
        return "redirect:/category";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
         categoryService.delete(id);
            return "redirect:/category";

}
@GetMapping("/update/{id}")
    public String update(@PathVariable long id,Model model){
        Category category=categoryService.fingById(id);
        model.addAttribute("category",category);
        return "updateCategory";
}@PostMapping("/update/{id}")
    public String updateCategory(@ModelAttribute Category category,Model model){
 if (category==null || category.getName().isEmpty()){
     model.addAttribute("category",category);
     return "updateCategory";
 } else if (categoryService.existsByName(category.getName())) {
     model.addAttribute("category",category);
     return "updateCategory";
 }categoryService.save(category);
     return "redirect:/category";

    }
    }