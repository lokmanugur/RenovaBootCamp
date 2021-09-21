/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp;

import com.renova.bootcamp.view.MainFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ugur
 */
public class StartApplication {
    
    public static void main(String args[]) {
        RenovaBootCampTest.test();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog( null,ex.getMessage(), "Application Start Error", JOptionPane.ERROR_MESSAGE );
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            MainFrame.getInstance().setVisible(true);
        });
        
    }
}
