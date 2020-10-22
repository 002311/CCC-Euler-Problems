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
public class S5_2016 {
    
    public static int[]state(int[] initialStateArray){
        
        int[] output = new int[initialStateArray.length];
        
        for(int i = 0; i < initialStateArray.length; i++){
                
                
                int numNeighbors = 0;
                
                
                if(i == 0){
                    
                    if(initialStateArray[i + 1] == 1){
                        
                        numNeighbors += 1;
                    }
                    
                    if (initialStateArray[initialStateArray.length - 1] == 1)
                        numNeighbors += 1;
                }
                
                else if (i == initialStateArray.length - 1){
                    
                    if(initialStateArray[i - 1] == 1){
                        
                        numNeighbors += 1;
                    }
                    
                    if (initialStateArray[0] == 1)
                        numNeighbors += 1;
                    
                } else{
                    
                    if (initialStateArray[i + 1] == 1)
                        numNeighbors += 1;
                    
                    if (initialStateArray[i - 1] == 1)
                        numNeighbors += 1;
                    
                }
                  if (numNeighbors == 1){
                      
                      output[i] = 1;
                      
                  } else{
                      
                      output[i] = 0;
                  } 
               // System.out.println("Index: " + i + " " + "Neighbors: " + numNeighbors);
            }
        
        return output;
    }
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String[] dataInfo = input.nextLine().split(" ");
        
        long generations = Long.parseLong(dataInfo[1]); 
        
        String initialStateString = input.nextLine();
        
        int[] initialStateArray = new int[initialStateString.length()];
        
        for (int i = 0; i < initialStateString.length(); i++){
            
            initialStateArray[i] = Integer.parseInt(initialStateString.substring(i, i + 1));
            
        }
        
        int[] initialStateArrayOutput = new int[initialStateArray.length];
        
        //System.out.println(Arrays.toString(initialStateArray));
        long generation = 0;
        
        while(generation < generations){
            
            //System.out.println("Generation: " + String.valueOf(generation));
            
            initialStateArrayOutput = state(initialStateArray);
            initialStateArray = initialStateArrayOutput;
            
           /* System.out.println(Arrays.toString(initialStateArrayOutput));
            System.out.println(Arrays.toString(initialStateArray));*/
            generation++;
            
        }
        
        
        String print = "";
        for (int i = 0; i < initialStateArrayOutput.length; i ++){
            
            print += String.valueOf(initialStateArrayOutput[i]);
            
            
        }
        
        System.out.println(print);
        
    }
    
}
