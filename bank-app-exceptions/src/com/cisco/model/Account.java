package com.cisco.model;

public abstract class Account {
	
	protected double balance=0.0;	
	
	public Account(double balance) {
		// balance = balance ; problem ambiguity
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if ( amount <= 0) {
			System.out.println("Amount to be deposited should be positive");
		}
		else {
			this.balance+=amount;
			System.out.println("amount deposited successfully");
		}
		
	}
	
	public boolean isSufficientBalance ( double amount ) {
		return this.balance>=amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	// Make this withdraw as abstract method
	public abstract void withdraw(double amount) ;
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
}