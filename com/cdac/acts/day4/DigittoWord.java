package com.cdac.acts.day4;
import java.util.Scanner;

public class DigittoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0 to 1000000): ");
        int num = sc.nextInt();

        if (num < 0 || num > 1000000) {
            System.out.println("Number out of range!");
        } else if (num == 0) {
            System.out.println("Zero");
        } else if (num == 1000000) {
            System.out.println("Ten Lakh");
        } else {
            printNumber(num);
        }
    }

    static void printNumber(int num) {
        if (num >= 100000) {
            int lakh = num / 100000;
            printOneDigit(lakh);
            System.out.print(" Lakh ");
            num = num % 100000;
        }

        if (num >= 1000) {
            int thousand = num / 1000;
            printTwoDigit(thousand);
            System.out.print(" Thousand ");
            num = num % 1000;
        }

        if (num >= 100) {
            int hundred = num / 100;
            printOneDigit(hundred);
            System.out.print(" Hundred ");
            num = num % 100;
        }

        if (num > 0) {
            System.out.print("and ");
            printTwoDigit(num);
        }
    }

    static void printOneDigit(int num) {
        switch (num) {
            case 1: System.out.print("One"); break;
            case 2: System.out.print("Two"); break;
            case 3: System.out.print("Three"); break;
            case 4: System.out.print("Four"); break;
            case 5: System.out.print("Five"); break;
            case 6: System.out.print("Six"); break;
            case 7: System.out.print("Seven"); break;
            case 8: System.out.print("Eight"); break;
            case 9: System.out.print("Nine"); break;
        }
    }

    static void printTwoDigit(int num) {
        if (num < 10) {
            printOneDigit(num);
        } else if (num >= 10 && num < 20) {
            switch (num) {
                case 10: System.out.print("Ten"); break;
                case 11: System.out.print("Eleven"); break;
                case 12: System.out.print("Twelve"); break;
                case 13: System.out.print("Thirteen"); break;
                case 14: System.out.print("Fourteen"); break;
                case 15: System.out.print("Fifteen"); break;
                case 16: System.out.print("Sixteen"); break;
                case 17: System.out.print("Seventeen"); break;
                case 18: System.out.print("Eighteen"); break;
                case 19: System.out.print("Nineteen"); break;
            }
        } else {
            int tens = num / 10;
            int ones = num % 10;

            switch (tens) {
                case 2: System.out.print("Twenty"); break;
                case 3: System.out.print("Thirty"); break;
                case 4: System.out.print("Forty"); break;
                case 5: System.out.print("Fifty"); break;
                case 6: System.out.print("Sixty"); break;
                case 7: System.out.print("Seventy"); break;
                case 8: System.out.print("Eighty"); break;
                case 9: System.out.print("Ninety"); break;
            }

            if (ones != 0) {
                System.out.print(" ");
                printOneDigit(ones);
            }
        }
    }
}

