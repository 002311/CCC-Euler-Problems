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
public class S5_2013 {
    
    public static ArrayList factors(int start){
        
        ArrayList<int[]> toReturn = new ArrayList<>();
        
        for (int i = 1; i <= (start); i++)
        
            if(start % i == 0){
            
                int[] temp = new int[] {i,(start/i)};
                
                toReturn.add(temp);
            
            }
        
        System.out.println(Arrays.deepToString(toReturn.toArray()));
        
        return toReturn;
    }
    
    
    
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int goal = scanner.nextInt();
        
        factors(goal);
        
        
        
    }
    
}
