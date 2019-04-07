
package com.coderbd.dao;

import com.coderbd.pojo.User;
import java.util.List;


public interface UserDao1 {
    void createTable();
    void save(User user);
    void update(User user);
    void getUserId(int id);
    void getUserByUserName(String username);
    void delete(int id);
    
    List<User> getUser();
}
