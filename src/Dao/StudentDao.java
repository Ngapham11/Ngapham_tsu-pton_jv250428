package Dao;

import Model.Student;
import database.ConnectionDB;

import java.sql.Connection;
import java.util.List;

public class StudentDao implements IStudentDao{
    @Override
    public List<Student> getAllStudent() {
        //Mo ket noi
        Connection con= ConnectionDB.openConnection();
        //Tao truy van

    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void editStudent(Student student) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
