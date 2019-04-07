
package com.coderbd.evidence.service;

import com.coderbd.evidence.pojo.Student;
import java.util.List;


public interface CommonDao {
    void save(Student obj);
    void update(Student obj);
    void delete(Student obj);
    void deleteByID(int id);
    void getByID(int id);
    void createTable();
    
    List<Object> findAll();
}
