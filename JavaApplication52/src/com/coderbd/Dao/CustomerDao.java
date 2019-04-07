
package com.coderbd.Dao;


import com.coderbd.pojo.Customer;
import java.util.List;


public interface CustomerDao {
    void createTable();
    void save(Customer c);
    void update(Customer c);
    void getCustomerBycustomerId(int id);
    void getCustomerByCustomerName(String name);
    void delete(int id);
    
    List<Customer>getList();
}
