
package com.coderbd.Dao;


import com.coderbd.pojo.Sales;
import java.util.List;


public interface SalesDao {
    void createTable();
    void save(Sales s);
    void update(Sales s);
    void getSalesBySalesNO(int id);
    
    
    
    List<Sales>getList();
}
