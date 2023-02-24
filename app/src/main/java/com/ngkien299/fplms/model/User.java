package com.ngkien299.fplms.model;

public class User {
    private String userTokenId;
    private String email;
    private String name;
    private boolean isLecture;

    public User() {
    }

    public User(String userTokenId, String email, String name, boolean isLecture) {
        this.userTokenId = userTokenId;
        this.email = email;
        this.name = name;
        this.isLecture = isLecture;
    }

    public String getUserTokenId() {
        return userTokenId;
    }

    public void setUserTokenId(String userTokenId) {
        this.userTokenId = userTokenId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLecture() {
        return isLecture;
    }

    public void setLecture(boolean lecture) {
        isLecture = lecture;
    }
}
