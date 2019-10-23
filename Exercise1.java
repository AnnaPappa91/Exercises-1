/*
 *Create a program that calculates when you were born. 
*Data given is the year we have and your age. Do this for 3 more people. 
*How old was each person in 1960 and how old will be in 2040?e 
 */
package exercise1;

/**
 *
 * @author Άννα
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int oldYear=1960;            
        int currentYear=2019;
        int currentAge=15;
        int futureAge=(2040-2019)+currentAge;
        
        
        int birthYear=currentYear-currentAge;
        System.out.println("You were born in "+birthYear);
        System.out.println("In 2040 you will be "+ futureAge);
        if(birthYear>oldYear){
            System.out.println("I wasn't born then!!!");
        }
        else
            System.out.println("In 1960 you were "+ (1960-(currentYear-currentAge))+" years old");
            
            
    }

}
    


    

