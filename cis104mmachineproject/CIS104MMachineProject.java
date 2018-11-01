
package cis104mmachineproject;


import java.util.Scanner;
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


public class CIS104MMachineProject {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your monthly income: ");
        double userIncome = sc.nextDouble();
        IncomeTaxCalculator user1 = new IncomeTaxCalculator(userIncome,3,true,"se", "John");
        
        System.out.println("Hi " + user1.getName());
        System.out.println("Your Monthly SSS Contribution is P" + user1.getSSSDeduction());
        System.out.println("Your Monthly PAGIBIG Contribution is P" + user1.getPAGIBIGDeduction());
        

    }
    
}
