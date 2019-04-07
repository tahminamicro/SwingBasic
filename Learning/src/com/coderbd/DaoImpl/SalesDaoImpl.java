/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.DaoImpl;

import com.coderbd.Dao.SalesDao;
import com.coderbd.conn.CustomDBConnection;
import com.coderbd.pojo.Sales;
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
public class SalesDaoImpl implements SalesDao{
    public static void main(String[] args) {
        SalesDaoImpl obj= new SalesDaoImpl();
    obj.createTable();
    }
    
Connection conn= CustomDBConnection.getDBConnection();
    @Override
    public void createTable() {
        String sql="Create table sales(id int(11) auto_increment primary key,p_name varchar(50),p_code varchar(50),qty int(11),u_price double, total_price double, s_date date,p_id int(11),FOREIGN KEY (p_id) REFERENCES product(id))";
    try {
        PreparedStatement pstm= conn.prepareStatement(sql);
        pstm.execute();
        System.out.println("Created");
    } catch (SQLException ex) {
        Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void save(Sales ps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sales getProductSalesById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sales getProductSalesByProductCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sales> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
