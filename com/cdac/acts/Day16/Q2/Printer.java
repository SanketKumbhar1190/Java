package com.cdac.acts.Day16.Q2;

import java.io.Serializable;
import java.time.LocalDate;

//2) Create Printer class with serialNo, modelNo, price, printerType, manufacturingDate. 
//Create Enum for PrinterType with values as LASER, INKJET, DOTMATRIX.
//
//Store the printers objects in file using ObjectOutputStream. On program startup read all printers from file and store them in HashMap where serialNo will be key and printer object will be value.
// 
// 1.Add Printer
// 2.Update Printer Price
// 3.Print all Printers
public class Printer implements Serializable {

	private static final long serialVersionUID = -6015965015761730489L;
	private String serialNo;
    private String modelNo;
    private double price;
    private PrinterType printerType;
    private LocalDate manufacturingDate;

    public Printer(String serialNo, String modelNo, double price, PrinterType printerType, LocalDate manufacturingDate) {
        this.serialNo = serialNo;
        this.modelNo = modelNo;
        this.price = price;
        this.printerType = printerType;
        this.manufacturingDate = manufacturingDate;
    }

    // Getters and Setters
    public String getSerialNo() 
    { 
    	return serialNo; 
    	}
    public String getModelNo() { return modelNo; }
    public double getPrice() { return price; }
    public PrinterType getPrinterType() { return printerType; }
    public LocalDate getManufacturingDate() { return manufacturingDate; }

    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Printer{" +
                "serialNo='" + serialNo + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", price=" + price +
                ", printerType=" + printerType +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}
