
package com.coderbd.day8;


public class Student {
    private int id;
    private String name;
   private String email;
   private String gender;
   private String course;
   private String round;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
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

    public Student(int id, String name, String email, String gender, String course, String round) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.course = course;
        this.round = round;
    }
}
