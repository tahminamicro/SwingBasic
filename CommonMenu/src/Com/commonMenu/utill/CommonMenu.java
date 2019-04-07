
package Com.commonMenu.utill;

import Com.commonMenu.About;
import Com.commonMenu.DashBoard;
import Com.commonMenu.Exit;
import Com.commonMenu.LogIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class CommonMenu {
    public static JMenuBar getCommonMenu(JFrame f){
    JMenuBar menuBar = new JMenuBar();
     JMenu file = new JMenu("File");
     
     JMenuItem itemDeshBoard = new JMenuItem("DashBoard");
     itemDeshBoard.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             f.setVisible(false);
             new DashBoard().setVisible(true);
         }  
    });
     
     
     JMenuItem itemAbout = new JMenuItem("About");
     itemAbout.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));
     itemAbout.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             f.setVisible(false);
             new About().setVisible(true);
         }  
    });
    
       JMenuItem itemExit = new JMenuItem("Exit");
     itemExit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             f.setVisible(false);
            new LogIn().setVisible(true);
           //System.exit(0);
         }  
    });
     
    
     JMenu help = new JMenu("Help");
     file.add(itemDeshBoard);
     file.add(itemAbout);
     file.add(itemExit);
     
     menuBar.add(file);
     menuBar.add(help);
     f.setJMenuBar(menuBar);
     f.setExtendedState(JFrame.MAXIMIZED_BOTH);
     
    return menuBar;
    }
}
