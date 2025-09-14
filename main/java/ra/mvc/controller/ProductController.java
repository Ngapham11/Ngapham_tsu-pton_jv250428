package ra.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.mvc.model.entity.Product;
import ra.mvc.model.entity.service.ProductService;

import java.util.List;
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @RequestMapping("/list")
    public String product(Model model){
       List<Product>products=productService.getListProduct();
       model.addAttribute("products",products);
       return "product";
    }
}
