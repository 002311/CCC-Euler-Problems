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
public class S1_2016 {
    
    
      public static int[] selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
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
        
        Scanner input = new Scanner(System.in);
        
        String first = input.nextLine();
        String second = input.nextLine();
        
       char[] firstCharacters = first.toCharArray();
       char[] secondCharacters = second.toCharArray();
       
       
      // System.out.println(Arrays.toString(firstCharacters));
      // System.out.println(Arrays.toString(secondCharacters));
       
       
       int[] asciiString = new int[firstCharacters.length];
       int[] asciiCompare = new int[secondCharacters.length];
       
       for (int i = 0; i < firstCharacters.length; i++){
           
           asciiString[i] = (int) firstCharacters[i];
           
       }
       
       for (int i = 0; i < secondCharacters.length; i++){
           
           asciiCompare[i] = (int) secondCharacters[i];
           
       }
       
      asciiCompare = selectionSort(asciiCompare);
      asciiString = selectionSort(asciiString);
      
      //System.out.println(Arrays.toString(asciiString));
      //System.out.println(Arrays.toString(asciiCompare));
      
      boolean same = true;
      
      
      for (int i = 0; i < asciiString.length && i < asciiCompare.length; i ++){
          
          if (!(asciiString[i] == asciiCompare[i] || asciiCompare[i] == (int) '*'))
              same = false ;
          
      }
      
      if (asciiString.length != asciiCompare.length)
          same = false;
      
      if(same)
          System.out.println("A");
      else
          System.out.println("N");

      
    }
    
   
}
