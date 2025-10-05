package com.ra.test.model.dto;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
import java.time.LocalDate;

public class BlogDto {
private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotBlank(message = "Khong duoc de trong")
    private String title;
    @NotBlank(message = "Khong duoc de trong")
    private String content;
    @NotBlank(message = "Khong duoc de trong")
    private String author;
    private boolean status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createdDate;
    private MultipartFile avatar;

    public BlogDto() {
    }

    public BlogDto( String title, String content, String author, boolean status, LocalDate createdDate, MultipartFile avatar) {

        this.title = title;
        this.content = content;
        this.author = author;
        this.status = status;
        this.createdDate = createdDate;
        this.avatar = avatar;
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }
}
