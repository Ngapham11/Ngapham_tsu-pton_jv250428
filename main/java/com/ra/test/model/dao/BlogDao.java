package com.ra.test.model.dao;

import com.ra.test.model.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class BlogDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public List<Blog>findAll(){
       try {
           return entityManager.createQuery("from Blog ",Blog.class).getResultList();
       }catch (Exception e){
           e.printStackTrace();
           return null;
       }
    }
    public Blog findById(Long id){
return entityManager.find(Blog.class,id);
    }
    @Transactional
    public boolean save(Blog blog){
        try {
            entityManager.persist(blog);
            return true;
        }catch (Exception e){
           e.printStackTrace();
        }return false;
    }
    @Transactional
    public boolean delete(Blog blog){
      try {
          entityManager.remove(blog);
          return true;
      }catch (Exception e){
          e.printStackTrace();
      }
      return false;
    }
    public List<Blog>findAllWithPagination(int page,int size){
        TypedQuery<Blog> query=entityManager.createQuery("from Blog ",Blog.class);
        query.setFirstResult((page-1)*size).setMaxResults(size);
        return query.getResultList();
    }
    public long countAll(){
        return entityManager.createQuery("select count (b) from Blog b",Long.class )
                .getSingleResult();
    }
}
