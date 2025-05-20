package com.cdac.acts.Day14;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class LibraryTester {

	public static void main(String[] args) {
		HashMap<Integer, Library> hashMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int choice;

		Library l1 = new Library("History", BookType.History, 600, LocalDate.parse("2010-05-15"), "E.H. Gombrich", 3);
		Library l2 = new Library("Science", BookType.Science, 750, LocalDate.parse("2018-08-20"), "David J. Griffiths", 5);
		Library l3 = new Library("Math", BookType.Math, 300, LocalDate.parse("2015-03-10"), "Silvanus P. Thompson", 4);
		Library l4 = new Library("Geography", BookType.Geography, 450, LocalDate.parse("2012-11-30"), "John Smith", 2);
		hashMap.put(l1.getId(), l1);
		hashMap.put(l2.getId(), l2);
		hashMap.put(l3.getId(), l3);
		hashMap.put(l4.getId(), l4);

		do {
			System.out.println("Please enter choice \n"				
					+ "1 Display All books\r\n"
					+ "2 Allot book to student (quantity -1). Find by book title\r\n"
					+ "3 Take book return (quantity +1) Find by book title\r\n"
					+ "4 Remove book "
					+ "5 exit ");
			choice = sc.nextInt();
			sc.nextLine();

			switch(choice) {

			case 1 : 
				System.out.println(hashMap);
				break;
			case 2 :  
				System.out.print("Enter book title to allot: ");
				String title = sc.nextLine();
				bookAllot(hashMap, title);
				break;
			case 3:
				System.out.print("Enter book title to return: ");
				String title1 = sc.nextLine();
				returnBook(hashMap,title1);
				break;
			case 4:
				System.out.print("Enter book title to delete: ");
				String title2 = sc.nextLine();
				removeBook(hashMap, title2);				
			}
		}	while(choice!=5);
	}
	
	public static void bookAllot(HashMap<Integer, Library> hashMap, String title)  {
		for (Library book : hashMap.values()) {
			if (book.getTitle().trim().equalsIgnoreCase(title.trim())) {
				if (book.getQty() > 0) {
					book.setQty(book.getQty() - 1);
					System.out.println("Book allotted: " + book);
					return;
				} else {
					System.out.println("Book is out of stock.");
					return;
				}
			}
		}
	}

	public static void returnBook(HashMap<Integer, Library> hashMap, String title1) {
		for(Library book : hashMap.values()) {
			if (book.getTitle().trim().equalsIgnoreCase(title1.trim())) {
				book.setQty(book.getQty() + 1);
				System.out.println("Book Returned " + book);
				return;
			}
		}
	}

	public static void removeBook(HashMap<Integer, Library> hashMap, String titleToRemove) {
		Integer keyToRemove = null;
		for (Entry<Integer, Library> entry : hashMap.entrySet()) {
			if (entry.getValue().getTitle().equalsIgnoreCase(titleToRemove)) {
				keyToRemove = entry.getKey();
				break;
			}
		}
		if (keyToRemove != null) {
			hashMap.remove(keyToRemove);
			System.out.println("Book removed successfully.");
		} else {
			System.out.println("Book not found.");
		}
	}
}





























































































































