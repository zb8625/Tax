
package cis104mmachineproject;


import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;



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
        
        
        
        
//        // Gets input from user
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Before we start, please enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("How much is your monthly income: ");
//        double income = sc.nextDouble();
//
//        String dependentChar;
//        int dependent;
//        
//        do {
//            System.out.println("How many dependents do you have (Maximum of 4 only): ");
//            dependentChar = sc.next();
//            dependent = Integer.parseInt(dependentChar);
//            
//        } while ( !isValidDependent(dependent) );
//            
//        System.out.println("Are you married? Type 'true' for Yes and 'false' for otherwise: ");
//        boolean civilStatus = sc.nextBoolean();
//        System.out.println("Type 'e' for employed and 'se' for self-employed: ");
//        String userStatus = sc.next();
//        sc.close();        
//        
//        // Creates new instance of IncomeTaxCalculator class
//        IncomeTaxCalculator user1 = new IncomeTaxCalculator(name,income,dependent,civilStatus,userStatus);
//        
//        // Limiting decimal places for double and float data types
//        DecimalFormat df = new DecimalFormat(".00"); // 2 decimal places
//        
//        // Variable holders for tax calculation fields to be displayed
//        
//        double exemption1 = user1.getDependentExemption();
//        double exemption2 = user1.getMarriedExemption();
//        double annualIncome = user1.calculateAnnualIncomeOld();
//        double annualTaxableIncomeNew = user1.calculateAnnualIncomeNew();
//        double annualTaxableIncomeOld = annualIncome - (exemption1 + exemption2);
//        double benefit1 = user1.getSSSDeduction();
//        double benefit2 = user1.getPAGIBIGDeduction();
//        double benefit3 = user1.getPhilHealthDeduction();
//        double total_benefit = benefit1 + benefit2 + benefit3;
//        double monthlyTaxDueNew = user1.getAnnualIncomeTaxNew(annualTaxableIncomeNew) / 12;
//        double monthlyTaxDueOld = user1.getAnnualIncomeTaxOld(annualTaxableIncomeOld) / 12;
//        double takeHomePayNew = income - (monthlyTaxDueNew + total_benefit);
//        double takeHomePayOld = income - (monthlyTaxDueOld + total_benefit);
//        double taxSavings = monthlyTaxDueOld - monthlyTaxDueNew;
//        
//        
//        
//        // Display results (Test)
//        System.out.println("Hi " + user1.getName());
//        System.out.println("Your Annual Taxable Income under TRAIN is P" + annualTaxableIncomeNew);
//        System.out.println("Your Annual Taxable Income before TRAIN is P" + annualTaxableIncomeOld);
//  
//        System.out.println("Your Monthly SSS Contribution is P" + df.format(benefit1));
//        System.out.println("Your Monthly PAGIBIG Contribution is P" + df.format(benefit2));
//        System.out.println("Your Monthly PhilHealth Contribution is P" + df.format(benefit3));
//        System.out.println("Your total benefit contribution is P" + df.format(total_benefit));
//        
//        
//        System.out.println("Your TRAIN monthly tax due is P" + df.format(monthlyTaxDueNew));
//        System.out.println("Your OLD monthly tax due is P" + df.format(monthlyTaxDueOld));
//        System.out.println("You have a tax savings of P" + df.format(taxSavings));
//        
//        System.out.println("Your Net Take Home Pay (TRAIN) is P" + df.format(takeHomePayNew));
//        System.out.println("Your Net Take Home Pay (OLD) is P" + df.format(takeHomePayOld));
        
    }
    
//    // Method for catching correct input for user dependents field
//    private static boolean isValidDependent (int userInput){  
//        if (userInput > 4){
//            System.out.println("You can only have a maximum of 4 dependents!");
//            return false;
//        }
//        else
//            return true;
//        }
   
    
}

