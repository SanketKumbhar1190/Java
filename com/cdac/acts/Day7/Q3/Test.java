package com.cdac.acts.Day7.Q3;

import java.time.LocalDate;

import com.cdac.acts.Day7.Q3.Department;
import com.cdac.acts.Day7.Q3.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee emp1=new Employee(506, "Suyog", LocalDate.of(1990, 5, 20), LocalDate.of(2017, 4, 10), Department.MD);
       Employee emp2=new Employee(689, "Suyog", LocalDate.of(2002, 5, 20), LocalDate.of(2023, 8, 19), Department.PE);
       emp1.display();
       System.out.println("===============================================");
       emp2.display();
	}

}
