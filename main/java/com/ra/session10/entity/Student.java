package com.ra.session10.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message ="Khong duoc de trong")
    private String name;
    @NotNull(message ="Khong duoc de trong")
    @Email(message = "Khong dung dinh dang mail")
    private String email;
    @NotNull(message = "Khong duoc de trong")
    @Min(value = 0,message = "Diem phai lon hon 0")
    private Float ageMark;
    private  Boolean studying;
    //phai viet Boolean neu khong se bi loi @Data, khong tu sinh get,set

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getAgeMark() {
        return ageMark;
    }

    public void setAgeMark(Float ageMark) {
        this.ageMark = ageMark;
    }

    public Boolean getStudying() {
        return studying;
    }

    public void setStudying(Boolean studying) {
        this.studying = studying;
    }
}
