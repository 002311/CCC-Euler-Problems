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
public class ProblemTwo {
    
    public static void main(String[] args){
        
        int uOne = 1;
        int uTwo = 2;
        int sum = 0;
        
        
        while (uOne <= 4000000){
            
            if (uOne % 2 == 0)
                sum+= uOne;
            if (uTwo % 2 == 0)
                sum += uTwo;
            
            uOne = uOne + uTwo;
            uTwo = uTwo + uOne;
            
        }
     
        System.out.println(sum);
    }
    
}
