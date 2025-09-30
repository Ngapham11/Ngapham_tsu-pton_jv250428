package com.ra.ss7.repository;

import com.ra.ss7.model.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProductRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public List<Product> findAll(){
        return entityManager.createQuery("from Product ",Product.class)
                .getResultList();
    }
    public Product findById(long id){
        return entityManager.find(Product.class,id);
    }
    @Transactional
    public boolean save(Product product){
        try {
            entityManager.merge(product);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    @Transactional
    public boolean delete(long id){
        try {
            Product product=entityManager.find(Product.class,id);
            entityManager.remove(product);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean isExistProductByName(String name){
        Long count=entityManager.createQuery("select count (p) from Product p where p.name=:name",Long.class)
                .setParameter("name",name).getSingleResult();
        return count>0;
    }
}
