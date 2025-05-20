package com.cdac.acts.Day12;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
public class AccountMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Account> account = new ArrayList<Account>();
		
		int choice = 0;

		do {
			System.out.println("\n========= Account Menu =========");
			System.out.println("1. Add account");
			System.out.println("2. Print all accounts");
			System.out.println("3. Sort by account no desc");
			System.out.println("4. Sort by accName");
			System.out.println("5. Sort by Date of opening");
			System.out.println("6. Sort by balance desc");
			System.out.println("0. Exit");
			System.out.println("==============================");
			System.out.print("Enter your choice: ");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				String addMoreOption;
				do {
				System.out.println("Enter AccNo: ");
				int accno = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter AccName: ");
				String accname = sc.nextLine();
				
				System.out.println("Enter Date: ");
				String date = sc.nextLine();
				
				System.out.println("Enter balance: ");
				int bal = sc.nextInt();
			    sc.nextLine(); // 🛠️ important: consume leftover newline
				
				account.add(new Account(accno, accname, LocalDate.parse(date),bal));
				
				System.out.print("Do you want to add more accounts? (Y/N): ");
				addMoreOption = sc.nextLine();
				
			} while (addMoreOption.equalsIgnoreCase("Y"));
				
			break;	
			case 2:
				for(Account acc:account) {
					System.out.println(acc);
				}
			break;
			case 3: 
				System.out.println("accNo Descending");
				Collections.sort(account, new SortByAccNo());
				
				for(Account acc:account) {
					System.out.println(acc);
				}
			case 4:
				System.out.println("accName sorted");
				Collections.sort(account);
				
				for(Account acc:account) {
					System.out.println(acc);
				}
				break;
				
			case 5:
				System.out.println("date sorting");
				Collections.sort(null);
				
				for(Account acc:account) {
					System.out.println(acc);
				}
				break;
			case 6:
				System.out.println("Bal Sorted ");
				Collections.sort(account,new SortByBalanceDesc());
				
				for(Account acc:account) {
					System.out.println(acc);
				}
				
				break;
				}
			}while(choice!=0);		
	}
}

