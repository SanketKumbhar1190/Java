package com.cdac.acts.Day16.Q2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

//2) Create Printer class with serialNo, modelNo, price, printerType, manufacturingDate. 
//Create Enum for PrinterType with values as LASER, INKJET, DOTMATRIX.
//
//Store the printers objects in file using ObjectOutputStream. 
//On program startup read all printers from file and store them in HashMap where serialNo will be key and printer 
//object will be value.
//
//1.Add Printer
//2.Update Printer Price
//3.Print all Printers
public class PrinterTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Printer> printerMap = PrinterManager.loadPrinters();
        int choice;

        do {
            System.out.println("\n1. Add Printer");
            System.out.println("2. Update Printer Price");
            System.out.println("3. Print All Printers");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 : {
                    System.out.print("Enter Serial No: ");
                    String serial = sc.nextLine();
                    System.out.print("Enter Model No: ");
                    String model = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Printer Type (LASER/INKJET/DOTMATRIX): ");
                    PrinterType type = PrinterType.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("Enter Manufacturing Date (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());

                    Printer printer = new Printer(serial, model, price, type, date);
                    PrinterManager.addPrinter(printerMap, printer);
                    System.out.println("Printer added.");
                }
                break;

                case 2 : {
                    System.out.print("Enter Serial No: ");
                    String serial = sc.nextLine();
                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();
                    PrinterManager.updatePrinterPrice(printerMap, serial, newPrice);
                }
                break;
                
                case 3 : PrinterManager.printAllPrinters(printerMap);
                break;
                
                case 4 : System.out.println("Exiting...");
                break;
                
                default : System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}