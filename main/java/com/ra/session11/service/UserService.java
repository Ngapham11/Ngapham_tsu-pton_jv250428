package com.ra.session11.service;

import com.ra.session11.model.dao.UserDao;
import com.ra.session11.model.dao.UserDaoImp;
import com.ra.session11.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
   public List<User> findAll(){
        return userDao.findAll();
    }
    public User findById(int id){
return userDao.findById(id);
    };
   public boolean save(User user){
        return userDao.save(user);
    };
   public boolean delete(long id){
        return userDao.delete(id);
    };
    public boolean checkNameExists(String name){
        return userDao.checkNameExists(name);
    };
    public int totalUser(){
        return userDao.findAll().size();
    }
    public List<User>getAllWithPagination(int page,int size){
        return userDao.getAllWithPagination(page,size);
    }
}
