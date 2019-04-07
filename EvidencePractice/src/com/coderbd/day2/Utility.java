
package com.coderbd.day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Utility {
   

    public static void writeToFile(String filename, List<Evidence> evidence) {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("Created a new File");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Evidence s : evidence) {
           out.append(s.getName() + " , "+ s.getId() + " , "+ s.getGender() + " , "+ s.getCourse()+ " , "+ s.getRound() + " , "+ s.getComment()+ "\n");
            
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Could not Log !!!");
        }

    }

    public static void displayDatafromTable(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));

            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader Issue");
        }
    }
    
}
