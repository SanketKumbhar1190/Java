package com.cdac.acts.Day7;
import java.time.LocalDate;

import com.cdac.acts.Day7.Person;


public class Personmain {

	static Person[] arr = new Person[4];
	public static void main(String[] args) {
		
		Address a1 = new Address("pune",422010,"panchawati");
		Address a2 = new Address("pune",422022,"shivajinagar");
		Address a3 = new Address("pune",422001,"bhosari");
		Address a4 = new Address("pune",422005,"baner");
//		System.out.println(a1);

		arr[0] = new Person("512598203214","Ramesh",LocalDate.of(2003,02,12),a1);
		arr[1] = new Person("523498213214","Dogesh",LocalDate.of(2013,12,11),a2);
		arr[2] = new Person("673498213203","Suresh",LocalDate.of(1943,10,25),a3);
		arr[3] = new Person("979498213503","naresh",LocalDate.of(1910,11,10),a4);
		
		for(int i=0 ; i<=arr.length-1 ; i++ ) {
		System.out.println(arr[i]);
		}
		checkDate(arr);
		
	}
	public static void checkDate(Person[] arr) {
		LocalDate date1 = LocalDate.of(1945,8,15);
		for(int i=0;i<=arr.length-1;i++) {
			if( arr[i].getDob().isBefore(date1)) {
				System.out.println("before independence");
				System.out.println(arr[i]);
			}
			
			if (arr[i].isAbove100()) {
                System.out.println(arr[i].getName() + " is above 100 years old.");
            }
			
		}
		
	}
}
