package com.ra.test.service;

import com.ra.test.model.dao.BlogDao;
import com.ra.test.model.dto.BlogDto;
import com.ra.test.model.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.LineNumberReader;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogDao blogDao;
    @Autowired
    private UploadFileService uploadFileService;
    public List<Blog>FindAllWithPagination(int page,int size){
        return blogDao.findAllWithPagination(page,size);
    }
    public Blog findById(long id){
        return blogDao.findById(id);
    }
    @Transactional
    public boolean save(BlogDto blog){
        String url=uploadFileService.uploadFile(blog.getAvatar());
        Blog newBlog=new Blog();
        newBlog.setTitle(blog.getTitle());
        newBlog.setAuthor(blog.getAuthor());
        newBlog.setContent(blog.getContent());
        newBlog.setStatus(blog.isStatus());
        newBlog.setCreatedDate(blog.getCreatedDate());
        newBlog.setAvatar(url);
        return blogDao.save(newBlog);
    }
    @Transactional
    public boolean delete(Blog blog){
        return blogDao.delete(blog);
    }
    public List<Blog>findAll(){
        return blogDao.findAll();
    }
    public long countAll(){
        return blogDao.countAll();
    }
}
