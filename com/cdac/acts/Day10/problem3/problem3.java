package com.cdac.acts.problem3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*
Assignment 2:
Create an ArrayList of 10 double numbers. 
Calculate sum of all numbers and print.
Accept these numbers form user using do while loop.
Try indexOf, lastIndexOf methods of ArrayList and go through Java doc
for ArrayList methods 
 */
public class problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> nums = new ArrayList<Double>();
		Double sum;
		double input=0;
		do {
			System.out.println("Enter positive number you want to add or enter negative number to exit");
			input= sc.nextDouble();
			nums.add((Double)input);
			
		}while(input>0);
		nums.remove(nums.size()-1);
		System.out.println("nums size "+nums.size());
		System.out.println("printing elements");
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		Double tt = (Double)32.00;
		System.out.println("index of : "+nums.indexOf(tt));
		System.out.println("Last index of : "+nums.lastIndexOf(tt));
	}
}
