package Dao;

import Model.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> getAllStudent();
    Student findById(Integer id);
    void addStudent(Student student);
    void editStudent(Student student);
    void deleteById(Integer id);
}
