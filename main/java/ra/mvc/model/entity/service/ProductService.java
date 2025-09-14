package ra.mvc.model.entity.service;

import org.springframework.stereotype.Service;
import ra.mvc.model.entity.Product;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
   public List<Product> getListProduct(){
        List<Product>products=new ArrayList<>();
        products.add(new Product(1,"chao",200,2,"do gia dung"));
        products.add(new Product(2,"banh",250,3,"thuc pham"));
        products.add(new Product(3,"quan",320,2,"quan ao"));
        return products;
    }
}
