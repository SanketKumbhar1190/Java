package com.cdac.acts.Day11;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Account {

    private String accNo;
    private String accName;
    private LocalDate dateOfOpening;
    private double balance;

    public Account() {
        // Default constructor
    }

    public Account(String accNo, String accName, LocalDate dateOfOpening, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.dateOfOpening = dateOfOpening;
        if (balance > 1000) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance must be greater than 1000. Account not created.");
        }
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 1000) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be less than or equal to 1000.");
        }
    }

    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", accName=" + accName + ", dateOfOpening=" + dateOfOpening + ", balance="
                + balance + "]";
    }

    public double addBal(double amount) {
        return balance += amount;
    }

    public double withdBal(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("Withdrawal failed. Minimum balance of 1000 must be maintained.");
            return balance;
        }
    }

    // Method to display accounts with balances greater than or equal to a specified amount (Upper Bound)
    public static void displayAccountsWithUpperBound(List<? extends Account> accountList, double upperBound) {
        System.out.println("\n--- Accounts with balance greater than or equal to " + upperBound + " ---");
        for (Account acc : accountList) {
            if (acc.getBalance() >= upperBound) {
                System.out.println(acc);
            }
        }
    }

    // Method to display accounts with balances less than or equal to a specified amount (Lower Bound)
    public static void displayAccountsWithLowerBound(List<? super Account> accountList, double lowerBound) {
        System.out.println("\n--- Accounts with balance less than or equal to " + lowerBound + " ---");
        for (Object obj : accountList) { // Iterate through the list of Objects
            if (obj instanceof Account) { // Check if the object is an instance of Account
                Account acc = (Account) obj;  // Cast the Object to Account
                if (acc.getBalance() <= lowerBound) {
                    System.out.println(acc);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accountList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1.     Add account");
            System.out.println("2.     Print all accounts");
            System.out.println("3.     Create unmodifiable from existing list");
            System.out.println("4.     Use Upper bound (for balances >= specified amount)");
            System.out.println("5.     Use Lower bound (for balances <= specified amount)");
            System.out.println("7.     Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = scanner.nextLine();
                    System.out.print("Enter Account Name: ");
                    String accName = scanner.nextLine();
                    System.out.print("Enter Date of Opening (YYYY-MM-DD): ");
                    LocalDate dateOfOpening = LocalDate.parse(scanner.nextLine());
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    Account newAccount = new Account(accNo, accName, dateOfOpening, balance);
                    if (newAccount.getBalance() > 1000) {
                        accountList.add(newAccount);
                        System.out.println("Account added successfully.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- All Accounts ---");
                    if (accountList.isEmpty()) {
                        System.out.println("No accounts available.");
                    } else {
                        for (Account acc : accountList) {
                            System.out.println(acc);
                        }
                    }
                    break;

                case 3:
                    List<Account> unmodifiableAccountList = Collections.unmodifiableList(new ArrayList<>(accountList));
                    System.out.println("\nUnmodifiable list created.");
                    System.out.println("Attempting to modify the unmodifiable list...");
                    try {
                        unmodifiableAccountList.add(new Account("dummy", "dummy", LocalDate.now(), 1500));
                    } catch (UnsupportedOperationException e) {
                        System.out.println("Caught exception: " + e.getMessage());
                        System.out.println("Unmodifiable list cannot be modified.");
                    }
                    break;

                case 4:
                    System.out.print("Enter upper bound for balance: ");
                    double upperBound = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    displayAccountsWithUpperBound(accountList, upperBound);
                    break;

                case 5:
                    System.out.print("Enter lower bound for balance: ");
                    double lowerBound = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    displayAccountsWithLowerBound(accountList, lowerBound);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}