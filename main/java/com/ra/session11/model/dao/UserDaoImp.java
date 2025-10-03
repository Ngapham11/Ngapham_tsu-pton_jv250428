package com.ra.session11.model.dao;

import com.ra.session11.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class UserDaoImp implements UserDao{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<User> findAll() {
        return entityManager.createQuery("From User",User.class).getResultList();
    }

    @Override
    public User findById(int id) {
        return entityManager.find(User.class,id);
    }
@Transactional
    @Override
    public boolean save(User user) {
       try {
           entityManager.merge(user);
           return true;
       }catch (Exception e){
           return false;
       }
    }
@Transactional
    @Override
    public boolean delete(long id) {
       User user=entityManager.find(User.class,id);
       if (user==null){
           return false;
       }entityManager.remove(user);
       return true;
    }

    @Override
    public boolean checkNameExists(String name) {
        String hql="select count(u) from User u where u.username=:name";
       Long count=(Long) entityManager.createQuery(hql).setParameter("name",name).getSingleResult();
        return count>0;
    }

    @Override
    public List<User> getAllWithPagination(int page, int size) {
        TypedQuery<User> query=entityManager.createQuery("from User",User.class);
        query.setFirstResult((page-1)*size).setMaxResults(size);
        return query.getResultList();
    }

}
