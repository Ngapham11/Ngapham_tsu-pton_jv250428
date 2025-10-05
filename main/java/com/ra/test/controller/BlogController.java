package com.ra.test.controller;

import com.ra.test.model.dto.BlogDto;
import com.ra.test.model.entity.Blog;
import com.ra.test.service.BlogService;
import com.ra.test.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/blog_home")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private UploadFileService uploadFileService;
    @GetMapping("")
    public String blogHome(@RequestParam(value = "page",defaultValue = "1") int page,
                           @RequestParam(value = "size",defaultValue = "3")int size,
                           Model model){
        long totalBlog=blogService.countAll();
        long totalPage=(long) Math.ceil((double) totalBlog/(double) size);
        model.addAttribute("page",page);
        model.addAttribute("totalPage",totalPage);
        model.addAttribute("blogs",blogService.FindAllWithPagination(page,size));
        return "blog_home";}
//    public String bloghome(Model model){
//        model.addAttribute("blogs",blogService.findAll());
//        return "blog_home";
//    }
    @GetMapping("/add")
    public String addBlog(Model model){
        BlogDto blog=new BlogDto();
        model.addAttribute("blog",blog);
        return "add";
    }
    @PostMapping("/add")
    public String addBlog(@Valid @ModelAttribute("blog")BlogDto blog, BindingResult bindingResult,
                          Model model){
        if (bindingResult.hasErrors()){
          model.addAttribute("blog",blog);
          return "/add";
      }
     blogService.save(blog);

         return "redirect:/blog_home";
    }
    @GetMapping("/update/{id}")
    public String updateBlog(Model model,@PathVariable long id){
        model.addAttribute("blog",blogService.findById(id));
        return"update";
    }
    @PostMapping("/update/{id}")
    public String updateBlog(@PathVariable long id,@Valid @ModelAttribute("blog")BlogDto blog, BindingResult bindingResult,
                             Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("blog",blog);
            return "/update";
        }
        blog.setId(id);
        blogService.save(blog);
        return "redirect:/blog_home";
    }
    @GetMapping("/delete/{id}")
    public String deleteBlog(@PathVariable long id){
        Blog blog=blogService.findById(id);
        if (blog!=null){
            blogService.delete(blog);
            return "redirect:/blog_home";
        }
    }
}
