/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package income.tax;
import java.util.Scanner;
/**
 *
 * @author aamir7110
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        //variable declaration
        
        double income, taxBracket1,taxBracket2,taxBracket3,taxBracket4,taxBracket5, totalTax;
        
        System.out.println("Enter Your Income");
        income = keyedInput.nextDouble();
        
        taxBracket1 = income - 46605;
        
        taxBracket2 = taxBracket1 - 46603;
        
        taxBracket3 = taxBracket2 - 51281;
        
        taxBracket4 = taxBracket3 - 61353;
        
        taxBracket5 = taxBracket4 - 205842;
        
       final double TAX1 = 46605*0.15;
       final double TAX2 = 46603*0.205;
       final double TAX3 = 51281*0.26;
       final double TAX4 = 61353*0.29;
       final double TAX5 = 205842*0.33;
       
       totalTax = income - TAX1+TAX2+TAX3+TAX4+TAX5;
       
        System.out.println("Total Tax is:$"+totalTax);
       
       //this is probably totally wrong
         
        
        
        
    }
    
}
