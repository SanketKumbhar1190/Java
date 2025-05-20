//Create Person class with basic details like addharNumber, name,
//date of birth, address (use Address class for this). Find out
//whether the person is born before 15th August 1947. calculate
//person age and find out person age is above 100 years.

package com.cdac.acts.Day7;
import java.time.LocalDate;
import java.time.Period;

	class Address{
	String cityname;
	int pincode;
	String area;

	Address(){}

Address(String cityname, int pincode, String area){
	this.cityname = cityname;
	this.pincode = pincode;
	this.area = area;
}

@Override
	public String toString() {
	return "Address [cityname=" + cityname + ", pincode=" + pincode + ", area=" + area + "]";
}
}



public class Person {
	private String adhrno;
	private String name;
	private LocalDate dob;
	Address ad;
	
	public Person(){};
	
	public Person(String adhrno, String name, LocalDate dob, Address ad) {
		this.adhrno = adhrno;
		this.name = name;
		this.dob = dob;
		this.ad = ad;
	}
	
	

	public LocalDate getDob() {
		return dob;
	}
	
	public String getName() {
		return name;
	}
	
	 public int calculateAge() {
	        return Period.between(dob, LocalDate.now()).getYears();
	    }

	    public boolean isAbove100() {
	        return calculateAge() > 100;
	    }



	@Override
	public String toString() {
		return "Person [adhrno=" + adhrno + ", name=" + name + ", dob=" + dob + ", ad=" + ad + "]";
	}
}


