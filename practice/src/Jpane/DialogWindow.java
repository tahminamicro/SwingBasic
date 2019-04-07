/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class DialogWindow {
    
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("download.jpg");
        JOptionPane.showMessageDialog(null, "Wrong PassWord", "Warning", JOptionPane.ERROR_MESSAGE,icon );
        
        
    }
}
