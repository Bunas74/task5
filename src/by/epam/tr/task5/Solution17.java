package by.epam.tr.task5;

import java.util.*;

public class Solution17 {
    
    public static void main(String[] args) {
        
        int n;
        int[][] ar;
        
        try(Scanner sc = new Scanner(System.in)) {        
            
            System.out.println("What size do you want the matrix to be?");
            
            
            do {
                
                System.out.print("You can only enter whole even numbers: n = ");
                
                
                while(!sc.hasNextInt()) {
                    
                    sc.next();
                    
                      System.out.print("You can only enter whole even numbers: n = ");
                
                }
                
                n = sc.nextInt();
            }
            
            while(n % 2 != 0);
                                                
        }
        
        System.out.println();
        
        
        ar = new int[n][n];
        
        for(int i = 0; i < ar.length; i++) {
             
             for(int j = 0; j < ar[i].length; j++) {
                 
                 ar[0][j] = 1;
                 ar[ar.length - 1][j] = 1;
                 ar[i][0] = 1;
                 ar[i][ar[i].length - 1] = 1;
                     
             }
                 
         }
             
         
         
        for(int i = 0; i < ar.length; i++) {
             
             for(int j = 0; j < ar[i].length; j++) {
                 
                 System.out.print(ar[i][j] + " ");
                 
             }
             
             System.out.println();
             
         }
        
    }
    
}