package com.cdac.acts;
 
public class pattern4 {
 
    // Main Method
    public static void main(String[] args) {
         
        // Initializing required number of lines/rows
        int n = 5;
         
        // Upper half
        // Outer loop for the line/row change
        for(int i=n; i>=1; i--) {
             
            // Inner loop for the star printing
            for(int j=1; j<=i; j++) {
                 
                // Printing the star without changing the line
                System.out.print("*");
            }
             
            // Line/Row change
            System.out.println();
        }
         
        // Lower half
        // Outer loop for the line/row change
        for(int i=2; i<=n; i++) {
             
            // Inner loop for the star printing
            for(int j=1; j<=i; j++) {
                 
                // Printing the star without changing the line
                System.out.print("*");
            }
             
            // Line/Row change
            System.out.println();
        }
    }
 
}