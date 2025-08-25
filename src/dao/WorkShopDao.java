package dao;

import entity.WorkShop;

import java.util.List;

public interface WorkShopDao {
    List<WorkShop> findAll();
    boolean save(WorkShop workShop);
    boolean update(WorkShop workShop);
    boolean delete(int workShopID);
    WorkShop findById(int id);
    List<WorkShop> findByName(String name);
}
