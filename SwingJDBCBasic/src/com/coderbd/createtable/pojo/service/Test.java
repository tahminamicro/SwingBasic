/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.createtable.pojo.service;

import com.coderbd.createtable.pojo.Student;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Tahmina");
        
        Student s2 = new Student();
        s2.setName("Sumaiya");
        
        CommonDao commonDao = new StudentService();
        commonDao.save(s1);
        commonDao.save(s2);
    }
}
