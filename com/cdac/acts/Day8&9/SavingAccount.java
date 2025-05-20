package com.cdac.acts.Day9;
import java.time.LocalDate;
import java.time.Period;
import com.cdac.acts.Day9.Account;
public class SavingAccount extends Account {
	private double interestRate;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SavingAccount( String accountName, LocalDate doo, int balance , double interestRate) {
		super( accountName, doo, balance);
		this.interestRate=interestRate;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateMatutyAmount(double principal) {
		 return principal + (principal * interestRate);
		
	}

	@Override
	public double applyInterest() {
		System.out.println("balance in savings account");
		LocalDate TodayDate=LocalDate.now();
		Period period=Period.between(getDoo(),TodayDate);
		return period.getYears()*1.03; 
	}
	

	@Override
	public String toString() {
		return "SavingAccount [getAccountNumber()=" + getAccountNumber() + ", getAccountName()=" + getAccountName()
				+ ", getDoo()=" + getDoo() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]" + "interestRate: " +interestRate ;
	}
	
	

	

}
