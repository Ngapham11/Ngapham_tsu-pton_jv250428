package com.ra.demotest.service;

import com.ra.demotest.model.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAll();
    boolean save(Project project);
    boolean update(Project project);
    boolean delete(int id);
    Project findById(int id);
}
