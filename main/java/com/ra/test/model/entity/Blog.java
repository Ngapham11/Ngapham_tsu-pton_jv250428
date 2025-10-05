package com.ra.test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity


@Table(name="blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true,length = 200)
    private String title;
    @Column(nullable = false,columnDefinition = "text")
    private String content;
    @Column(nullable = false)
    private String author;
    private boolean status;
    private LocalDate createdDate;
    @Column(columnDefinition = "text")
    private String avatar;

    public Blog() {
    }

    public Blog(Long id, String title, String content, String author, boolean status, LocalDate createdDate, String avatar) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.status = status;
        this.createdDate = createdDate;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
