package by.epam.tr.task5;

import java.util.*;

public class Solution40 {
    
    public static void main(String[] args) {
        
        int n;
        
        try(Scanner sc = new Scanner(System.in)) {        
            
            System.out.println("What size do you want the matrix to be?");
            
            
            do {
                
                System.out.print("You can only enter whole odd numbers: n = ");
                
                
                while(!sc.hasNextInt()) {
                    
                    sc.next();
                    
                      System.out.print("You can only enter whole odd numbers: n = ");
                
                }
                
                n = sc.nextInt();
            }
            
            while(n % 2 == 0);
                                                
        }
        
        System.out.println();
        
        
        
		      int[][] ar = new int[n][n];
		      
        
        int count = 1;
        
        int i = 0;
        
        int j = ar.length/2;
        
        while (true){
            
            ar[i][j] = count;

            count++;
            
            if (((i == 0) && (j >= n-1)) && (ar[n-1][0] != 0)) {
                
                i++;
                
            }
            
            else {
                
                i--;
                
                if (i < 0) {
                    
                    i = n - 1;
                    
                }
                
                j++;
                
                if (j == n) {
                    
                    j = 0;
                    
                }
                
                if(ar[i][j] != 0) {
                    
                    i += 2;
                    
                    j--;
                    
                }
                
            }         

            if(count == n * n + 1) {
                
                break;
                
            }
            
        }
        
        
	        for(int m = 0; m < ar.length; m++) {
	            
	           for(int k = 0; k < ar[m].length; k++) {
	               
	               System.out.printf("[%3d]", ar[m][k]);
	               
	               }
	               
	               System.out.println("\n");
	   
	           }
     
    }
        	
}