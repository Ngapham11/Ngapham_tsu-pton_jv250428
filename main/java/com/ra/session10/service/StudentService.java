package com.ra.session10.service;

import com.ra.session10.entity.Student;
import com.ra.session10.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Transactional(readOnly = true)
    public List<Student>findAll(){
        return studentRepository.findAll();
    }
    @Transactional(readOnly = true)
    public Student findById(long id){
        return studentRepository.findById(id);
    }
    @Transactional
    public boolean save(Student student){
        return studentRepository.save(student);
    }
    public boolean updateStudent(Student student,long id){
       Student  studentCheck=studentRepository.findById(id);
        if (studentCheck!=null){
            return studentRepository.save(student);
        }else return false;
    }
    @Transactional
    public String deleteStudent(long id){
        Student student=studentRepository.findById(id);
        if (student!=null){
            if (student.isStudying()){
                return "Khong the xoa hoc sinh dang hoc";
            }else {
                studentRepository.deleteById(id);
                return "Xoa thanh cong";
            }
        }else return "khong tim thay hoc sinh";
    }
}
