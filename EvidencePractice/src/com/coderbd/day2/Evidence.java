/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day2;

/**
 *
 * @author User
 */
public class Evidence {
    private  String name;
    private int id;
    private  String gender;
    private  String course;
    private  String round;
    private  String comment;

    public Evidence() {
    }

    public Evidence(String name, int id, String gender, String course, String round, String comment) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.course = course;
        this.round = round;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getRound() {
        return round;
    }

    public String getComment() {
        return comment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
 
    
}
