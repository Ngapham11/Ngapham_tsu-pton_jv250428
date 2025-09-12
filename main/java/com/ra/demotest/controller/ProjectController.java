package com.ra.demotest.controller;

import com.ra.demotest.model.entity.Project;
import com.ra.demotest.service.ProjectService;
import com.ra.demotest.service.ProjectServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProjectController", value = "/project")
public class ProjectController extends HttpServlet {
    private final ProjectService projectService;

    public ProjectController() {
        this.projectService = new ProjectServiceImp();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action=request.getParameter("action")!=null?request.getParameter("action"):"all";
        String id=request.getParameter("id");
        if (action.equals("create")){
request.getRequestDispatcher("views/add_project.jsp").forward(request,response);
        } else if (action.equals("update")) {
            Project project=projectService.findById(Integer.parseInt(id));
            request.setAttribute("project",project);
            request.getRequestDispatcher("views/update_project.jsp").forward(request,response);
        }
        //else if (action.equals("delete")) {
     //       request.getRequestDispatcher("views/delete_project.jsp").forward(request,response);
 //       }else {}
        else if (action.equals("delete")) {
            if(projectService.delete(Integer.parseInt(request.getParameter("id")))){
                getAllData(request,response);
            }
        }
    getAllData(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action=req.getParameter("action");
        String id=req.getParameter("id");
        if (action.equals("create")){
            Project project=new Project();
            project.setName(req.getParameter("name"));
            project.setDescription(req.getParameter("description"));
            project.setImage(req.getParameter("image"));
            if (projectService.save(project)){
                getAllData(req,resp);
            }
        }
        else if (action.equals("update")) {
            Project project=new Project();
            project.setId(Integer.parseInt(req.getParameter("id")));
            project.setName(req.getParameter("name"));
            project.setDescription(req.getParameter("description"));
            project.setImage(req.getParameter("image"));
            if(projectService.update(project))
            {
                getAllData(req,resp);
            }

        }

    }

    public void getAllData(HttpServletRequest request, HttpServletResponse response){
        List<Project>projects=projectService.findAll();
        request.setAttribute("projects",projects);
        try {
            request.getRequestDispatcher("views/project.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}