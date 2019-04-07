/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CallingMethod {
    public static void writeM(String filename, List<Student> students){
    File destFile = new File(filename+ ".txt");
    
        try {
            if(destFile.exists()==false){
            destFile.createNewFile();
            }
            
            PrintWriter out = new PrintWriter(new FileWriter(filename, true) );
            for(Student s: students){
            out.append(s.getId()+","+s.getName()+","+s.getEmail()+","+s.getGender()+","+s.getCourse()+","+s.getRound()+"\n");
            
            }
            out.close();
        } catch (Exception e) {
        }
    
    }
    
    public static void readM(String filename, DefaultTableModel model) {
        String liu;
        BufferedReader reader;
        try {
            reader= new BufferedReader(new FileReader(filename));
            while((liu=reader.readLine())!=null){
            model.addRow(liu.split(","));
            }
            reader.close();
        } catch (Exception e) {
        }
        
    }
}
