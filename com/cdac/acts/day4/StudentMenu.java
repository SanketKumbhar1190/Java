//1. Write a menu driven program to add Student objects in an array of students.
//1. Add Student
//2. Print Student by rollNo
//3. Print All students Sorted by Marks
//0. exit 

package com.cdac.acts.day4;

import java.util.Scanner;

public class StudentMenu {

    private int prnno;
    private String name;
    private int fees, mks;

    public StudentMenu(int prnno, String name, int fees, int mks) {
        this.prnno = prnno;
        this.name = name;
        this.fees = fees;
        this.mks = mks;
    }

    

    public int getMks() {
        return mks;
    }

//    @Override
//    public String toString() {
//        return "StudentMenu [prnno=" + prnno + ", name=" + name + ", fees=" + fees + ", mks=" + mks + "]";
//    }

    public void addStud(StudentMenu[] arr, int index) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prnno, name, fees, and marks:");
        int prn = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String sname = sc.nextLine(); // Read the name
        int fee = sc.nextInt();
        int mks = sc.nextInt();
        arr[index] = new StudentMenu(prn, sname, fee, mks);
    }

    public void sortStud(StudentMenu arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].getMks() < arr[j].getMks()) {
                    StudentMenu temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void menuD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        StudentMenu[] arr = new StudentMenu[n];
        int index = 0;
        int change;

        do {
            System.out.println("A menu driven program to add Student objects in an array of students. \n Select one of the following options:\n"
                    + "1. Add Student\n"
                    + "2. Print All Students\n"
                    + "3. Print All Students Sorted by Marks\n"
                    + "0. Exit");

            System.out.println("Enter the menu option:");
            change = sc.nextInt();

            switch (change) {
                case 1:
                    if (index < n) {
                        addStud(arr, index);
                        index++;
                    } else {
                        System.out.println("Array is full. Cannot add more students.");
                    }
                    break;

                case 2:
                    System.out.println("All Students:");
                    for (int i = 0; i < index; i++) {
                        System.out.println(arr[i]);
                    }
                    break;

                case 3:
                    sortStud(arr, index);
                    System.out.println("Students sorted by marks:");
                    for (int i = 0; i < index; i++) {
                        System.out.println(arr[i]);
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (change != 0);
    }

    public static void main(String[] args) {
        StudentMenu studentMenu = new StudentMenu(0, "", 0, 0);
        studentMenu.menuD();
    }
}