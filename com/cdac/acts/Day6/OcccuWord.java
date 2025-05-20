package com.cdac.acts.Day6;
import java.util.Scanner;

public class OcccuWord {
    static String str;
    static int count = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence:");
        str = sc.nextLine();

        System.out.println("Enter the word to find:");
        String find = sc.next();

        
        String[] words = str.split("\\s+");

        
        for (String word : words) {
            if (word.equals(find)) { 
                count++;
            }
        }

        System.out.println("The word '" + find + "' occurs " + count + " times in the sentence.");
        sc.close();
    }
}