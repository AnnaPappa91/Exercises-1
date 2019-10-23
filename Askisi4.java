/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi4;

/**
 *
 * @author Άννα
 */
public class Askisi4 {
    
    

    
    public static void main(String[] args) {
        String fullName=myMethod("anna"," pappa");
        System.out.println(fullName);
        
    }
    public static String myMethod(String fname,String lname){
        String fullname=fname.concat( lname);
        return fullname.toUpperCase();
                
        
    }
    
}
