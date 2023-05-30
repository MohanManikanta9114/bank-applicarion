package com.cisco.model;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount(double initialBalance, double interestRate) {
		// invoke a super class (Account) constructor
		// Account ( initialBalance ) ; invalid
		super ( initialBalance );//valid
		this.interestRate = interestRate ;
	}
	public void addInterestRate() {
		
		System.out.println("Savings Account Balance : "+ getBalance());
		double interest= getBalance()* interestRate / 100 ;
		System.out.println("Interest :"+ interest);
		deposit( interest );
		
	}
}
