package com.cdac.acts.Day9;
import java.time.LocalDate;
import java.time.Period;

import com.cdac.acts.Day9.Account;
public class CurrentAccount extends Account {

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CurrentAccount( String accountName, LocalDate doo, int balance) {
		super(accountName, doo, balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculateMatutyAmount(double principal) {
		// TODO Auto-generated method stub
		return principal;
	}

	@Override
	public double applyInterest() {
		System.out.println("balance in Current account");
		LocalDate TodayDate=LocalDate.now();
		Period period=Period.between(getDoo(),TodayDate);
		return period.getYears()*1.01; 
	}

	@Override
	public String toString() {
		return "CurrentAccount [getAccountNumber()=" + getAccountNumber() + ", getAccountName()=" + getAccountName()
				+ ", getDoo()=" + getDoo() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
