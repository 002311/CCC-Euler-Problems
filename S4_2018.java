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
public class S4_2018 {
    
    public static int infinity = -1;
    
    public static int arrangements(int weight, int[]computedValues){
        
        if (weight == 1)
            return 1;
        if(computedValues[weight - 1] != infinity)
            return computedValues[weight -1];
        
        int[] possibleSubTreeNumber = new int[weight - 1];
        
        for (int i = 0; i < weight - 1; i++){
            
            possibleSubTreeNumber[i] = i + 2;
        }
        
        int[] subTreeWeight = new int[possibleSubTreeNumber.length];
        
        for (int i = 0; i < possibleSubTreeNumber.length; i ++){
            
            int value = (int) weight/possibleSubTreeNumber[i];
            
            if (value * possibleSubTreeNumber[i] > weight)
                value -=1;
            
            if ((value + 1) * possibleSubTreeNumber[i] <= weight)
                value += 1;
            
            subTreeWeight[i] = value;
            
            
        }
        
        
        int possibilities = 0;
        
        for (int w : subTreeWeight){
            
            possibilities += arrangements(w, computedValues);
            
            
        }
        computedValues[weight -1] = possibilities;
        
        //System.out.println(Arrays.toString(computedValues));
        
        return possibilities;
    }
    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int weight = Integer.parseInt(input.nextLine());
        
        int[] computedValues = new int[weight];
        
        for (int i = 0; i < weight; i++){
            
            computedValues[i] = infinity;
        }
        
        System.out.println(arrangements(weight, computedValues));
        
        
    }
    
    
    
}
