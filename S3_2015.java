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
public class S3_2015 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int gates = Integer.parseInt(input.nextLine());
        int planes = Integer.parseInt(input.nextLine());
        
        int[] gatesStatus = new int[gates];
        Arrays.fill(gatesStatus, 0);
        
        int[] planeRequirements = new int[planes];
        
        int linesRead = 0;
        
        while (linesRead < planes){
            
            planeRequirements[linesRead] = Integer.parseInt(input.nextLine());
            
            linesRead++;
        }
        
        
        int planesAllotted = 0;
        
        for (int i = 0; i < planeRequirements.length; i++){
            
            boolean allotted = false;
            
            for (int j = planeRequirements[i] - 1; j >= 0 ;j--){
                
                if (allotted)
                    break;
                
                if (gatesStatus[j] == 0){
                    gatesStatus[j] = 1;
                    allotted = true;
                    planesAllotted++;
                } 
            }
                
            if (!allotted)
                break;
        }
        
        System.out.println(planesAllotted);
    }
    
}
