/*
 * Create Depositable, Withdrwable , Maturable interfaces with methods.
Implement these interfaces in Account class hierarchy.
1) Depositable I/F
double depoist(double)
2) Withdrwable
double withdraw(double)
3) Muturable
double calculateMatutyAmount(double)
*/

package com.cdac.acts.Day9;
import java.time.LocalDate;

public abstract class Account implements Depositable, Withdrawable, Maturable {
    
	private long accountNumber ;
	private String accountName;
	private LocalDate doo;
	private int balance;
	private static long accgenerator = 8000111233L;
	
	public Account() {
		System.out.println("Inside default ctor ");
	}
	
	public Account( String accountName, LocalDate doo, int balance) {
		this.accountNumber = accgenerator ++ ;
		this.accountName = accountName;
		this.doo = doo;
		this.balance = balance;		
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public LocalDate getDoo() {
		return doo;
	}

	public void setDoo(LocalDate doo) {
		this.doo = doo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public double withdraw(double amount) {
		balance -= amount;
		return balance;
	}

	@Override
	public double deposite(double amount) {
		balance += amount;
		return balance;
	}

	@Override
	public abstract double calculateMatutyAmount(double principal);

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", doo=" + doo
				+ ", balance=" + balance + "]";
	}
	
	public abstract double applyInterest();
	
	
}
