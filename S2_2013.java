/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package seniorcompetitionpracitce;

import java.util.*;

/**
 *
 * @author aryangulati
 */
public class Main {
    
    //Senior 2013 S2
    
    public static boolean valid(int start, int end, int[] array, int weight){
        
        int totalWeight = 0;
        
        if (start >= array.length)
            return false;
        
        else {
            
            for (int i = start; i <= end && i < array.length; i++){
            
                totalWeight = totalWeight + array[i];
            
            
            }
        
            return totalWeight <= weight;
        }
    }
    
     public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         
         int capacity = scanner.nextInt();
         int numberOfCars = scanner.nextInt();
         int[] carWeights = new int[numberOfCars];
         
         
         //Load data
         for (int i = 0; i < carWeights.length; i++){
             
             carWeights[i] = scanner.nextInt();
            
         }
       
         int start = 0;
         int end = 0;
         boolean valid = true;
         
         while(valid){
             
             valid = valid(start, end, carWeights, capacity);
             
             if (valid && end < carWeights.length){
                end++;
             
                if ((end - start) >= 3)
                     start++;
             }
             
             if (!(end < carWeights.length))
                 valid = false;
         }
         
         System.out.println(end);
         
         
     }
    
}
