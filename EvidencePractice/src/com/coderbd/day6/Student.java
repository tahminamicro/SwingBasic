
package com.coderbd.day6;


public class Student {
    private int id;
    private String name;
    private String gender;
    private String round;

    public Student(int id, String name, String gender, String round) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.round = round;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRound() {
        return round;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Student() {
    }
    
    
}
