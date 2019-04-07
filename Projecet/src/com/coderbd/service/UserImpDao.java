/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.service;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.UserDao1;
import com.coderbd.pojo.Role;
import com.coderbd.pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class UserImpDao implements UserDao1{
    Connection conn = CustomDBConnection.getDBConnection();
    public static void main(String[] args) {
        UserImpDao obj = new UserImpDao();
        obj.createTable();
    }
    
    @Override
    public void createTable() {
         String sql = "Create table IF NOT EXISTS user(id int(2) auto_increment primary key, full_name varchar(50), user_name varchar(50) unique, password varchar(30), mobile_no varchar(40), role_id int(2),FOREIGN KEY(role_id) REFERENCES role(id))";

        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void save(User user) {
         String sql = "insert into user(full_name, user_name, password, mobile_no, role_id) values(?,?,?,?,?)";

        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getFullName());
            pstm.setString(2, user.getUserName());
            pstm.setString(3, user.getPassword());
            pstm.setString(4, user.getMobile());
            pstm.setInt(5, user.getRole().getId());
            
            pstm.executeUpdate();
            System.out.println("Insert Success");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(User user) {
        String sql = "update  user set full_name=?, user_name=?, password=?, mobile_no=?, role_id=? where id = ?";

        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getFullName());
            pstm.setString(2, user.getUserName());
            pstm.setString(3, user.getPassword());
            pstm.setString(4, user.getMobile());
            pstm.setInt(5, user.getRole().getId());
            pstm.setInt(6, user.getId());
            
            pstm.executeUpdate();
            System.out.println("Update Success");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void getUserId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getUserByUserName(String username) {
        User user = new User();
        String sql= "Select * from user where user_name =?";
         try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
            user.setId(rs.getInt(1));
            user.setFullName(rs.getString(2));
            user.setUserName(rs.getString(3));
            user.setPassword(rs.getString(4));
            user.setMobile(rs.getString(5));
            user.setRole(new Role(rs.getString(6)));
            
            } 
        } catch (SQLException ex) {
            Logger.getLogger(UserImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getUser() {
     List<User> users = new ArrayList<>();
        User user;
        String sql =" Select * from user";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Role role= new Role(rs.getInt(6));
            user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), role);
            users.add(user);
         
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return users;
    }

   
        
    }

    