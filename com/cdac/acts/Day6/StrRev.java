//Write a program to reverse as String.

package com.cdac.acts.Day6;
import java.util.Scanner;
public class StrRev {
	static Scanner sc = new Scanner(System.in);
     static String str = sc.nextLine(); 
     
     public static void main(String args[]) {
    	 
    	 for(int i = str.length()-1 ; i >= 0 ; i-- ) {
    		 System.out.print(str.charAt(i));
    	 }
     }
}

