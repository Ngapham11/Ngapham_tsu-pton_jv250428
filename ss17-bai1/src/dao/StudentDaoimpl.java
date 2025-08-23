package dao;

import entity.Student;
import ulti.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
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
}
