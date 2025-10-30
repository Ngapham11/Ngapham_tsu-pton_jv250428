package com.ra.ss6.model.entity;

public class UserSession {
    private String userName;
    private String password;

    public UserSession() {
    }

    public UserSession(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
