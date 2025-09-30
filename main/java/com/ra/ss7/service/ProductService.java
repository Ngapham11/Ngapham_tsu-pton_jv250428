package com.ra.ss7.service;

import com.ra.ss7.model.entity.Product;
import com.ra.ss7.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findById(long id){
        return productRepository.findById(id);
    }
    public boolean save(Product product){
        return productRepository.save(product);
    }
    public boolean delete(long id){
        return productRepository.delete(id);
    }
    public boolean existsByName(String name){
        return productRepository.isExistProductByName(name);
    }
}
