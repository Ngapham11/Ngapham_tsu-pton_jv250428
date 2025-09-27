package com.ra.session9.repository;

import com.ra.session9.model.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public List<Category>findAll(){
        Session session=sessionFactory.getCurrentSession();
        return   session.createQuery("from Category ",Category.class).getResultList();
    }
    public Category findById(long id){
        Session session=sessionFactory.getCurrentSession();
        return session.get(Category.class,id);
    }
}

