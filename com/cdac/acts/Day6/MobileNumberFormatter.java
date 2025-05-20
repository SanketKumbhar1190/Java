////Write java program to format given mobile number to expected format as shown below.
////Expected output +91-988-162-8598
////Input +91-988-162-8598
////Input +919881628598
////Input 9881628598
////Input 988162859 Error for less than 10 char
//
//
//
package com.cdac.acts.Day6;

import java.util.Scanner;

public class MobileNumberFormatter {
	static String mno ;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mob no");
		mno=sc.nextLine();
		
		String countrycode = "+91";
		
		String digits = mno.replaceAll("[^0-9]", "");
				
		if(digits.length()<10) {
			System.out.println("please enter 10 or 12 digit mobile num ");
			mno=sc.nextLine();
		}
		else if(digits.length()==10)
		{
		String firstpart = mno.substring(0,3);
		String secondpart = mno.substring(3,6);
		String thirdpart = mno.substring(6,10);
		
		System.out.println(countrycode+"-" + firstpart + "-" + secondpart + "-" + thirdpart );
		}
		else if (digits.length()>10 && digits.length()==12) {

			//String firstpart = digits.substring(0,2);
			String secondpart = digits.substring(2,5);
			String thirdpart = digits.substring(5,8);
			String fourthpart = digits.substring(8,12);
			System.out.println(countrycode+"-" + secondpart + "-" + thirdpart + "-" + fourthpart );
			
		}
		else {
			System.out.println("please enter 10 or 12 digit mobile num ");
			mno=sc.nextLine();
		}
		sc.close();
	}

}



