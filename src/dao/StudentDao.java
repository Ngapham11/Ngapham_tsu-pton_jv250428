package dao;

import entity.Student;

public interface StudentDao {
    boolean save(Student student);
    boolean update(Student student);
    Student findById(int id);
}
