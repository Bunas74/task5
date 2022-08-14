package by.epam.tr.task5;

import java.util.*;

public class Solution30 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        
        int[][] ar = new int[10][20];
        
        for(int i = 0; i < ar.length; i++) {
            
            for(int j = 0; j < ar[i].length; j++) {
                
                ar[i][j] = rand.nextInt(16);
                
            }
            
        }
        
        
        System.out.println("The resulting matrix:\n");
        
        for(int i = 0; i < ar.length; i++) {
            
            for(int j = 0; j < ar[i].length; j++) {
                
                System.out.printf("[%2d]", ar[i][j]);
                
            }
            
            System.out.println("\n");
            
        }
        
        
        List<Integer> index = new LinkedList<>();
        
        for(int i = 0; i < ar.length; i++) {
            
            int count = 0;
            
            for(int j = 0; j < ar[i].length; j++) {
                
                if(ar[i][j] == 5) {
                    
                    count++;
                    
                }                                           
                
            }
            
            if(count >= 3) {
                
                index.add(i);
                
            }
            
            
        }
        
        
        System.out.println("Line numbers in which the number 5 occurs three or more times is:\n");
        
        if(index.size() == 0) {
            
            System.out.println("There are no matches.");
            
        }
        
        else {
        
            for(int element: index) {
            
                System.out.printf("{%d}", element);
            
            }         
            
        }
        
    }
    
}