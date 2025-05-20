//Create association  between Employee and Address class. Create address reference in Employee class and Print Employee. 
//Override toString() in Address and Employee

package com.cdac.acts.Day6;
import java.util.Arrays;


public class Employee {
	int empid;
	String empName;
	int empSalary;
	Address ad;

	Employee(){}
	
	Employee(int empid,String empName,int empSalary,Address ad){
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
		this.ad=ad;
	}
	
	
	
	
@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + ", ad=" + ad + "]";
	}

public static void main(String[] args) {
		
		Address a1 = new Address("pune",422010,"panchawati");
		System.out.println(a1);

		Employee e1 = new Employee(1,"Ramesh",50000,a1);
		System.out.println(e1);
	}
}
	
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
	
	
	
	


