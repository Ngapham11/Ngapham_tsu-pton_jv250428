package dao;

import entity.WorkShop;
import util.ConnectionDB;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class WorkShopDaoimpl implements WorkShopDao{
    @Override
    public List<WorkShop> findAll() {
        Connection connection=null;
        CallableStatement callableStatement=null;
        List<WorkShop>workShops=new ArrayList<>();

        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_all()}");
            ResultSet resultSet=callableStatement.executeQuery();
            while (resultSet.next()){
                WorkShop workShop=new WorkShop();
                workShop.setWorkShopId(resultSet.getInt("workshop_id"));
                workShop.setWorkShopName(resultSet.getString("workshop_name"));
                workShop.setDateImplement(LocalDate.parse(resultSet.getString("date_implement"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                workShop.setSpeakerName(resultSet.getString("speaker_name"));
                workShop.setSpeakerPhone(resultSet.getString("speaker_phone"));
                workShop.setStatus(resultSet.getInt("status"));
                workShops.add(workShop);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return workShops;
    }

    @Override
    public boolean save(WorkShop workShop) {
        Connection connection=null;
        CallableStatement callableStatement=null;
boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call add_workshop(?,?,?,?,?)}");
callableStatement.setString(1,workShop.getWorkShopName());
callableStatement.setDate(2, Date.valueOf(workShop.getDateImplement()));
callableStatement.setString(3,workShop.getSpeakerName());
callableStatement.setString(4,workShop.getSpeakerPhone());
callableStatement.setInt(5,workShop.getStatus());
callableStatement.executeUpdate();
result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return result;
    }

    @Override
    public boolean update(WorkShop workShop) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call add_workshop(?,?,?,?,?,?)}");
            callableStatement.setInt(1,workShop.getWorkShopId());
            callableStatement.setString(2,workShop.getWorkShopName());
            callableStatement.setDate(3, Date.valueOf(workShop.getDateImplement()));
            callableStatement.setString(4,workShop.getSpeakerName());
            callableStatement.setString(5,workShop.getSpeakerPhone());
            callableStatement.setInt(6,workShop.getStatus());
            callableStatement.executeUpdate();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return result;
    }

    @Override
    public boolean delete(int workShopId) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call delete_workshop(?)}");
            callableStatement.setInt(1,workShopId);

            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return result;
    }

    @Override
    public WorkShop findById(int id) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        WorkShop workShop=null;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_by_id()}");
callableStatement.setInt(1,id);
            ResultSet resultSet=callableStatement.executeQuery();
           if (resultSet.next()){
                workShop=new WorkShop();
                workShop.setWorkShopId(resultSet.getInt("workshop_id"));
                workShop.setWorkShopName(resultSet.getString("workshop_name"));
                workShop.setDateImplement(LocalDate.parse(resultSet.getString("date_implement"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                workShop.setSpeakerName(resultSet.getString("speaker_name"));
                workShop.setSpeakerPhone(resultSet.getString("speaker_phone"));
                workShop.setStatus(resultSet.getInt("status"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return workShop;
    }

    @Override
    public List<WorkShop> findByName(String name) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        List<WorkShop>workShops=new ArrayList<>();

        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call search_by_name()}");
            callableStatement.setString(1,name);
            ResultSet resultSet=callableStatement.executeQuery();
            while (resultSet.next()){
                WorkShop workShop=new WorkShop();
                workShop.setWorkShopId(resultSet.getInt("workshop_id"));
                workShop.setWorkShopName(resultSet.getString("workshop_name"));
                workShop.setDateImplement(LocalDate.parse(resultSet.getString("date_implement"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                workShop.setSpeakerName(resultSet.getString("speaker_name"));
                workShop.setSpeakerPhone(resultSet.getString("speaker_phone"));
                workShop.setStatus(resultSet.getInt("status"));
                workShops.add(workShop);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return workShops;
    }
}
