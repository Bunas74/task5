package by.epam.tr.task5;

import java.util.*;

public class Solution28 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        
        int n = rand.nextInt(10) + 1;
        
        int[][] ar = new int[n][n];
        
        for(int i = 0; i < ar.length; i++) {
            
            for(int j = 0; j < ar[i].length; j++) {
                
                ar[i][j] = rand.nextInt(100);
                
            }
            
        }
        
        
        System.out.println("The resulting matrix:\n");
        
        for(int i = 0; i < ar.length; i++) {
            
            for(int j = 0; j < ar[i].length; j++) {
                
                System.out.printf("[%3d]", ar[i][j]);
                
            }
            
            System.out.println("\n");
            
        }
        
        
        int[] arSum = new int[n];
        
        System.out.println("Sum of column elements:\n");
        
        for(int j = 0; j < ar.length; j++) {
            
            int sum = 0;
            
            for(int i = 0; i < ar.length; i++) {
                
                sum += ar[i][j]; 
                
                arSum[j] = sum;         
                
            }
            
            System.out.printf("{%3d}", sum);
            
        }
        
        System.out.println("\n");
        
        
        int max = arSum[0];
        
        int index = 0;
        
        for(int i = 0; i < arSum.length; i++) {
            
            if(arSum[i] > max) {
                
                max = arSum[i];
                
                index = i;
                
            }
            
        }
        
        System.out.println("The maximum sum of the matrix columns max = " + max+ " is in the column with the index " + index);
        
    }
    
}