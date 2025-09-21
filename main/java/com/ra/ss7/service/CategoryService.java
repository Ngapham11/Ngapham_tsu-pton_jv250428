package com.ra.ss7.service;

import com.ra.ss7.model.entity.Category;
import com.ra.ss7.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
public List<Category> findAll(){
    return categoryRepository.fillAll();
}
public Category fingById(long id){
    return categoryRepository.findById(id);
}
public boolean save(Category category){
    return categoryRepository.save(category);
}
public boolean delete(long id){
    return categoryRepository.delete(id);
}
public  boolean existsByName(String name){
    return categoryRepository.existByName(name);
}
}
