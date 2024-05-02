package com.example.locationbasefire;

public class User {
    private String fullName;
    private String username;
    private String email;
    private String mobile;
    private String password;

    // Default constructor (required by Firebase)
    public User() {
    }

    // Parameterized constructor
    public User(String fullName, String username, String email, String mobile, String password) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }

    // Getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
