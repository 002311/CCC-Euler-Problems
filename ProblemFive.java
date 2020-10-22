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
public class ProblemFive {
    
    
    public static void main(String[] args){
        
      boolean divisible = false;
      int number = 2520;
      
      
      while (!divisible){
          divisible = true;
          
          
          for (int i = 2; i < 21; i++){
              
              divisible = (number % i) == 0;
              if (!divisible)
                  break;
              
          }
          
          number++;
      }
      
      System.out.println(number);
    }
    
}
