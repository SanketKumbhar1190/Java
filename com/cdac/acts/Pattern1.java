package com.cdac.acts;

public class Pattern1 {
	
	public static void pattern1(int n) {
		
		for(int i=1 ; i<=n ; i++) {
			
			for(int j=1 ; j<=n-i+1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args) {
		
		pattern1(5);
	}
}
