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
public class S4_2011 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String stockString = input.nextLine();
        String requiredString = input.nextLine();
        
        String [] stockArray = stockString.split(" ");
        String[] requiredArray = requiredString.split(" ");
        int[] stock = new int[stockArray.length];
        int[] requirements = new int[requiredArray.length];
        
        for (int i = 0; i < stockArray.length; i++){
            stock[i] = Integer.parseInt(stockArray[i]); 
            requirements[i] = Integer.parseInt(requiredArray[i]);
        }
        
        int[] positiveStock = new int[4];
        int[] negativeStock = new int[4];
        int[] positiveRequired = new int[4];
        int[] negativeRequired = new int[4];
        
        int index = 0;
        
        for (int i = 0; i < 4; i++){
            
            positiveStock[i] = stock[index + 1];
            negativeStock[i] = stock[index];
            positiveRequired[i] = requirements[index + 1];
            negativeRequired[i] = requirements[index];
            index+=2;
        }
        
        int patientCount = 0;
        
        for (int i = 0; i < 4; i++){
            
            if(positiveStock[i] >= positiveRequired[i]){
                
                positiveStock[i] = positiveStock[i] - positiveRequired[i];
                positiveRequired[i] = 0;
            }
            
        }
        
    }
    
}
