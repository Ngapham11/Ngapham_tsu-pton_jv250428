package com.ra.ss5.service;

import com.ra.ss5.model.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> find_all_student(String search,String sort);
    boolean save(Student student);
    boolean update(Student student);
    boolean delete(int id);
    Student findById(int id);
}
