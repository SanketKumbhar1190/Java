package com.cdac.acts.Day7.Q3;

import java.time.LocalDate;
import java.time.Period;

import com.cdac.acts.Day7.Q3.Department;

public class Employee {
	
	private int empId;
	private String name;
	private LocalDate DOB;
	private LocalDate JOD;
	private Department department;

	
	public Employee(int empId, String name, LocalDate dOB, LocalDate jOD, Department department) {
		super();
		this.empId = empId;
		this.name = name;
		DOB = dOB;
		JOD = jOD;
		this.department = department;
	}

	public boolean checkGratuity() {
		LocalDate TodayDate=LocalDate.now();
		Period period=Period.between(JOD,TodayDate);
		return period.getYears()>=5;
		
		
	}
	
	public void display() {
		 System.out.println("Emp ID"+empId);
		 System.out.println("Employee Name"+name);
		 System.out.println("Date of Birth"+DOB);
		 System.out.println("Joining Date"+JOD);
		 System.out.println("Department"+department);
		 System.out.println("Gratuity present ? :"+(checkGratuity()?"YES":"NO"));
	}
	

}
