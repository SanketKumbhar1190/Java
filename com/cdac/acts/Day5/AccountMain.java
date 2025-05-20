package com.cdac.acts.Day5;

import java.util.Scanner;
import com.cdac.acts.Day5.Account;
/*
1. Write a menu driven java program to create an array of Accounts.

Menus:
1. Add account
2. Display balance of particular
3. Withdraw
4. Transfer
*/

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] A = new Account[2];
		int option = 0;
		do {
			System.out.println("\nEnter 1 to Add\nEnter 2 to check balance\nEnter 3 to Withdraw\nEnter 4 to add money\nEnter 0 to exit");
			option = sc.nextInt();
			switch(option) {
				case 1:
					for(int i  = 0;i < 2; i++) {
						System.out.println("Enter your name and ammount you want to add in account");
						String name = sc.next();
						double ammount = sc.nextDouble();
						A[i]=new Account(name,ammount);
						System.out.println("Entered name is : "+name +"amount: "+ammount+ "accno is: " +A[i].getAccountNo());

					}
					break;
				case 2:
					System.out.println("\nEnter your Account No :");
					long no= sc.nextLong();
					for(int i  = 0;i < 2; i++) {
						if(A[i].getAccountNo()==no) {
							System.out.println("balance : "+A[0].getBalance());
							break;
						}
					}
					break;
					
				case 3:
					System.out.println("Enter your Account no and amount you want to withdraw ");
					long acno = sc.nextLong();
					double amount = sc.nextDouble();
					for(int i = 0;i< 2;i++) {
						if(A[i].getAccountNo()==acno) {
							A[i].setWithdrawAmount(amount);
						}
					}
					break;
					
				case 4:

					System.out.println("Enter your Account no 1 and Account no 2 and ammount you want transfer");
					long no1 = sc.nextLong();
					long no2 = sc.nextLong();
					double amn = sc.nextDouble();
					int i =0,j=0;
					
					for(i = 0;i< 2;i++) {
						if(A[i].getAccountNo()==no1) {
							for(j = i+1;j<2;j++) {
								if(A[j].getAccountNo()==no2) {
									A[i].setWithdrawAmount(amn);
									A[j].setAddAmount(amn);
								}
							}
						}
						
					}

					break;
					
				case 0:
					System.out.println("Goodby!");
					break;
				default:
					System.out.println("Enter valid ammount");
					break;
			}
		}while(option!=0);
	}

}
