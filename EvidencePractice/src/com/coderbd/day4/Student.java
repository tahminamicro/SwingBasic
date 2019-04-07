
package com.coderbd.day4;


public class Student {
    private String name;
    private int id;
    private String email;

    public Student(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    
}
