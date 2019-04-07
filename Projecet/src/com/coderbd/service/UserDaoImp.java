/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.service;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.UserDao1;
import com.coderbd.pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class UserDaoImp implements UserDao1{
Connection conn= CustomDBConnection.getDBConnection();
    public static void main(String[] args) {
        UserDaoImp obj= new UserDaoImp();
        obj.createTable();
    }
    @Override
    public void createTable() {
        String sql="Create table user1(id int(11), fullname varchar(50),password varchar(50))";
        
    try {
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.execute();
        System.out.println("Table Created");
    } catch (SQLException ex) {
        Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void save(User user) {
        String sql="insert into user1(id, fullname, password) values(?,?,?)";
    try {
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, user.getId());
        pstm.setString(2, user.getFullName());
        pstm.setString(3, user.getPassword());
        
        pstm.executeUpdate();
        System.out.println("Insert Success");
    } catch (SQLException ex) {
        Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getUserId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getUserByUserName(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
