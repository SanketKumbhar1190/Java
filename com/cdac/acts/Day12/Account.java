package com.cdac.acts.Day12;

/*
1) Create Account class with accNo, accName, dateOfOpening,
balance (please note that you need to create new account class
and not to use existing account Hierarchy). Use LocalDate for
date of opening.

Validations:
1. Add validation for date of opening is not future date
2. balance should be more than 1000

Menu:

1. Add account
2. Print all accounts
3. Sort by account no desc
4. Sort by accName
5. Sort by Date of opening
6. Sort by balance desc
7. exit


 */

import java.time.LocalDate;

@SuppressWarnings("rawtypes")
public class Account implements Comparable<Account>{

    private int accNo;
    private String accName;
    private LocalDate dateOfOpening;
    private int balance;
    
    
	public Account(int accno2, String accName, LocalDate dateOfOpening, int balance) {
		super();
		this.accNo = accno2;
		this.accName = accName;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}


	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + "]";
	}
	
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return this.accName.compareToIgnoreCase(o.accName);
	}
	
	
}
