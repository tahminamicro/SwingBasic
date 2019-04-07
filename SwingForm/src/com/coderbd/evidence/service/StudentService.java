package com.coderbd.evidence.service;

import com.coderbd.evidence.connection.MySqlConnection;
import com.coderbd.evidence.pojo.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentService implements CommonDao {

    static Connection con = MySqlConnection.getDbConnection();

    @Override
    public void save(Student obj) {
         String sql = "insert into studentt(name, age, email, gender,course,round, msg) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.setInt(2, obj.getAge());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getGender());
            ps.setString(5, obj.getCourse());
            ps.setString(6, obj.getRound());
            ps.setString(7, obj.getMsg());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createTable() {

        String sql = "Create Table Studentt(id int(11) primary key auto_increment,name varchar(50) not null, age int(3),email varchar(50), gender varchar(50),course varchar(50), round varchar(50), msg varchar(50))";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Student Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    
    
    }
