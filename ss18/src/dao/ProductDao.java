package dao;

import entity.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    boolean addProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(int id);
    List<Product>findByName(String name);
    Product findById(int id);
}
