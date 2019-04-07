/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;


public class User {
    private int id;
    private String fullName;
    private String UserName;
    private String password;
    private String mobile;
    private Role role;

    public User() {
    }

    public User(int id, String fullName, String UserName, String password, String mobile, Role role) {
        this.id = id;
        this.fullName = fullName;
        this.UserName = UserName;
        this.password = password;
        this.mobile = mobile;
        this.role = role;
    }

    public User(String fullName, String UserName, String password, String mobile, Role role) {
        this.fullName = fullName;
        this.UserName = UserName;
        this.password = password;
        this.mobile = mobile;
        this.role = role;
    }

   

    public int getId() {
        return id;
    }

    public User(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public Role getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
}
