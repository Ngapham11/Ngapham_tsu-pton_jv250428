package com.ra.ss5.model.dao;

import com.ra.ss5.model.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> find_all_student(String search,String sort);
    boolean save(Student student);
    boolean update(Student student);
    boolean delete(int id);
    Student findById(int id);
}
