//Assignment 0: Add MinBalException for Account withdraw and QueueEmptyException for 
//Queue hierarchy. Use try, catch finally blocks.
//Try with resource should be used with Scanner

package com.cdac.acts.Day10;

public class Account {

	private int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(int amount) throws MinBalException {
		if(amount > balance) {
			throw new MinBalException("Minimum Balance Amount Reached");
		}
		balance -= amount;
		System.out.println("withdrawal successfull; balance remaining " +balance);
		
	}
	
			
	

}
