package com.cdac.acts.Day18;
//Stream API assignments
//1) Create MobilePhone  class with serialNo, brand, os, color, price, ram etc. Store in list and use 
//  partitionedBy method to separate Android  and IOS phones.
//2) Use comparing and thenComparing methods to sort MobilePhones by color and weight
//3)	Convert the list of MobilePhones in set using Collect method.
//4)	Filter by every field
public class MobilePhone {

	private String serialNo;
	private String brand;
	private String OS;
	private String color;
	private int price;
	private int ram;
	
	public MobilePhone(String serialNo, String brand, String oS, String color, int price, int ram) {
		super();
		this.serialNo = serialNo;
		this.brand = brand;
		OS = oS;
		this.color = color;
		this.price = price;
		this.ram = ram;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "MobilePhone [serialNo=" + serialNo + ", brand=" + brand + ", OS=" + OS + ", color=" + color + ", price="
				+ price + ", ram=" + ram + "]";
	} 
	
	
	
}
