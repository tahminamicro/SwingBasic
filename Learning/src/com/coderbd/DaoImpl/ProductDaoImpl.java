/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.DaoImpl;

import com.coderbd.Dao.ProductDao;
import com.coderbd.conn.CustomDBConnection;
import com.coderbd.pojo.Product;
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
public class ProductDaoImpl implements ProductDao{
    
    public static void main(String[] args) {
        ProductDaoImpl obj= new ProductDaoImpl();
        obj.createTable();
    }
Connection conn= CustomDBConnection.getDBConnection();
    @Override
    public void createTable() {
     String sql= "Create table product(id int(11) auto_increment primary key, p_name varchar(50),p_code varchar(50), qty int(11), u_price double, total_price double, date date)";
     
    try {
        PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.execute();
        System.out.println("Created");
    } catch (SQLException ex) {
        Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void save(Product p) {
        String sql= "insert into product(p_name, p_code, qty, u_price, total_price, date) values(?,?,?,?,?,?)";
    try {
        PreparedStatement pstm= conn.prepareStatement(sql);
        pstm.setString(1, p.getProductName());
        pstm.setString(2, p.getProductCode());
        pstm.setInt(3, p.getQty());
        pstm.setDouble(4, p.getUnitPrice());
        pstm.setDouble(5, p.getTotalPrice());
        pstm.setDate(6, p.getDate());
        pstm.executeUpdate();
        
        System.out.println("Success");
    } catch (SQLException ex) {
        Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    @Override
    public void update(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductById(int id) {
       throw new UnsupportedOperationException("Not supported yet."); //
    }

    @Override
    public Product getProductByProductCode(String code) {
       Product product= null;
      String sql="select * from product where product_code=?";
      
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, code);
            ResultSet rs= pstm.executeQuery();
            while(rs.next()){
            Product p= new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7));
           
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      return product;
}
    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getList() {
        List<Product> list = new ArrayList<>();
        String sql=" Select * from  product";
        try {
            PreparedStatement pstm= conn.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
            while(rs.next()){
            Product p= new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7));
            list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
