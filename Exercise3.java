/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * aCreate a program that calculates the annual salary. 
    Monthly salary is 900$. Government taxes you 9%. 
    How much do you / government get each month / year?nd open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Άννα
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int monthlySalary=900;
        double governmentTaxes=0.09;
        double netmonthlySalary=900-(900*0.09);
        double annualSalary=12*netmonthlySalary;
        double governmentsTaxes=12*(900*0.09);
        System.out.println("Your net monthly salary in your pocket is: "+netmonthlySalary+ "dollars");
        System.out.println("Your annual salary is: "+ annualSalary+ "dollars");
        System.out.println("Government takes from your money "+ governmentsTaxes+ "dollars");
        
        // TODO code application logic here
    }
    
}
