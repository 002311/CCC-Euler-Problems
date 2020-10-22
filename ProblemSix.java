/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler;

/**
 *
 * @author aryangulati
 */
public class ProblemSix {
    
    
    public static void main(String[] args){
        
        int[] squares = new int[100];
        int[] numbers = new int[100];
        
        for (int i = 0; i < 100; i ++){
            
            int j = i + 1;
            numbers[i] = j;
            squares[i] = (j * j);
            
        }
        
        int sumNumbers = 0;
        int sumSquares = 0;
        
        for (int number : numbers){
            
            sumNumbers += number;
            
            
        }
        sumNumbers = sumNumbers * sumNumbers;
        for (int square : squares){
            
            sumSquares += square;
            
        }
        
        System.out.println(sumNumbers-sumSquares);
        
        
    }
        
        
    
}
