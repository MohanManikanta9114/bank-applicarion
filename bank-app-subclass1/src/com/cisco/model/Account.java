package com.cisco.model;

public class Account {
	
	private double balance=0.0;	
	
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
	
	public void withdraw(double amount) {
		if( !isSufficientBalance(amount)){
			System.err.println("Insufficient balance");
		}
		else {
			this.balance-=amount ;
			System.out.println("Amount withdrawn successfully");
		}
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
}