
package com.coderbd.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Utility {
    public static void writeMethod(String filename, List<Student> students){
    File destFileile = new File(filename + ".txt");
        try {
             if(destFileile.exists()==false){
    destFileile.createNewFile();
    }
             
             PrintWriter out = new PrintWriter(new FileWriter(destFileile, true));
             
             for(Student s: students){
             out.append(s.getId()+" , "+s.getName()+" , "+s.getEmail()+" , "+s.getAge()+" , "+s.getGender()+" , "+s.getCourse()+" , "+s.getRound()+" , "+s.getComment()+"\n");
             }
             out.close();
        } catch (Exception e) {
        }
    }
    public static void readFromFile(String filename, DefaultTableModel model){
    String line;
    BufferedReader reader;
        try {
            reader= new BufferedReader(new FileReader(filename+ ".txt"));
            while((line=reader.readLine())!=null){
            model.addRow(line.split(" , "));
            }
        } catch (Exception e) {
        }
    
    }
    
   

}