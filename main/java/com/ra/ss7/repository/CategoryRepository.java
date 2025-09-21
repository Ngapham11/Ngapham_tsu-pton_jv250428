package com.ra.ss7.repository;

import com.ra.ss7.model.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CategoryRepository {
    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public List<Category> fillAll(){
        Session session=sessionFactory.getCurrentSession();
        return session.createQuery("from  Category ",Category.class).list();
    }
    @Transactional
    public Category findById(long id){
        Session session=sessionFactory.getCurrentSession();
        try {
           return session.get(Category.class,id);
       }catch (Exception e){
           return null;
       }
    }
    @Transactional
    public boolean save(Category category){
        Session session=sessionFactory.getCurrentSession();
        try {
            session.saveOrUpdate(category);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @Transactional
    public boolean delete(long id){
        Session session=sessionFactory.getCurrentSession();
        Category category=findById(id);
        if (category!=null){
            session.delete(category);
            return true;
        }else return false;
    }
    @Transactional
    public boolean existByName(String name){
        Session session=sessionFactory.getCurrentSession();
        Category category=session.createQuery("from Category where name=:name",Category.class)
                .setParameter("name",name).uniqueResult();
        return category!=null;
    }
}
