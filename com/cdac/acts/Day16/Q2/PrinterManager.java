package com.cdac.acts.Day16.Q2;

import java.io.*;
import java.util.*;

public class PrinterManager {
    private static final String FILE_NAME = "printers.dat";

    // Load printers from file into HashMap
    public static HashMap<String, Printer> loadPrinters() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new HashMap<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (HashMap<String, Printer>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new HashMap<>();
       }
    }

    // Save printers to file
    public static void savePrinters(HashMap<String, Printer> printerMap) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(printerMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Add a new printer
    public static void addPrinter(HashMap<String, Printer> printerMap, Printer printer) {
        printerMap.put(printer.getSerialNo(), printer);
        savePrinters(printerMap);
    }

    // Update printer price
    public static void updatePrinterPrice(HashMap<String, Printer> printerMap, String serialNo, double newPrice) {
        Printer printer = printerMap.get(serialNo);
        if (printer != null) {
            printer.setPrice(newPrice);
            savePrinters(printerMap);
            System.out.println("Price updated.");
        } else {
            System.out.println("Printer not found.");
        }
    }

    // Print all printers
    public static void printAllPrinters(HashMap<String, Printer> printerMap) {
        if (printerMap.isEmpty()) {
            System.out.println("No printers found.");
        } else {
            for (Printer p : printerMap.values()) {
                System.out.println(p);
            }
        }
    }
}
