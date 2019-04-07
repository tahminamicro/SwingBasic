
package com.coderbd.createtable.pojo.service;

import com.coderbd.createtable.pojo.Student;
import java.util.List;


public interface CommonDao {
    void save(Student obj);   //abstract method
    void update(Student obj);
    void delete(Student obj);
    void deleteById(int id);
    Student getbyId(int id);
    
    List<Object> findAll();
}
