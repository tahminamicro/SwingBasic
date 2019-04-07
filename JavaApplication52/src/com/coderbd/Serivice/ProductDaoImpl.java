package com.coderbd.Serivice;

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
Connection conn = CustomDBConnection.getDBConnection();

  
    @Override
    public void createTable() {
       String sql= "create table product(id int(11) primary key auto_increment, p_name varchar(50), stock int(9), price double)";
       
    try {
     PreparedStatement ps=conn.prepareStatement(sql);
        ps.execute();
        System.out.println("Table Created");
    } catch (SQLException ex) {
        Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    @Override
    public void save(Product p) {
       String sql= " insert into product(p_name,Stock,price) values(?,?,?)";
    try {
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, p.getProductName());
        pstm.setInt(2, p.getStock());
        pstm.setDouble(2, p.getPrice());
        pstm.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    @Override
    public void update(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getProductByProductID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getProductByProductName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getList() {
        List<Product>list = new ArrayList<>();
         String sql="Select * from product";
    try {
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
        Product product = new Product(rs.getInt(1),rs.getString(2), rs.getInt(3),rs.getDouble(4));
        list.add(product);
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
        return list;
    }
     
}
