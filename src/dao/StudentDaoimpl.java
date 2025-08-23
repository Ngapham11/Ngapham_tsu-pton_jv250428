package dao;

import entity.Student;
import ulti.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoimpl implements StudentDao{
    @Override
    public boolean save(Student student) {
        Connection con=null;
        CallableStatement callableStatement=null;
       boolean result=false;
        try { con= ConnectionDB.openConnection();
            con.setAutoCommit(false);
            callableStatement=con.prepareCall("{call add_students(?,?)}");
            callableStatement.setString(1,student.getStudentName());
            callableStatement.setInt(2,student.getAge());
            callableStatement.executeUpdate();
            con.commit();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
          ConnectionDB.closeConnection(con,callableStatement);
        }  return result;
    }

    @Override
    public boolean update(Student student) {
        Connection con=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try { con= ConnectionDB.openConnection();
            con.setAutoCommit(false);
            callableStatement=con.prepareCall("{call update_students(?,?,?)}");
            callableStatement.setInt(1,student.getId());
            callableStatement.setString(2,student.getStudentName());
            callableStatement.setInt(3,student.getAge());
            callableStatement.executeUpdate();
            con.commit();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            ConnectionDB.closeConnection(con,callableStatement);
        }  return result;
    }

    @Override
    public Student findById(int id) {
        Connection con=null;
        CallableStatement callableStatement=null;
Student student=null;
        try { con= ConnectionDB.openConnection();
            con.setAutoCommit(false);
            callableStatement=con.prepareCall("{call find_by_id(?)}");
            callableStatement.setInt(1,id);
            ResultSet resultSet=callableStatement.executeQuery();
        if (resultSet.next()){
            student=new Student();
            student.setId(resultSet.getInt("id"));
            student.setStudentName(resultSet.getString("name"));
            student.setAge(resultSet.getInt("age"));
        }
            con.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            ConnectionDB.closeConnection(con,callableStatement);
        }  return student;
    }
}
