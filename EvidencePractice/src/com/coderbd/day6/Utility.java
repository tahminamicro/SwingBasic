/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day6;

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
public class Utility {
    public static void writeM(String filename, List<Student> students){
    File destFile = new File(filename + ".txt");
        try {
            if(destFile.exists()==false){
                System.out.println("Create a New File");
                destFile.createNewFile();
            }
            
            PrintWriter out= new PrintWriter(new FileWriter(filename, true));
            for(Student s: students){
            out.append(s.getId()+ " , "+ s.getName()+ " , "+ s.getGender()+ " , "+ s.getRound()+"\n");
            }
            out.close();
        } catch (Exception e) {
        }
    }
    
    public static void readM(String filename, DefaultTableModel model){
    String line;
    BufferedReader reader;
        try {
            reader= new BufferedReader(new FileReader(filename));
            while((line=reader.readLine())!=null){
            model.addRow(line.split(" , "));
            }
            reader.close();
        } catch (Exception e) {
        }
    }
}
