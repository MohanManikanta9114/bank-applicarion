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
	
	@Override
	public void withdraw (double amount) {
		//TODO Auto-generated stub 
		if ( amount <= 0 ) {
			System.out.println("Amount to be withdrawn should be positive");
		}
		else if(!isSufficientBalance(amount)) {
			System.out.println("insufficient balance");
		}else {
			this.balance -=amount;
			System.out.println("Amount withdrawn successfully");
		}
	}
	
	
}
