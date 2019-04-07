/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.Serivice;

import com.coderbd.Dao.SalesDao;
import com.coderbd.conn.CustomDBConnection;
import com.coderbd.pojo.Customer;
import com.coderbd.pojo.Product;
import com.coderbd.pojo.Sales;
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
public class SalesDaoImpl implements SalesDao{
Connection conn = CustomDBConnection.getDBConnection();
    public static void main(String[] args) {
        SalesDaoImpl s= new SalesDaoImpl();
        s.createTable();
    }

    @Override
    public void createTable() {
        String sql= "create table sales(s_no int(11) primary key auto_increment, c_id int(11),FOREIGN KEY (c_id) REFERENCES customer(id), p_id int(11), FOREIGN KEY (p_id) REFERENCES product(id), quantity int(9), price double)";
       
    try {
     PreparedStatement ps=conn.prepareStatement(sql);
        ps.execute();
        System.out.println("Table Created");
    } catch (SQLException ex) {
        Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    @Override
    public void save(Sales s) {
     String sql="insert into sales(c_id,p_id, quantity,price) values(?,?,?,?)";
    try {
        PreparedStatement pstm= conn.prepareStatement(sql);
        pstm.setInt(1, s.getCustomerId().getCustomerId());
        pstm.setInt(2, s.getProductID().getProductID());
        pstm.setInt(3, s.getQuantity());
        pstm.setDouble(4, s.getPrice());
    } catch (SQLException ex) {
        Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void update(Sales s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSalesBySalesNO(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sales> getList() {
      
     List<Sales> list= new ArrayList<>();
     String sql= "Select * from sales";
    try {
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
        Sales sales = new Sales(rs.getInt(1), new Customer(rs.getInt(2)), new Product(rs.getInt(3)), rs.getInt(4), rs.getDouble(5));
        list.add(sales);
        }
    } catch (SQLException ex) {
        Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
     
     return list;
    }
    
}
