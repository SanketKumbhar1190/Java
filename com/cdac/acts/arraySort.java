package com.cdac.acts;
	import java.util.Scanner;

	public class arraySort {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int[] arr = new int[10];
	        
	        // Input from user
	        System.out.println("Enter 10 numbers:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        // Bubble Sort
	        for (int i = 0; i < arr.length - 1; i++) { // Number of passes
	            for (int j = i+1; j < arr.length - 1 ; j++) { // Compare adjacent elements
	                if (arr[i] > arr[j]) {
	                    // Swap
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        
	        // Output the sorted array
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        
	        sc.close();
	    }
	}



