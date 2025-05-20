//Write java program to call at least 10 different methods of String and StringBuilder class each.


//Write a program to find occurrence of  word is present in string.
//Write java program to format given mobile number to expected format as shown below.
//Expected output +91-988-162-8598
//Input +91-988-162-8598
//Input +919881628598
//Input 9881628598
//Input 988162859 Error for less than 10 char

package com.cdac.acts.Day6;


public class StringP {
	static String st = "CDAC ACTS";
	
	
	
	public static void stringmethods() {
		
		System.out.println(st.length());
		System.out.println(st.charAt(5));
		System.out.println(st.indexOf('C'));
		System.out.println(st.substring(0,4));
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		System.out.println(st.getClass());
		System.out.println(st.compareTo("EDAC"));
		System.out.println(st.equals("CDAC"));
		System.out.println(st.concat("PUNE"));
	}
	
	public static void main(String args[]) {
		stringmethods();
		
		
	}
	
}
