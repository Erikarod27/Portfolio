package com.pluralsight;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double charge(double amount) {
        return balance - amount;
    }
    public double pay(double amount) {
        return balance + amount;
    }
    @Override
    public double getValue() {
        return balance;
    }
    @Override
    public String toString() {
        return "Credit Card" +
                "\nName: " + getName() +
                "\nAccount Number: " + getAccountNumber() +
                "\nBalance: " + getValue();
    }
}
