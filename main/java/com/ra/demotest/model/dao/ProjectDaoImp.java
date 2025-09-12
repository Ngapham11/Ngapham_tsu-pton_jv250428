package com.ra.demotest.model.dao;

import com.ra.demotest.model.entity.Project;
import com.ra.demotest.util.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectDaoImp implements ProjectDao{
    @Override
    public List<Project> findAll() {
        Connection connection=null;
        CallableStatement callableStatement=null;
        List<Project>projects=new ArrayList<>();
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call find_all}");
            ResultSet resultSet=callableStatement.executeQuery();

            while (resultSet.next()){
                Project project=new Project();
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setImage(resultSet.getString("image"));
                projects.add(project);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return projects;
    }

    @Override
    public boolean save(Project project) {
        Connection connection=null;
        CallableStatement callableStatement=null;
boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call create_project(?,?,?)}");
     callableStatement.setString(1,project.getName());
     callableStatement.setString(2,project.getDescription());
     callableStatement.setString(3, project.getImage());
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
    public boolean update(Project project) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call update_project(?,?,?,?)}");
            callableStatement.setInt(1,project.getId());
            callableStatement.setString(2,project.getName());
            callableStatement.setString(3,project.getDescription());
            callableStatement.setString(4, project.getImage());
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
            callableStatement=connection.prepareCall("{call delete_project(?)}");
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
    public Project findById(int id) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        Project project=new Project();
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call find_by_id(?)}");
            callableStatement.setInt(1,id);
            ResultSet resultSet=callableStatement.executeQuery();
            if (resultSet.next()){
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setImage(resultSet.getString("image"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return project;
    }
}
