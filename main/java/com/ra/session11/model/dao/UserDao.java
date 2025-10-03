package com.ra.session11.model.dao;

import com.ra.session11.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao  {
    List<User>findAll();
    User findById(int id);
    boolean save(User user);
    boolean delete(long id);
    boolean checkNameExists(String name);
    List<User> getAllWithPagination(int page,int size);
}
