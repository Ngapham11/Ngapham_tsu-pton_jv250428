package com.ra.demotest.model.dao;

import com.ra.demotest.model.entity.Project;

import java.util.List;

public interface ProjectDao {
    List<Project> findAll();
    boolean save(Project project);
    boolean update(Project project);
    boolean delete(int id);
    Project findById(int id);
}
