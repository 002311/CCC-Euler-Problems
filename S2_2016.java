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
public class S2_2016 {
    
    
    public static int[] selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] > arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
        
        return arr;
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int maxMin = Integer.parseInt(scanner.nextLine());
        int numberOfPairs = Integer.parseInt(scanner.nextLine());
        
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        String input2 = scanner.nextLine();
        String[] numbers2 = input2.split(" ");
        
        int[] listOne = new int[numberOfPairs];
        int[] listTwo = new int[numberOfPairs];
        
        for (int i = 0; i < numbers.length; i ++){
            try{
            listOne[i] = Integer.parseInt(numbers[i]);
            listTwo[i] = Integer.parseInt(numbers2[i]);
            
            } catch (Exception e){
                
            }
        }
        
        int[] combined = new int[numberOfPairs * 2];
        
        int k = 0;
        
        for (int i = 0; i < listOne.length; i ++){
           
                combined[k] = listOne[i];
                combined[k + 1] = listTwo[i];
                k += 2;
           
            
        }
        
        if (maxMin == 2){
            
            //System.out.println("Pre-Sort: " + Arrays.toString(combined));
            combined = selectionSort(combined);
            int maxValue = 0;
            
            for (int j = 0; j < numberOfPairs; j++){
                
                maxValue += combined[j];
                 
            }
            //System.out.println("Post-Sort: " + Arrays.toString(combined));
            System.out.println(String.valueOf(maxValue));
            
        }
        
        else if (maxMin == 1){
            
            listOne = selectionSort(listOne);
            listTwo = selectionSort(listTwo);
            int minimumSum = 0;
            
            for (int i = 0; i < listOne.length; i++){
                
                if (listOne[i] > listTwo[i])
                    minimumSum += listOne[i];
                else
                    minimumSum += listTwo[i];
                
            }
            //System.out.println(Arrays.toString(listOne));
            //System.out.println(Arrays.toString(listTwo));
            System.out.println(minimumSum);
        }
    }
}
