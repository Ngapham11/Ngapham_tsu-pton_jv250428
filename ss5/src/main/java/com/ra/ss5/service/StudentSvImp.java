package com.ra.ss5.service;

import com.ra.ss5.model.dao.StudentDao;
import com.ra.ss5.model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSvImp implements StudentService{
    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> find_all_student(String search, String sort) {
        return  studentDao.find_all_student(search,sort);
    }

    @Override
    public boolean save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public boolean update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public boolean delete(int id) {
        return studentDao.delete(id);
    }

    @Override
    public Student findById(int id) {
        return studentDao.findById(id);
    }
}
