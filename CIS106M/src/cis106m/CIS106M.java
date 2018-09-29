/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis106m;

/**
 *
 * @author 86258
 */
import java.util.Scanner;
public class CIS106M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your monthly salry： ");
        double salary = scan.nextDouble();
        double tax;
        
            if (salary <= 90000){
                 tax=salary*12;
            }  else{
                 tax=salary*12+(salary-90000);
            }
        
          if( tax <= 250000 ){
         System.out.print("Tax is: "+ (tax * 0.0));
      }else if( tax > 250000 && tax <= 400000 ){
         System.out.print("Tax is: "+(0.15*(tax-250000)));
      }else if( tax>400000 && tax <=800000 ){
         System.out.print("Tax is: "+(22500+0.2*(tax-400000)));
      }else if( tax>800000 && tax<=2000000 ){
         System.out.print("Tax is: "+(102500+0.25*(tax-800000)));
      }else if( tax>2000000 && tax<=8000000 ){
         System.out.print("Tax is: "+(402500+0.3*(tax-2000000)));   
      }else{
          System.out.println("Tax is:"+(2202500+0.35*(tax-2000000)));
      }
    }
    scan.close();
}
