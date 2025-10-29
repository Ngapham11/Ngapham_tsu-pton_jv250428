package com.ra.ss5.model.dao;

import com.ra.ss5.model.entity.Student;
import com.ra.ss5.util.ConnectionDB;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentDaoImp implements StudentDao {

    @Override
    public List<Student> find_all_student(String search,String sort) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        List<Student>students=new ArrayList<>();
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call find_all_student(?,?)}");
            callableStatement.setString(1,search);
            callableStatement.setString(2,sort);
            ResultSet resultSet=callableStatement.executeQuery();

            while (resultSet.next()){
                Student student=new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setEmail(resultSet.getString("email"));
                student.setBirthday(LocalDate.parse(resultSet.getString("birthday"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return students;
    }


    @Override
    public boolean save(Student student) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call add_student(?,?,?)}");
            callableStatement.setString(1,student.getName());
            callableStatement.setString(2,student.getName());
            callableStatement.setDate(3, Date.valueOf(student.getBirthday()));
            callableStatement.executeUpdate();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return result;
    }

    @Override
    public boolean update(Student student) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call update_student(?,?,?,?)}");
            callableStatement.setInt(1,student.getId());
            callableStatement.setString(2,student.getName());
            callableStatement.setString(3, student.getEmail());
            callableStatement.setDate(4, Date.valueOf(student.getBirthday()));
            callableStatement.executeUpdate();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return result;
    }

    @Override
    public boolean delete(int id) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call delete_student(?)}");
            callableStatement.setInt(1,id);

            callableStatement.executeUpdate();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return result;
    }

    @Override
    public Student findById(int id) {
        Connection connection=null;
        CallableStatement callableStatement=null;
       Student student=new Student();
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_by_id(?)}");
            callableStatement.setInt(1,id);
            ResultSet resultSet=callableStatement.executeQuery();
            if (resultSet.next()){
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
               student.setEmail(resultSet.getString("email"));
                student.setBirthday(LocalDate.parse(resultSet.getString("birthday"),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return student;
    }
}
