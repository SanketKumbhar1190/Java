package com.cdac.acts.Day9;
import java.time.LocalDate;
import java.util.Scanner;

import com.cdac.acts.Day9.Account;
import com.cdac.acts.Day9.CurrentAccount;
import com.cdac.acts.Day9.DepositAccount;
import com.cdac.acts.Day9.SavingAccount;
public class AccountMain  {
	
	 static Scanner sc = new Scanner(System.in);
	 static Account[] accounts = new Account[10]; // Array to hold accounts
     static int index = 0; // To track the number of accounts created
     static int choice;

	public static void main(String[] args) {
	
		
		Account sa = new SavingAccount("Ramesh", LocalDate.of(2023, 10, 5),10000,5);
		Account ca = new CurrentAccount("Suresh", LocalDate.of(2022, 12, 15),20000);
		Account da = new DepositAccount("Dogesh", LocalDate.of(2020, 11, 25),30000);
		
		
        System.out.println("Balance after deposit: " + sa.deposite(500));
        System.out.println("Balance after withdrawal: " + sa.withdraw(100));
//      System.out.println("Balance after withdrawal: " + ca.withdraw(100));
        
        double maturityAmount = sa.calculateMatutyAmount(sa.getBalance());
        System.out.println("Maturity amount: " + maturityAmount);        
        
        double maturityAmount1 = ca.calculateMatutyAmount(ca.getBalance());
        System.out.println("Maturity amount: " + maturityAmount1);
		
	}
}
     





















//        Account[] accounts = new Account[10]; // Array to hold accounts
//        int index = 0; // To track the number of accounts created
//        int choice;
//
//        do {
//            System.out.println("Menu:");
//            System.out.println("1. Create Saving Account");
//            System.out.println("2. Create Current Account");
//            System.out.println("3. Create Deposit Account");
//            System.out.println("4. Display Accounts");
//            System.out.println("5. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//            sc.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1: SavAcc();
//                    
//                    break;
//                case 2: CurrAcc();
//                    
//                    break;
//                    
//                case 3: DepAcc();
//                    
//                    break;
//                    
//                case 4:
//                    displayAccounts(accounts, index);
//                    break;
//                case 5:
//                    System.out.println("Exiting...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        } while (choice != 5);
//
//        sc.close();
//    }
//
//	public static void SavAcc() {
//		System.out.print("Enter account name: ");
//		String nam = sc.nextLine();
//		
//		System.out.print("Enter date of opening (YYYY-MM-DD): ");
//		String dateInput = sc.nextLine();
//                
//        System.out.print("Enter initial balance: ");
//        int bal = sc.nextInt();
//        if (index < accounts.length) {
//        accounts[index++] = new SavingAccount(nam,LocalDate.parse(dateInput),bal);
//        } else {
//            System.out.println("Account array is full.");
//        }
//	}
//	
//	public static void CurrAcc() {
//		System.out.print("Enter account name: ");
//		String nam = sc.nextLine();
//		
//		System.out.print("Enter date of opening (YYYY-MM-DD): ");
//		String dateInput = sc.nextLine();
//                
//        System.out.print("Enter initial balance: ");
//        int bal = sc.nextInt();
//        if (index < accounts.length) {
//        accounts[index++] = new CurrentAccount(nam,LocalDate.parse(dateInput),bal);
//	} else {
//        System.out.println("Account array is full.");
//    }
//	}
//	
//	public static void DepAcc() {
//		System.out.print("Enter account name: ");
//		String nam = sc.nextLine();
//		
//		System.out.print("Enter date of opening (YYYY-MM-DD): ");
//		String dateInput = sc.nextLine();
//                
//        System.out.print("Enter initial balance: ");
//        int bal = sc.nextInt();
//        if (index < accounts.length) {
//        accounts[index++] = new DepositAccount(nam,LocalDate.parse(dateInput),bal);
//	} else {
//        System.out.println("Account array is full.");
//    }
//	}
//	   
//
//    private static void displayAccounts(Account[] accounts, int count) {
//        if (count == 0) {
//            System.out.println("No accounts to display.");
//            return;
//        }
//        System.out.println("Accounts:");
//        for (int i = 0; i < count; i++) {
//            System.out.println(accounts[i]);
//            System.out.println("Interest: " + accounts[i].applyInterest());
//        }
//    }
	

