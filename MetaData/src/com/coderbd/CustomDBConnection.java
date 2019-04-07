
package com.coderbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CustomDBConnection {
    public static  Connection conn = null;
    
    public static Connection getDBConnection(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mySQL","root", "1234");
            System.out.println("Connected");
            return conn;
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomDBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return null;
    }
}