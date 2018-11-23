
package cis104mmachineproject;


import java.io.*;

/**
 *  A Simple Philippine Income Tax and Take-Home Pay Calculator
 *  The program also includes Benefits Calculator (SSS, PAGIBIG, PhilHealth) 
 *  and TRAIN and PRE-Train Law tax comparison
 * 
 * Disclaimer: Intended for PRIVATE SECTOR EMPLOYEES only (excluding Self-employed)
 * 
 * @author/s: Bo Zhang, John Carlos Zuniga
 * Final Machine Project in partial fulfillment of the requirements for
 * CIS104M - Basic Programming
 * Term 1, AY 2018-19
 * De La Salle University - Manila
 * 
 */


public class Main {

    public static void main(String[] args) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        
        
        
    }
   
    
}

