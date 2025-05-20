//Create Enum for course separately with values as DAC, DESD,
//DVLSI. Use Course Enum and Date of Birth in Student class.
//Sort student by Date of Birth using after/before methods of
//java.util.Date/java.time.LocalDate

package com.cdac.acts.Day7;
import java.time.LocalDate;

enum Courses{
   	DAC,
   	DESD,
   	DVLSI;
    }

public class Student {
	private String name;
	private Courses courses;
	private LocalDate dob;
	
	public Student(){}

	public Student(String name, Courses courses, LocalDate dob ) {
		this.name = name;
		this.courses = courses;
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", courses=" + courses + ", dob=" + dob + "]";
	}

	public LocalDate getdob() {
		return dob;
	}
		
	static Student[] arr  = new Student[3];
	
	public static void main(String[] args) {
		
		arr[0] = new Student("Ram",Courses.DAC,LocalDate.of(2003,02,12));
		arr[1] = new Student("Ramesh",Courses.DESD,LocalDate.of(2013,11,15));
		arr[2] = new Student("Ram",Courses.DVLSI,LocalDate.of(2024,07,9));
//		Student.Sortbydate();
		

		Sortbydate();
		
		  for (Student student : arr) {
	            if (student != null) {
	                System.out.println(student);
	            }
	        }
	    }
	
	
	public static void Sortbydate() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].getdob().isAfter(arr[j].getdob())) {
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
		
		
		
		
	}
	
	

	


