
package com.coderbd.evidence.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySqlConnection {
    
        public static Connection getDbConnection(){
    Connection connection = null;
     
        try {
            connection = DriverManager.getConnection("jdbc:mySql://localhost:3306/Swing", "root", "1234");
            System.out.println(":: Connected::");
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return connection;
    }
}
