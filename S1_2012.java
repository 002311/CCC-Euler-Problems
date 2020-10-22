/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seniorcompetitionpracitce;

import java.util.*;

/**
 *
 * @author aryangulati
 */
public class S1_2012 {
 
    public static int numerator(int initial){
        
        if (initial <= 2)
            return 0;
        else{
           return (initial * (initial - 1) * (initial - 2));

           
        }
        
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        
        
        int numerator = input - 1;
       
        
        int combinations = (numerator(numerator))/6;
        
        System.out.println(combinations);
        
        
    }
    
}
