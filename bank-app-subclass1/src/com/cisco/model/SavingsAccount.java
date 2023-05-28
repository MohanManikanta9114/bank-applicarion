package com.cisco.model;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount(double initialBalance, double interestRate) {
		// invoke a super class (Account) constructor
		// Account ( initialBalance ) ; invalid
		super ( initialBalance );//valid
	}
	public void addInterestRate() {
		double interest= getBalance()* interestRate / 100 ;
		deposit( interest );
		
	}
}
