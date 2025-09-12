package com.ra.demotest.service;

import com.ra.demotest.model.dao.ProjectDao;
import com.ra.demotest.model.dao.ProjectDaoImp;
import com.ra.demotest.model.entity.Project;

import java.util.List;

public class ProjectServiceImp implements ProjectService{
    private final ProjectDao projectDao;

    public ProjectServiceImp() {
        this.projectDao = new ProjectDaoImp();
    }

    @Override
    public List<Project> findAll() {
        return projectDao.findAll();
    }

    @Override
    public boolean save(Project project) {
        return projectDao.save(project);
    }

    @Override
    public boolean update(Project project) {
        return projectDao.update(project);
    }

    @Override
    public boolean delete(int id) {
        return projectDao.delete(id);
    }

    @Override
    public Project findById(int id) {
        return projectDao.findById(id);
    }
}
