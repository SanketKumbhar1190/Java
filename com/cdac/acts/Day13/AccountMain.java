package com.cdac.acts.Day13;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccountMain {

	public static void main(String[] args) throws AccountNotFoundException, MinBalException {

		Scanner sc = new Scanner(System.in);
		List<Account> accounts = new CopyOnWriteArrayList<>();

		int choice;

		do {
			System.out.println("\n--- Menu ---");
			System.out.println("1. Add Account");
			System.out.println("2. Display All Accounts");
			System.out.println("3. Search Account by Number");
			System.out.println("4. Fund Transfer");
			System.out.println("5. Remove Account");
			System.out.println("6. Apply Interest");
			System.out.println("7. Sort by Account Number");
			System.out.println("8. Sort by Opening Date");
			System.out.println("0. Exit");
			System.out.print("Choice: ");
			choice = sc.nextInt();

			switch(choice){

			case 1:
				System.out.print("Enter AccNo, Name, Balance: ");
				int accNo = sc.nextInt();
				String name = sc.next();
				double bal = sc.nextDouble();

				accounts.add(new Account(accNo,name,bal));
				System.out.println("Account added: ");
				break;

			case 2:
				for(Account acc:accounts) {
					System.out.println(acc);
				}
				break;

			case 3:
				 System.out.print("Enter Account No: ");
				    int acNo = sc.nextInt();

				    try {
				        Account acc = findAccountByNo(accounts, acNo);
				        System.out.println(acc);
				    } catch (AccountNotFoundException e) {
				        System.out.println(e.getMessage());
				    }
				break;

			case 4 :
				System.out.print("FromAccNo, ToAccNo, Amount: ");
				int from = sc.nextInt(), to = sc.nextInt();
				double amt = sc.nextDouble();

				try {
					Account fromAcc = findAccountByNo(accounts, from);
					Account toAcc = findAccountByNo(accounts, to);

					fromAcc.withdraw(amt);
					toAcc.deposit(amt);
					System.out.println("Transfer successful.");
				} catch (AccountNotFoundException | MinBalException e) {
					System.out.println(e.getMessage());
				}


			case 5 :
				System.out.print("Enter A/C No to remove: ");
				int acNo1 = sc.nextInt();

				try {
					Account acc = findAccountByNo(accounts, acNo1);
					accounts.remove(acc);
					System.out.println("Account removed.");
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}

			case 6 : {
				for (Account a : accounts)
					a.applyInterest(5.0);
				System.out.println("Interest applied.");
			}

			case 7 : 
				for (Account a : accounts) {
				accounts.sort(Comparator.comparingInt(Account::getAccNo));
				System.out.println("Sorted by Account No.");
				System.out.println(a);
				}

			case 8 : {
				accounts.sort(Comparator.comparing(Account::getOpeningDate));
				System.out.println("Sorted by Opening Date.");
			}

			case 0 : System.out.println("Exiting...");

			default : System.out.println("Invalid choice.");

			}
		}while (choice != 0);
		sc.close();

	}
	public static Account findAccountByNo(List<Account> list, int accNo) throws AccountNotFoundException {
		for (Account a : list) {
			if (a.getAccNo() == accNo)
				return a;
		}
		throw new AccountNotFoundException("Account No " + accNo + " not found.");
	}

}
