
package com.coderbd.createtable;

import com.coderbd.connection.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateDepartmentTable {
    static Connection con = MySqlConnection.getDbConnection();
    
    public static void createDepartmentTable(){
    String sql ="Create table Department(id int(11) primary key auto_increment, name varchar(50) not null)";
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Department Table Created");
            
        } catch (SQLException ex) {
            Logger.getLogger(CreateStudentTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
