
package com.coderbd.createtable;



import java.sql.Connection;


public class CreateEmployeeTable {
   public static void createEmployeeTable(){
   String sql ="Create table employee(id int(11) primary key auto_increment, name varchar(50) not null)";
   
   }
}
