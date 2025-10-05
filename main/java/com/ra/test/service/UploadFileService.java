package com.ra.test.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.ra.test.model.dao.BlogDao;
import com.ra.test.model.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class UploadFileService {
    @Autowired
    private BlogDao blogDao;
    @Autowired
    private Cloudinary cloudinary;
    public String uploadFile(MultipartFile file){
        if (file==null||file.isEmpty()){
            return "";
        }
        String fileName=file.getOriginalFilename();
        if (fileName!=null&&fileName.contains(".")){
            fileName=fileName.substring(0,fileName.lastIndexOf("."));
        }
        Map cloudParam= ObjectUtils.asMap("public_id",fileName);
       Map cloudResult=null;
       try {
           cloudResult=cloudinary.uploader().upload(file.getBytes(),cloudParam);
       }catch (Exception e){
           e.printStackTrace();
       }return cloudResult.get("url").toString();
    }
    public List<Blog> findAllWithPagination(int page,int size){
        return blogDao.findAllWithPagination(page,size);
    }

}
