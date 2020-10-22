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
public class S2_2011 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        
        int questions = Integer.parseInt(input.nextLine());
        
        String[] responses = new String[questions];
        String[] answers = new String[questions];
        
        
        int linesInput = 0;
        int answerIndex = 0;
        
        while (linesInput < (questions * 2)){
            
            if(linesInput < responses.length){
                
                responses[linesInput] = input.nextLine();
                
                
            } else{
                
                answers[answerIndex] = input.nextLine();
                
                answerIndex++;
            }
                    
                  
            linesInput++;
            
        }
        
        int score = 0;
        
        for (int i = 0; i < questions; i ++){
            
            if(Objects.equals(responses[i], answers[i])){
                
                score++;
                
            }
            
        }
        System.out.println(score);
        
    }
    
}
