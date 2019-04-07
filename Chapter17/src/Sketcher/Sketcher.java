/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sketcher;

import java.awt.Dimension;
import static java.awt.SystemColor.window;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class Sketcher implements WindowListener{

    
    
   public static void main(String[] args) {
    SwingUtilities.invokeLater(
       new Runnable() {                          // Anonymous Runnable class object
                        public void run() {      // Run method executed in thread
                          creatGUI();            // Call static GUI creator
                        }
                      }       );
  }

  static void creatGUI() {
    window = new SketchFrame("Sketcher");        // Create the app window
    Toolkit theKit = window.getToolkit();        // Get the window toolkit
    Dimension wndSize = theKit.getScreenSize();  // Get screen size

    // Set the position to screen center & size to half screen size
    window.setBounds(wndSize.width/4, wndSize.height/4,        // Position
                      wndSize.width/2, wndSize.height/2);      // Size

    window.setVisible(true);
  }

  private static SketchFrame window;             // The application window

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Open");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("close");
    }

    @Override
    public void windowClosed(WindowEvent e) {
      
    }

    @Override
    public void windowIconified(WindowEvent e) {
       
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}

  