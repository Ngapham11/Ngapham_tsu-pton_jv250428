package ss16_bai1.dao;

import ss16_bai1.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    boolean addStudent(Student student);
    boolean updateStudent(Student student);
    boolean deleteStudent(Student student);


    Student findById(int studentId);
}
