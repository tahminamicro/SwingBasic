/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.Role;
import com.coderbd.pojo.User;

/**
 *
 * @author User
 */
public interface LoginDao {
    User findByUsernameAndPassword(String username, String password, Role role);
}
