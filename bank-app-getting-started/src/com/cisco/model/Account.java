package com.cisco.model;

public class Account {
	
	public double balance=0.0;	
	
	public Account(double balance) {
		// balance = balance ; problem ambiguity
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
	}
	
	public void withdraw(double amount) {
		if (this.balance>=amount) {	
			this.balance -= amount;
		}
		else {
			System.err.println("Insufficient balance");
		}
	}
}