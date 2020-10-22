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
public class S3_2016 {
    
    
    public static ArrayList<Integer> getNeighbors(int[][] adjacencyMatrix, int node){
        ArrayList<Integer> neighboors = new ArrayList<>();
        
        for(int i = 0; i < adjacencyMatrix[0].length; i++){
            
            if (adjacencyMatrix[node][i] == 1)
                neighboors.add(i);
            
        }
        
        return neighboors;
    }
    public static int[] distanceToAll(int[][] adjacencyMatrix, int startNode){
        
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        
        int[] distances = new int[adjacencyMatrix[0].length];
        Arrays.fill(distances, -1);
        distances[startNode] = 0;
        
        
        while(!queue.isEmpty()){
            
            int node = queue.poll();
            
            for(int neighboor : getNeighbors(adjacencyMatrix, node)){
                
                if(distances[neighboor] == -1){
                    distances[neighboor] = distances[node] + 1;
                    queue.add(neighboor);
                    
                }
             }
            
        }
     return distances;   
    }
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int[][] neighboors = new int[size][size];
        
        int linesRead = 0;
        
        while(linesRead < size - 1){
            
            String info = input.nextLine();
            String[] infoArray = info.split(" ");
            int[] details = new int[infoArray.length];
            
            for (int i = 0; i < details.length; i++){
                details[i] = Integer.parseInt(infoArray[i]);
            }
            
            neighboors[details[0]][details[1]] = 1;
            neighboors[details[1]][details[0]] = 1;
            linesRead++;
        }
        
        
        System.out.println(Arrays.toString(distanceToAll(neighboors, 0)));
    }
    
}
