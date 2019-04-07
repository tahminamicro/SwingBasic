/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.Serivice;

import com.coderbd.Dao.CustomerDao;
import com.coderbd.conn.CustomDBConnection;
import com.coderbd.pojo.Customer;
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
public class CustomerDaoImpl implements CustomerDao{
Connection conn = CustomDBConnection.getDBConnection();
    public static void main(String[] args) {
        CustomerDaoImpl c = new CustomerDaoImpl();
         c.createTable();
    }

    @Override
    public void createTable() {
        
        String sql= "create table customer(id int(11) primary key auto_increment, c_name varchar(50),address varchar(50))";
       
    try {
     PreparedStatement ps=conn.prepareStatement(sql);
        ps.execute();
        System.out.println("Table Created");
    } catch (SQLException ex) {
        Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void save(Customer c) {
    
        String sql = " insert into customer(c_name, address) values(?,?))";
        
    try {
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, c.getCustomerName());
        pstm.setString(2, c.getAddress());
        pstm.executeUpdate();
        System.out.println("Insert Success");
    } catch (SQLException ex) {
        Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    
    }

    @Override
    public void update(Customer c) {
        String sql = "update customer set c_name=? where id=?";
        
    try {
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, c.getCustomerName());
        pstm.setInt(2, c.getCustomerId());
        pstm.executeUpdate();
        System.out.println("Update Success");
    } catch (SQLException ex) {
        Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void getCustomerBycustomerId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCustomerByCustomerName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getList() {
        List<Customer> list = new ArrayList<>();
        String sql= "select & from customer";
    try {
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
        Customer customer= new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
        list.add(customer);
        
        }
    } catch (SQLException ex) {
        Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
        return list;
    }
    
}
