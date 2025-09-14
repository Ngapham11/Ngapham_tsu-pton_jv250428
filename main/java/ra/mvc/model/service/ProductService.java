package ra.mvc.model.service;

import org.springframework.stereotype.Service;
import ra.mvc.model.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
   private final List<Product>products=new ArrayList<>();
   public  ProductService(){
       products.add(new Product(1,"chao",200,2,"do gia dung"));
       products.add(new Product(2,"banh",250,3,"thuc pham"));
       products.add(new Product(3,"quan",320,2,"quan ao"));
       products.add(new Product(4, "Rau", 30, 20, "Thuc pham tuoi"));
       products.add(new Product(5, "Ca", 300, 3, "Hai san"));
       products.add(new Product(6, "Qua", 100, 8, "Trai cay tuoi"));
   }
   public List<Product> getListProduct(){
        return products;
    }
    public List<Product> searchProduct(String name){
return products.stream().filter(product -> product.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }
}
