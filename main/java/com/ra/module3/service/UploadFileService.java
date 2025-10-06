package com.ra.module3.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class UploadFileService {
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
        Map CloudinaryParams= ObjectUtils.asMap("file_id",fileName);
        Map CloduiraryResult=null;
        try {
            CloduiraryResult=cloudinary.uploader().upload(file.getBytes(),CloudinaryParams);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return CloduiraryResult.get("url").toString();
    }
}
