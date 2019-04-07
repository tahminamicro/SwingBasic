/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.Dao;

import com.coderbd.pojo.Sales;
import java.util.List;

/**
 *
 * @author User
 */
public interface SalesDao {
     void createTable();

    void save(Sales ps);   

    Sales getProductSalesById(int id);

    Sales getProductSalesByProductCode(String code);   

    List<Sales> getList();
}
