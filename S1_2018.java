/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seniorcompetitionpracitce;
import java.util.*;
import java.text.*;
/**
 *
 * @author aryangulati
 */
public class S1_2018 {
    
 public static double[] selectionSort(double[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            double smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
        
        return arr;
    }
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int numLines = Integer.parseInt(input.nextLine());
        double[] street = new double[numLines];
        
        int linesRead = 0;
        
        while(linesRead < numLines){
            
            street[linesRead] = Double.parseDouble(input.nextLine());
            linesRead++;
            
        }
        street = selectionSort(street);
        
        
        double[] neighborhoodSizes = new double[street.length - 2];
        
        int index = 0;
        
        for (int i = 1; i < street.length - 1; i++){
            
            
            double lower = (street[i] - street[i-1])/2;
            double upper = (street[i + 1] - street[i])/2;
            
            neighborhoodSizes[index] = lower + upper;
            index++;
        }
        
        

        
        neighborhoodSizes = selectionSort(neighborhoodSizes);
        DecimalFormat decimalFormat = new DecimalFormat(".#");
        String result = decimalFormat.format(neighborhoodSizes[0]);
        
        System.out.println(result);
        
    }
    
    
}
