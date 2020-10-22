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
public class S2_2018 {
    
    public static boolean valid(int[][] data, int dataSize){
        
       // System.out.println("Data to check as recieved: " + Arrays.deepToString(data));

        
        boolean valid = true;
        int[][] test = data;
        
        for (int i = 0; i < dataSize; i ++){
            
            int temp = test[i][0];
            
            for (int j = 1; j < dataSize; j++){
                
                valid = test[i][j] > temp;
                
                if(valid)
                    temp = test[i][j];
                else
                    break;
            }
            
            if (!valid)
                break;
            
        }
        
        if(valid){
            
            int [] initial = new int[dataSize];
            
            for (int i = 0; i < dataSize; i++){
                
                initial[i] = data[i][0];
                
            }
            
            int temp = initial[0];
            
            for (int i = 1; i < initial.length; i++){
                
                valid = initial[i] > temp;
                
                if (valid)
                    temp = initial[i];
                else
                    break;
            }
             
        }
        //System.out.println("Data to check as sent: " + Arrays.deepToString(data));
        
        return valid;
    }
    
    public static int[][] rotate(int[][] data, int dataSize) {
        
        int[][] flippedData = new int[dataSize][dataSize];
        
        int arrayNumber = 0;
        int elementNumber = 0;
        
       // System.out.println(dataSize - 1);
        
        
        for (int i = dataSize -1; i >= 0 ; i = i - 1){
            
            for (int j = 0; j < dataSize; j++){
                
                //System.out.println(data[arrayNumber][elementNumber]);
                flippedData[j][i] = data[arrayNumber][elementNumber];
                elementNumber++;
                if (j == dataSize - 1)
                    elementNumber = 0;
                
            }
            
            arrayNumber++;
        }
        
        //System.out.println("Flipped Data: " + Arrays.deepToString(data));
        return flippedData;
        
    }
    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int dataSize = Integer.parseInt(input.nextLine());
        int[][] data = new int[dataSize][dataSize];
        int linesTaken = 0;
        
        while (linesTaken < dataSize){
            
            String line = input.nextLine();
            String[] lineSplit = line.split(" ");
            int[] row = new int[lineSplit.length];
            
            for (int i = 0; i < row.length; i ++){
                
                row[i] = Integer.parseInt(lineSplit[i]);
                
            }
            data[linesTaken] = row;             
            linesTaken++;
        }
        
        //System.out.println("Initial Data: " + Arrays.deepToString(data));

        
        
        //System.out.println(Arrays.deepToString(rotate(data, dataSize)));
        
       // System.out.println(Arrays.toString(selectionSort(new int[] {1,2,3,4})));
        
        boolean valid = valid(data, dataSize);
        
        int numRotations = 0;
        
        while(!valid && numRotations < 10){
            
            data = rotate(data, dataSize);
            valid = valid(data, dataSize);
            
            
            numRotations++;
        }
        
        //System.out.println("Flipped Data as recieved: " + Arrays.deepToString(data));
        
        for (int i = 0; i < dataSize; i ++){
            
            String row = "";
            for (int dataPoint : data[i]){
                row += String.valueOf(dataPoint) + " ";
            }
                
            System.out.println(row);
            
        }
    }
    
}
