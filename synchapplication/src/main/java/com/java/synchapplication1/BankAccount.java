package com.java.synchapplication1;

public class BankAccount {
	private Integer balance;
	private Integer accountNumber;

	public BankAccount(Integer accountNumber, Integer initialBalance) {
		this.accountNumber = accountNumber;
		balance = initialBalance;
	}

	public BankAccount(Integer accountNumber) {
		this(accountNumber, 0);
	}

	public Integer getBalance() {
		return balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public synchronized void deposit(Integer amount) {
	    balance = balance + amount;
	    System.out.println(amount + " deposited by : " + Thread.currentThread().getName() + ", updated balance: " + balance);
	}
	public synchronized Integer withdraw(Integer amount) {
	    System.out.println(Thread.currentThread().getName() + " is trying to withdraw amount: " + amount + " from account: " + accountNumber);
	    if (amount > balance) {
	        System.out.println("not enough balance in account: " + accountNumber + " to withdraw");
	        System.out.println("returning zero to: " + Thread.currentThread().getName());
	        return 0;
	    }
	    this.balance = this.balance - amount;
	    System.out.println(Thread.currentThread().getName() + " successfully withdrow aomunt: " + amount + " from account: " + accountNumber);
	    System.out.println("updated balance: " + balance);
	    return amount;
	}
}