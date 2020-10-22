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
public class S1_2011 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int numLines = Integer.parseInt(input.nextLine());
        
        String text = "";
        
        int scanned = 0;
        
        while(scanned < numLines){
            
            text += input.nextLine();
            scanned++;
            
        }      
        
        char[] characters = text.toLowerCase().toCharArray();
        
        int[] letters = new int[characters.length];
        
        for (int i = 0; i < letters.length; i++){
            
            letters[i] = (int) characters[i];
            
        }
        
        
        int sCount = 0;
        int tCount = 0;
        
        for (int letter : letters){
            
            if(letter == 115)
                sCount++;
            if(letter == 116)
                tCount++;
            
        }
           
        if (tCount > sCount)
            System.out.println("English");
        else
            System.out.println("French");
                  
        
    }
    
}
