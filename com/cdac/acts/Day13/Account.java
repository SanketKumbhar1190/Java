package com.cdac.acts.Day13;

import java.time.LocalDate;

public class Account {
    private int accNo;
    private String name;
    private double balance;
    private LocalDate openingDate;

	public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.openingDate = LocalDate.now();
    }

    public int getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) throws MinBalException {
        if (balance - amt < 1000)
            throw new MinBalException("Minimum balance must be 1000.");
        balance -= amt;
    }

    public void applyInterest(double rate) {
        balance += balance * rate / 100;
    }

    @Override
    public String toString() {
        return "AccNo: " + accNo + ", Name: " + name + ", Balance: " + balance + ", Opened: " + openingDate;
    }
}
