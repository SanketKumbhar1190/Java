//Write a program to find out if word is present in string.


package com.cdac.acts.Day6;
import java.util.Scanner;
public class FindWord {
	static String [] str = {"my","name","is","ram"};
	static boolean found = false;

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to find");
		String find = sc.next();
		

        for (String temp : str) {
            if (find.equals(temp)) { // Use .equals() to compare strings
                found = true;
                break; // Exit the loop if the word is found
            }
        }

        if (found) {
            System.out.println("The word '" + find + "' is present in the array.");
        } else {
            System.out.println("The word '" + find + "' is not present in the array.");
        }

		sc.close();

	}
	
		
	
}
