/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.createtable.pojo.service;

import com.coderbd.connection.MySqlConnection;
import com.coderbd.createtable.pojo.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class StudentService implements CommonDao{
    Connection con= MySqlConnection.getDbConnection();

    @Override
    public void save(Student obj) {
       String sql=" insert into student(name) values(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.executeUpdate();
            System.out.println("Data inserted Succesfully");
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  

    @Override
    public void deleteById(int id) {
       String sql = " delete from student where id =?";
        Student student = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Delete Success");
              
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    @Override
    public List<Object> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student obj) {
         String sql = "Update student set name = ? where id =?";
         PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.setInt(2, obj.getId());
            ps.executeUpdate();
            System.out.println("Update Success");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

    @Override
    public void delete(Student obj) {
        String sql = "delete Student where id =?";
          
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Delete Success");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Student getbyId(int id) {
          
        String sql = " Select * from student where id =?";
        Student student = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            student = new Student();
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }

    
    
}
