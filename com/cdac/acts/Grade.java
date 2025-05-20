package com.cdac.acts;

import java.util.Scanner;

public class Grade {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Declare variables
        String name;
        int marks;
        String grade;

        // Input for name
        System.out.println("Enter the Name: ");
        name = sc.nextLine();
       
        // Input for marks
        System.out.println("Enter the Marks: ");
        marks = sc.nextInt();
       
        // Determine the grade based on marks
        if (marks < 35) {
            grade = "FAIL";
        } else if (marks <= 50) {
            grade = "Pass Class";
        } else if (marks <= 60) {
            grade = "Second Class";
        } else if (marks <= 75) {
            grade = "First Class";
        } else {
            grade = "Distinction";
        }

        // Output the result
        System.out.println("Name: " + name + ", Marks: " + marks + ", Grade: " + grade);
       
        // Close the scanner
        sc.close();
    }
}