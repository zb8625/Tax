/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oldtax;
import java.util.Scanner;
/**
 *
 * @author 86258
 */
public class OldTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Are you married? ");
            //Set a as the answer of user.
            String a = scan.nextLine();
            //Set d as discount of tax from married.
            int d;
            //catch answer from user
            switch (a) {
                case "yes":
                    d=50000;
                    break;
                case "Yes":
                    d=50000;
                    break;
                case "YES":
                    d=10000;
                    break;
                default:
                    d=0;
                    break;
            }
            System.out.println("How many chid do you have?");
            //set n as No. of dependent, c as discount from child
            int c;
            int n = scan.nextInt();
            
            if(0<=n && n<=4){
                c=25000*n;
            }else if(n>4){
                c=25000*4;
            }else{
                c=0;
            }
            
            
            System.out.print("Enter your monthly salry： ");
            double salary = scan.nextDouble();
            //set "s" as annual salary; "salary" as monthly salary
            double s;
            
            if (salary<=82000){
                s=salary*12-d-c;
            }else{
                s=salary*12+(salary-82000)-d-c;
            }
            if (s<=10000){
                System.out.println("Your old monthly tax is: "+ (s*0.05/12));
            }else if(s>10000 && s <=30000){
                System.out.println("Your old monthly tax is: "+ ((500+(s-10000)*0.10)/12));
            }else if (s> 30000 && s <=70000){
                System.out.println("Your old monthly tax is: "+((2500+(s-30000)*0.15)/12));
            }else if (s> 70000 && s <= 140000){
                System.out.println("Your old monthly tax is: "+((8500+(s-70000)*0.20)/12));
            }else if (s>140000 && s <= 250000){
                System.out.println("Your old monthly tax is: "+((22500+(s-140000)*0.25)/12));
            }else if(s>250000 && s <= 500000){
                System.out.println("Your old monthly tax is: "+((50000+(s-250000)*0.30)/12));
            }else{
                System.out.println("Your old monthly tax is: "+((125000+(s-500000)*0.32)/12));
            }
            /* set sn as annual salary**/
            double sn;
            if (salary <= 90000){
                sn=salary*12;
            }  else{
                sn=salary*12+(salary-90000);
            }
            
            if( sn <= 250000 ){
                System.out.print("Your new monthly tax is: "+ (sn * 0.0));
            }else if( sn > 250000 && sn <= 400000 ){
                System.out.print("Your new monthly tax is: "+((0.15*(sn-250000)))/12);
            }else if( sn>400000 && sn <=800000 ){
                System.out.print("Your new monthly tax is: "+((22500+0.2*(sn-400000)))/12);
            }else if( sn>800000 && sn<=2000000 ){
                System.out.print("Your new monthly tax is: "+((102500+0.25*(sn-800000)))/12);
            }else if( sn>2000000 && sn<=8000000 ){
                System.out.print("Your new monthly tax is: "+((402500+0.3*(sn-2000000)))/12);
            }else{
                System.out.println("Your New monthly tax is:"+((2202500+0.35*(sn-2000000)))/12);
            } }
    }
    
}
