package by.epam.tr.task5;

import java.util.*;

public class Solution34 {
    
    public static void main(String[] args) {
        
        /* 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца. */
        
        
        Random rand = new Random();
        
        
        int m = rand.nextInt(10) + 1;
        
        int n = rand.nextInt(10) + 1;
        
        int[][] ar = new int[m][n];
        
        for(int i = 0; i < ar.length; i++) {
            
            for(int j = i+1; j < ar[i].length; j++) {
                
                ar[i][j] = 1;
                
            }
            
        }
        
        
        System.out.println("The resulting matrix:\n");
        
        for(int i = 0; i < ar.length; i++) {
            
            for(int j = 0; j < ar[i].length; j++) {
                
                System.out.printf("[%d]", ar[i][j]);
                
            }
            
            System.out.println();
            
        }
        
    }
    
}