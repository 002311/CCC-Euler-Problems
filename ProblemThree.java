/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler;

import java.util.*;

/**
 *
 * @author aryangulati
 */
public class Problem3 {
    /*
    Approach:
    
    Check if the number is even. If so, continuously divide until an odd number is reached and count the number
    of 2s that were present in the factorization. Then, repeat the procedure starting w n = 3 for all odd numbers. 
    When an odd factor is found, check if the number is prime. If not, find the prime factorization of that number 
    and continue working with the remaining number. Keep repeating this process from n = 3 to n = sqrt(target). If no
    factors are found, target is prime. In this problem, the target (600851475143) is not prime so there must be a factor
    in the range 3 -> sqrt(600851475143). 
    
     */
    
    
    public static double gcd(double a, double b){
        
        if (b == 0)
            return a;
        
        double temp = b;
        b = a % b;
        a = temp;
        
        
        
        return gcd(a, b);
    }
    public static double decompose(double number){
        
        double temp = 1;
        int i = 0;
        
        while (number % 2 == 0){
            
            number = number/2;
            i++;
        }
        
        for (int j = 3; j < Math.sqrt(number); j+=2){
            
            if (number % j == 0)
                temp = j;
            
            
               
        }
        if (temp == 1)
            return number;
        
        return temp;
    }
    
    
    public static void main(String[] args){
        
        double number = 600851475143.0;
        ArrayList<Double> factors = new ArrayList<>();
        
        
        System.out.println(decompose(486847.0));
        
       // System.out.println(gcd(600851475143.0, 71.0));
    }
    
}
