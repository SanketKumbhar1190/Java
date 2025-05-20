package com.cdac.acts.day4;

public class OverloadedStatic {

    // Method to print an array of integers
    public static void printArray(int[] arr) {
        System.out.print("Integer Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line after printing the array
    }

    // Method to print an array of strings
    public static void printArray(String[] arr) {
        System.out.print("String Array: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println(); // New line after printing the array
    }

    public static void main(String[] args) {
        // Example arrays
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World", "Java"};

        // Calling the overloaded methods
        printArray(intArray);      // Calls the method for integers
        printArray(stringArray);   // Calls the method for strings
    }
}