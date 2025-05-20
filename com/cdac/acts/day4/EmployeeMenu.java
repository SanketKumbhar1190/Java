package com.cdac.acts.day4;

import java.util.Scanner;

class EmployeeMenu {  // Same class
	
	int empId;
    String name;
    double salary;

    EmployeeMenu() {}  // default constructor

    EmployeeMenu(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    Scanner sc = new Scanner(System.in);  // Now NO static
    EmployeeMenu[] employees = new EmployeeMenu[100];  // NO static
    int count = 0;  // NO static

    void menu() {
        int choice;
        do {
            System.out.println("\n----- Employee Menu -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Print Employee by EmpID");
            System.out.println("3. Print All Employees Sorted by Salary");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    printEmployeeByEmpId();
                    break;
                case 3:
                    printAllEmployeesSortedBySalary();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }

    void addEmployee() {
        if (count >= employees.length) {
            System.out.println("Employee list is full!");
            return;
        }
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        employees[count++] = new EmployeeMenu(empId, name, salary);
        System.out.println("Employee Added Successfully!");
    }
    
    void printEmployee() {
        System.out.println("EmpID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }

    void printEmployeeByEmpId() {
        System.out.print("Enter Employee ID to search: ");
        int empId = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].empId == empId) {
                employees[i].printEmployee();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + empId + " not found.");
        }
    }

    void printAllEmployeesSortedBySalary() {
        if (count == 0) {
            System.out.println("No Employees to Display.");
            return;
        }

        // Simple Bubble Sort by Salary
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (employees[j].salary > employees[j + 1].salary) {
                    EmployeeMenu temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        System.out.println("\nEmployees sorted by salary:");
//        for (int i = 0; i < count; i++) {
//            employees[i].printEmployee();
//        }
        
        
    }
    
    public static void main(String[] args) {
        EmployeeMenu obj = new EmployeeMenu();  // create object
        obj.menu();  // call non-static menu method
    }

}
