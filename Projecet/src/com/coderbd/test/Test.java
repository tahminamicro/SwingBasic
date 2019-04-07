
package com.coderbd.test;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.RoleDao;
import com.coderbd.service.RoleDaoImpl;


public class Test {
    public static void main(String[] args) {
       CustomDBConnection.getDBConnection();
        
        RoleDao roleDao = new RoleDaoImpl();
        roleDao.createTable();
    }
}
