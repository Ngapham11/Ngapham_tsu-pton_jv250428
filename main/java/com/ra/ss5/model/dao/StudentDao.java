package com.ra.ss5.model.dao;

import com.ra.ss5.model.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    boolean save(Student student);
    boolean update(Student student);
    boolean delete(int id);
    Student findById(int id);
}
