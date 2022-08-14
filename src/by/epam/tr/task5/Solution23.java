package by.epam.tr.task5;

import java.util.*;

public class Solution23 {
    
    public static void main(String[] args) {
        
        
        int n;
        double [][] ar;
        
        try(Scanner sc = new Scanner(System.in)) {        
            
            System.out.println("What size do you want the matrix to be?");
                        
            System.out.print("You can only enter whole numbers: n = ");
                            
            while(!sc.hasNextInt()) {
                    
                sc.next();
                    
                System.out.print("You can only enter whole numbers: n = ");
                
            }
                
            n = sc.nextInt();
                                                
        }
        
        System.out.println();
        
        
        ar = new double[n][n];
        
        for(int i = 0; i < ar.length; i++) {
             
             for(int j = 0; j < ar[i].length; j++) {
                 
                 ar[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                 
             }
             
         }
         
        int count = 0;
         
        for(int i = 0; i < ar.length; i++) {
             
             for(int j = 0; j < ar[i].length; j++) {
                 
                 if(ar[i][j] >= 0) {
                     
                     count++;
                     
                 }
                 
                 System.out.printf("[%4.1f]",ar[i][j]);
                 
             }
             
             System.out.println("\n");
             
         }
         
         System.out.println("The number of positive array elements is: " + count);
        
    }
    
}