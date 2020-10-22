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
public class S4_2013 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String DataDetails = scanner.nextLine();
        
        String[] details = DataDetails.split(" ");
        int[] dataDetails = new int[details.length];
        
        for (int i = 0; i < details.length; i++){
            
            dataDetails[i] = Integer.parseInt(details[i]);
        }
        
        
        int[] data = new int[dataDetails[0]];
        
        Arrays.fill(data, 0);
        
        for (int i = 0; i < dataDetails[1]; i++){
            
            String inputDetails = scanner.nextLine();
            
            String[] dataPoint = inputDetails.split(" ");
            int[] dataPoints = new int[details.length];
        
            for (int j = 0; j < details.length; j++){
            
                dataPoints[j] = Integer.parseInt(dataPoint[j]);
            }
        
            int taller = dataPoints[0] - 1;
            int shorter = dataPoints[1] - 1;
            
            if (data[taller] > data[shorter]){
                
                //do nothing
            }
            
            if (data[taller] <= data[shorter]){
                
                data[taller] = data[shorter] + 1;
                
            }
            
            
        }
        
        String comparison = scanner.nextLine();
        String[] toCompare = comparison.split(" ");
        int[] compare = new int[toCompare.length];
        
        for (int i = 0; i < details.length; i++){
            
            compare[i] = Integer.parseInt(toCompare[i]);
        }
        
        
        int person = data[compare[0] - 1];
        int person2 = data[compare[1] - 1];
                
        System.out.println(Arrays.toString(data));

        if (person > person2)
            System.out.println("yes");
        
        if (person < person2)
            System.out.println("no");
        
        if (person == person2)
            System.out.println("unknown");
        
        
    }

}
