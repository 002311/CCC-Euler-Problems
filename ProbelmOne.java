/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler;

/**
 *
 * @author aryangulati
 */

//Project Euler Problem 1
public class ProjectEuler {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sum = 0;
        
        for (int i = 3; i < 1000; i++){
            
            if((i % 3 == 0) || (i % 5 == 0)){
                
                sum+= i;
                
            }
            
        }
        System.out.println(sum);
    }
    
    
}
