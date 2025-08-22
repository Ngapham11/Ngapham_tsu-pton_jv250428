package ss16_bai1.dao;

import ss16_bai1.entity.Student;
import ss16_bai1.util.ConnectionDB;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoimpl implements StudentDao{
    @Override
    public List<Student> findAll() {
        Connection connection=null;
        CallableStatement callableStatement=null;
        List<Student>students=new ArrayList<>();

        try { connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_all_students()}");
            ResultSet resultSet=callableStatement.executeQuery();
            while (resultSet.next()){
                Student student=new Student();
                student.setStudentId(resultSet.getInt("student_id"));
                student.setStudentName(resultSet.getString("full_name"));
                student.setDate(LocalDate.parse(resultSet.getString("date"),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                student.setEmail(resultSet.getString("email"));
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }
        return students;
    }

    @Override
    public boolean addStudent(Student student) {
       Connection connection=null;
       CallableStatement callableStatement=null;
       boolean result=false;

        try {   connection=ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call add_students(?,?,?)}");
            callableStatement.setString(1,student.getStudentName());
            callableStatement.setDate(2, Date.valueOf(student.getDate()));
            callableStatement.setString(3,student.getEmail());
            callableStatement.executeUpdate();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }
        return result;
    }

    @Override
    public boolean updateStudent(Student student) {
 Connection connection=null;
 CallableStatement callableStatement=null;
 boolean result=false;

        try { connection=ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call update_students(?,?,?,?)}");
            callableStatement.setInt(1,student.getStudentId());
callableStatement.setString(2,student.getStudentName());
callableStatement.setDate(3,Date.valueOf(student.getDate()));
callableStatement.setString(4,student.getEmail());
callableStatement.executeUpdate();
result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return  result;
    }

    @Override
    public boolean deleteStudent(Student student) {
     Connection connection=null;
     CallableStatement callableStatement=null;
     boolean result=false;

        try { connection=ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call delete_by_id(?)}");
            callableStatement.setInt(1,student.getStudentId());
            callableStatement.executeUpdate();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return  result;
    }

    @Override
    public Student findById(int studentId) {
       Connection connection=null;
       CallableStatement callableStatement=null;
Student student=null;

       try {
           connection=ConnectionDB.openConnection();
           callableStatement=connection.prepareCall("{call find_students_by_id(?)}");
           callableStatement.setInt(1,studentId);
           ResultSet resultSet= callableStatement.executeQuery();
    if (resultSet.next()){
         student=new Student();
         student.setStudentId(resultSet.getInt("Student_id"));
         student.setStudentName(resultSet.getString("full_name"));
         student.setDate(LocalDate.parse(resultSet.getString("date"),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
         student.setEmail(resultSet.getString("email"));

     }
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }finally {
           ConnectionDB.closeConnection(connection,callableStatement);
       }return student;
    }

}
