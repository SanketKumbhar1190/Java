package com.cdac.acts.Day5;
/*
 1. Write a menu driven java program to create an array of Accounts.

Menus:
1. Add account
2. Display balance of particular
3. Withdraw
4. Transfer
 */
public class Account {
	private static long counter = 123456789012L;
	private String name;
	private long accountNo;
	private double balance ;
	
	public Account(String name,double balance) {
		this.name=name;
		this.balance=balance;
		this.accountNo=counter;
		counter++;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setWithdrawAmount(double amount) {
		balance = balance-amount;
		System.out.println("Your new balance is :" +balance);
	}
	public void setAddAmount(double amount) {
		balance = amount + balance;
		System.out.println("Your new added balance is :" +balance);
	}
	
}
